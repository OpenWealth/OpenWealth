# Documents API

Version: `1.0.0-draft` | License: [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0.html) | Contact: openwealth@synpulse.com

This is the OpenAPI specification for the Documents API plugin. It is designed to be integrated into existing business APIs and manages document lifecycle within cases.

---

## Concepts

The API is built around two core resources:

- **Case** — a lifecycle process (e.g. an onboarding or review workflow) that groups related documents.
- **Document** — a file (with metadata) attached to a case. Content is uploaded separately from metadata.

### Document Upload Workflow

Uploading documents follows a structured sequence:

1. **Create a case** (`POST /cases`)
   Start by creating a case that will act as the container for all related documents. Use the `content` property to attach any type-specific, context-relevant information to the case — its structure is flexible and depends on the case type (e.g. mandate opening details, client identifiers, or workflow-specific fields).

2. **Attach document metadata** (`POST /cases/{caseId}/documents`)
   For each document, create a metadata record linked to the case. This registers the document and returns a `documentId` that is used in subsequent steps. One or more documents can be attached to the same case.

3. **Upload binary content** (`PUT /cases/{caseId}/documents/{documentId}/content`)
   For each document, upload the raw file content as `application/octet-stream`. Chunked uploads are not supported.

4. **Submit the case** (`POST /cases/{caseId}/actions/submit`)
   Once all documents have been uploaded, trigger the `submit` action to hand the case over to the bank. The action endpoint also supports `cancel` to withdraw the case.

### Case Lifecycle

The case `status` is read-only. It changes only through the bank's workflow or through the `submit` and `cancel` actions.

| Status | Description |
|--------|-------------|
| `draft` | Created by the API consumer and not yet submitted. |
| `submitted` | Submitted by the API consumer and waiting to be picked up by the bank. |
| `actionRequired` | Returned by the bank because further information or documents are needed (see `statusReasonList` and `outputList`). |
| `inProgress` | Being processed by the bank. |
| `pendingApproval` | Processed by the bank and waiting for internal approval. |
| `approved` | Approved by the bank; the resulting resources are being set up. |
| `rejected` | Final. Declined by the bank (see `statusReasonList`). |
| `completed` | Final. Processing finished; created or modified resources are listed in `outputList`. |
| `cancelled` | Final. Withdrawn by the API consumer. |

The status determines which operations are allowed:

| Status | Update case | Add / change documents | `submit` | `cancel` |
|--------|-------------|------------------------|----------|----------|
| `draft` | ✅ | ✅ | ✅ | – |
| `submitted` | – | – | – | ✅ |
| `actionRequired` | ✅ | ✅ | ✅ | ✅ |
| `inProgress` | – | – | – | request |
| `pendingApproval` | – | – | – | request |
| `approved`, `rejected`, `completed`, `cancelled` | – | – | – | – |

A `cancel` in `inProgress` or `pendingApproval` is a request the bank may decline; the status is then unchanged and the reason is given in `statusReasonList`. Operations that are not allowed in the current status are answered with `409 Conflict`.

---

## Endpoints

### Cases

| Method | Path | Operation | Description |
|--------|------|-----------|-------------|
| `GET` | `/cases` | `getCases` | List all cases accessible to the querying user. Supports cursor-based pagination. |
| `POST` | `/cases` | `createCase` | Create a new case. |
| `GET` | `/cases/{caseId}` | `getCaseById` | Retrieve a specific case by ID. |
| `PUT` | `/cases/{caseId}` | `updateCaseById` | Update an existing case. |
| `POST` | `/cases/{caseId}/actions/{action}` | `actionOnCase` | Trigger a lifecycle action on a case (`submit` or `cancel`). Returns `202 Accepted`. |

### Documents

| Method | Path | Operation | Description |
|--------|------|-----------|-------------|
| `GET` | `/cases/{caseId}/documents` | `getDocuments` | List documents for a case, each including its metadata. Supports cursor-based pagination. |
| `POST` | `/cases/{caseId}/documents` | `addDocument` | Upload metadata for a new document. The binary content is uploaded separately. |
| `GET` | `/cases/{caseId}/documents/{documentId}` | `getDocument` | Retrieve the metadata of a specific document. |
| `PUT` | `/cases/{caseId}/documents/{documentId}` | `updateDocument` | Replace the metadata of an existing document. Returns the updated document. |
| `PUT` | `/cases/{caseId}/documents/{documentId}/content` | `uploadDocumentContent` | Upload the binary content of a document, replacing any existing content. |
| `GET` | `/cases/{caseId}/documents/{documentId}/content` | `getDocumentContent` | Download the binary content of a document as `application/octet-stream`. |

Updates use `PUT` with full replacement semantics: the complete metadata must be sent, and properties that are omitted are removed. Read-only properties (`id`, timestamps, `relatedResource`) are ignored.

---

## Common Headers

| Header | Direction | Description |
|--------|-----------|-------------|
| `Correlation-Id` | Request & Response | Used for request tracing across services. |
| `Next-Cursor` | Response | Present on paginated list responses when more results are available. |

---

## Pagination

List endpoints (`GET /cases`, `GET /cases/{caseId}/documents`) use cursor-based pagination via the `cursor` and `limit` query parameters. The next page cursor is returned in the `Next-Cursor` response header.

---

## File Structure

```
src/documents/
├── API.yaml                                              # OpenAPI entry point
├── components/
│   ├── examples/                                         # Request and response examples
│   ├── parameters/
│   │   └── action.yaml                                   # Case actions (submit, cancel)
│   └── schemas/
│       ├── Case.yaml
│       ├── Document.yaml
│       ├── RelatedResource.yaml
│       └── StatusReason.yaml
└── paths/
    ├── cases.yaml                                        # GET /cases, POST /cases
    ├── cases_{caseId}.yaml                               # GET/PUT /cases/{caseId}
    ├── cases_{caseId}_actions_{action}.yaml              # POST /cases/{caseId}/actions/{action}
    ├── cases_{caseId}_documents.yaml                     # GET/POST /cases/{caseId}/documents
    ├── cases_{caseId}_documents_{documentId}.yaml        # GET/PUT /cases/{caseId}/documents/{documentId}
    └── cases_{caseId}_documents_{documentId}_content.yaml # GET/PUT /cases/{caseId}/documents/{documentId}/content
```
