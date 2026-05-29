In the following the essential data objects, their relations and their interface representation are described. The conventions are highlighted and the common understanding of these objects are outlined.

- [Customer](#customer)
- [Person](#person)
- [Mandate](#mandate)
- [Account](#account)
- TBD

## Highlevel entities

```mermaid
erDiagram

    Customer {
        *string type "single, joint, etc"
        string status
        *string name
        string segment
        string mainAddress
        object[] personRelationList "function, signature etc."
    }

    Mandate {
        string type
        string strategy
        object[] feeList
        object[] accountList
        object[] correspondenceList
        object[] powerOfAttorneyList
        object[] expectedFundFlowList
    }

    Person {
        *string type "natural, legal"
        string name
        date birthDate
        string countryOfDomicile
        object[] addressList
        object[] taxStatusList
        object[] educationList
        object[] employmentList
        object[] wealthSourcesList
        boolean isPep
        boolean isFatca 
    }

    Account {
        *string type "safekeeping, cash"
        *string number
    }

    Correspondence {
        object address
        object contact
    }

    customerToPersonRelation {
        string function
        string signature
        object person
    }

    Customer ||--|{ customerToPersonRelation : "has multiple" 
    Customer ||--o{ Mandate : "has multiple" 

    Mandate ||--o{ Account : "has multiple Products/Accounts" 
    Mandate ||--o{ Correspondence : "has multiple" 
    
    customerToPersonRelation }o--|| Person : "has multiple" 
    Person }o--|| Person : "has multiple family members etc." 

```

## Customer

A customer is the person or entity that enters into a contractual agreement with the custodian and in our case the external asset manager. It serves as the legal and operational anchor under which one or more mandates are managed.
Under Swiss law, the customer may be:
- A single natural or legal person, or
- Multiple persons acting jointly, such as:
  - Joint account holders
  - Simple partnerships (einfache Gesellschaft) formed for shared asset ownership
  - Other multi‑party arrangements with collective rights and obligations

```mermaid
erDiagram
    Customer {
        *string id ""
        string externalReference
        *string type ""
        enum status ""
        *string name
        string openingDate
        string referenceCurrency
        string language
        enum customerSegment
        *object[] purposeOfRelationship
        string additionalInformationPurpose
        *object[] customerToPersonRelationList
    }
```

## Person

A person is any entity that the law recognizes as having rights and obligations.
This includes:
- Natural persons — human beings with inherent legal capacity from birth.
- Legal persons — organizations or entities (such as corporations, associations, or foundations) that are granted legal personality by law, enabling them to act, own property, enter contracts, and be held liable.

```mermaid
erDiagram
    NaturalPerson {
        *string id
        *enum type "natural"
        *string language
        string openingDate
        *string givenName
        string middleName
        *string lastName
        string title
        string gender
        string etc
        %% *object[] nationalityList
        %% enum civilStatus
        %% *string dateOfBirth
        %% string dateOfDeath
        %% string dateOfMarriage
        %% string countryOfBirth
        %% string countryOfDomicile
        %% *object[] taxDomicileList
        %% *object[] addressList
        %% *object[] contactList
        %% object[] tinList
        %% object[] employmentList
        %% object[] educationList
        %% object[] riskDocumentationItemList
        %% boolean isFATCA
        %% boolean isPEP
    }
    LegalPerson {
        *string id
        *enum type "legal"
        string openingDate
        string etc
    }
```

## Mandate

A mandate is a contractual agreement under Swiss law in which a customer (the principal) instructs an asset/wealth manager (the agent) to manage their assets with care and in the customer’s best interest.
It is governed primarily by the rules on Auftrag (Art. 394 ff. OR).

```mermaid
erDiagram
    Mandate {
        *string id
        *enum type "discretionary, advisory, executionOnly, cashOnly"
        string openingDate
        string purposeOfContract
        object[] accountList
        object[] correspondenceList
        object[] powerOfAttorneyList
    }
```

## Account

An account is a defined contractual relationship with a custodian bank used to record, hold, and administer a client’s assets or cash.
It serves as the operational container through which safekeeping, transactions, and reporting are executed.

**Key characteristics**
- Identifies and segregates the client’s assets (cash, securities, other financial instruments).
- Exists in various forms (e.g., cash account, securities/safekeeping account, FX account) depending on the asset type.
- Opened and maintained by the custodian in the name of the client (single or joint).
- Forms the operational basis for executing the external asset manager’s mandate.

```mermaid
erDiagram
    Account {
        *string id
        *enum type "cash, safekeeping, other"
        string number
        string currency
    }
```