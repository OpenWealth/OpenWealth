# Business objects and data entities

In the following we will describe the essential data objects, their relations and their interface represenation. We will highlight conventions an try to enhance a common understanding of these objects.

- [Customer](#customer)
- [Person](#person)
- [Customer Relation](#customer-relation)
- [Person Relation](#person-relation)
- [KYC](#kyc)


## Customer

Customer entity describes the business parter (Vertragspartner) of the bank. The customer has persons (legal and natural) with certain roles associated to him.

## Person


## Customer Relation

TBD

## Person Relation

TBD

## KYC

**Entity Relationships of a position**

```mermaid
erDiagram

    Customer {
        string id
        string status
        string name
        string referenceCurrency
        string segment
    }
    Person {
        string id
        enum type "natural, legal or joint"
        string externalReference
        object countryOfDomicile
        object[] taxDomicileList
    }
    CustomerPersonRelation {
        string id
        enum type
        string cardinality
        string personId
        string relatedCustomerId
    }
    PersonPersonRelation {
        string id
        enum type
        string personId
        string relatedPersonId
    }
    Address {
        string id
        enum type
        string personId
        string address
    }
    Contact {
        string id
        enum medium
        enum prio
        string content
    }
    Document {
        string id
        string customerId
        enum group
        enum type
        enum status
        date issueDate
        string content
    }
    KYC {
        string id
        string personId
        string purposeOfRelationship
        boolean soleBeneficialOwner
        enum politicalStatus
        object fundFlows
        object[] sourceOfWealthList
        object totalWealth
        object totalIncome
        object employment
        object education
        object fatca
        object[] corporateInsiderList
        object[] corporateInsiderRelationList
        object[] majorShareholderList
        object[] majorShareholderRelationList
        object externalAssetManager
    }
    SourceOfWealth {}
    FundFlows {}
    TotalWealth {}
    TotalIncome {}
    Employment {}
    Education {}
    Fatca {}
    CorporateInsider {}
    CorporateInsiderRelation {}
    MajorShareholdet {}
    MajorShareholderRelation {}
    ExternalAssetManager {}
    Customer ||--|{ CustomerPersonRelation : hasMultiple
    Customer ||--o{ Document : hasMultiple
    CustomerPersonRelation }o--|| Person : hasMultiple
    PersonPersonRelation }o--|| Person : hasMultiple
    PersonPersonRelation }o--|| Person : isRelatedPerson
    Person ||--o{ Address : hasMultiple
    Person ||--o{ Contact : hasMultiple
    Person ||--o{ KYC : hasMultiple
    Person ||--o{ SourceOfWealth : hasMultiple
    KYC ||--o{ FundFlows : hasMultiple
    KYC ||--o| TotalWealth : hasOne
    KYC ||--o| TotalIncome : hasOne
    KYC ||--o| Employment : hasOne
    KYC ||--o| Education : hasOne
    KYC ||--o| Fatca : hasOne
    KYC ||--o{ CorporateInsider : hasMultiple
    KYC ||--o{ CorporateInsiderRelation : hasMultiple
    KYC ||--o{ MajorShareholdet : hasMultiple
    KYC ||--o{ MajorShareholderRelation : hasMultiple
    KYC ||--o| ExternalAssetManager : hasOne
```