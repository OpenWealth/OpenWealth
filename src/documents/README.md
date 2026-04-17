# Documents API

Version: `1.0.0-draft` | License: [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0.html) | Contact: openwealth@synpulse.com

This is the OpenAPI specification for the Documents API plugin. It is designed to be integrated into existing business APIs and manages document lifecycle within cases.

The entry point is [`API.yaml`](API.yaml). Path definitions are split into individual files under [`paths/`](paths/).

---

## Concepts

The API is built around two core resources:

- **Case** — a lifecycle process (e.g. an onboarding or review workflow) that groups related documents.
- **Document** — a file (with metadata) attached to a case. Content is uploaded separately from metadata.

### Document Upload Workflow

Uploading documents follows a structured sequence:

1. **Create a case** (`POST /cases`)
   Start by creating a case that will act as the container for all related documents. Use the `businessContext` property to attach any type-specific, context-relevant information to the case — its structure is flexible and depends on the case type (e.g. mandate opening details, client identifiers, or workflow-specific fields).

2. **Attach document metadata** (`POST /cases/{caseId}/documents`)
   For each document, create a metadata record linked to the case. This registers the document and returns a `documentId` that is used in subsequent steps. One or more documents can be attached to the same case.

3. **Upload binary content** (`PUT /cases/{caseId}/documents/{documentId}/content`)
   For each document, upload the raw file content as `application/octet-stream`. Chunked uploads are not supported — the server returns `201` for each accepted chunk and `200` once the final chunk completes the file.

4. **Submit the case** (`POST /cases/{caseId}/actions/{action}`)
   Once all documents have been uploaded, trigger the `submit` action to advance the case in its lifecycle. The action endpoint also supports `cancel` to abort the case.

---

## Endpoints

### Cases

| Method | Path | Operation | Description |
|--------|------|-----------|-------------|
| `GET` | `/cases` | `getCases` | List all cases accessible to the querying user. Supports cursor-based pagination. |
| `POST` | `/cases` | `createCase` | Create a new case. |
| `GET` | `/cases/{caseId}` | `getCaseById` | Retrieve a specific case by ID. |
| `PUT` | `/cases/{caseId}` | `updateCaseById` | Replace an existing case. |
| `DELETE` | `/cases/{caseId}` | `deleteCaseById` | Delete a case. Returns `204` on success. |
| `POST` | `/cases/{caseId}/actions/{action}` | `actionOnCase` | Trigger a lifecycle action on a case (e.g. submit, approve). Returns `202 Accepted`. |

### Documents

| Method | Path | Operation | Description |
|--------|------|-----------|-------------|
| `GET` | `/cases/{caseId}/documents` | `getDocuments` | List documents for a case, each including its metadata. Supports cursor-based pagination. Note: search requests should use `POST`, not `GET`, to avoid CID data appearing in logs. |
| `POST` | `/cases/{caseId}/documents` | `addDocument` | Upload metadata for a new document. The binary content is uploaded separately. |
| `GET` | `/cases/{caseId}/documents/{documentId}` | `getDocument` | Retrieve the metadata of a specific document. |
| `PATCH` | `/cases/{caseId}/documents/{documentId}` | `patchDocument` | Amend the metadata of an existing document. Returns `204` on success. |
| `PUT` | `/cases/{caseId}/documents/{documentId}/content` | `uploadDocumentContent` | Upload the binary content of a document. Supports chunked uploads — returns `201` per accepted chunk and `200` when the final chunk completes the file. |
| `GET` | `/cases/{caseId}/documents/{documentId}/content` | `getDocumentContent` | Download the binary content of a document as `application/octet-stream`. |

---

## Common Headers

| Header | Direction | Description |
|--------|-----------|-------------|
| `X-Correlation-ID` | Request & Response | Used for request tracing across services. |
| `X-Next-Cursor` | Response | Present on paginated list responses when more results are available. |

---

## Pagination

List endpoints (`GET /cases`, `GET /cases/{caseId}/documents`) use cursor-based pagination via the `cursor` and `limit` query parameters. The next page cursor is returned in the `X-Next-Cursor` response header.

---

## File Structure

```
src/documents/
├── API.yaml                                              # OpenAPI entry point
└── paths/
    ├── cases.yaml                                        # GET /cases, POST /cases
    ├── cases_{caseId}.yaml                               # GET/PUT/DELETE /cases/{caseId}
    ├── cases_{caseId}_actions_{action}.yaml              # POST /cases/{caseId}/actions/{action}
    ├── cases_{caseId}_documents.yaml                     # GET/POST /cases/{caseId}/documents
    ├── cases_{caseId}_documents_{documentId}.yaml        # GET/PATCH /cases/{caseId}/documents/{documentId}
    └── cases_{caseId}_documents_{documentId}_content.yaml # GET/PUT /cases/{caseId}/documents/{documentId}/content
```
