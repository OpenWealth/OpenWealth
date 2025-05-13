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
        object externalAssetManager
    }
    Person {
        string id
        enum type "natural, legal or joint"
        string externalReference
        object countryOfDomicile
        object[] taxDomicileList
        enum politicalStatus
        object[] employmentList
        object[] educationList
        object fatca
    }
    CustomerPersonRelation {
        string id
        enum type
        string cardinality
        string personId
        string relatedCustomerId
        string purposeOfRelationship
        boolean soleBeneficialOwner
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
        object[] personList
        string purposeOfRelationship
        object fundFlows
        object sourceOfWealthInformation
        object totalWealth
        object totalIncome
        object employmentInformation
        object educationInformation
        object politicalStatus
        object fatca
        object[] corporateInsiderList
        object[] majorShareholderList
        object externalAssetManager
    }
    SourceOfWealth {
        string id
        string type
        object amount
        object[] countriesOfOrigin
        object additionalProperties "type specific properties"
    }
    FundFlows {
        object amountExpectedInflows
        object amountPlannedTotalAssets
        object amountExpectedTurnover
        integer numberOfInflows
        integer numberOfOutflows
        object[] recurringCounterpartyList
        object[] initialAmountList
        object[] expectedFundFlowList
    }
    TotalWealth {
        object amountTotalNetAssets
        object referenceYear
        object[] assetAllocation
    }
    TotalIncome {
        object amountYearlyIncome
        object referenceYear
        object[] sourceOfIncomeList
    }
    Employment {
        string companyName
        object companyDomicile
        object[] companyCountriesOfBusinessList
        string companyDetail
        integer companyNumberOfEmployees
        number companyAnnualTurnover
        string industry
        object roleOrPosition
        profession profession
        string domicile
        number shareholdingInPercent
        object period
        integer yearOfRetirement
        integer sharedholderSinceYear
        string mandate
        string additionalInformation
    }
    Education {
        string highestDiploma
        integer graduationYear
        string institute
        string studyProgramme
    }
    Fatca {
        boolean status
        boolean domicile
        boolean birthplace
        boolean greenCard
        boolean substantialPresenceTest
        boolean otherReasons
    }
    CorporateInsider {
        string corporateInsiderAssociation
        string relation
        object position
        string companyName
        string isin
    }
    MajorShareholder {
        string majorShareholderAssociation
        string relation
        string companyName
        string isin
    }
    Customer ||--|{ CustomerPersonRelation : hasMultiple
    Customer ||--o{ Document : hasMultiple
    Customer ||--o{ KYC : hasMultiple
    CustomerPersonRelation }o--|| Person : hasMultiple
    PersonPersonRelation }o--|| Person : hasMultiple
    PersonPersonRelation }o--|| Person : isRelatedPerson
    Person ||--o{ Address : hasMultiple
    Person ||--o{ Contact : hasMultiple
    Person ||--o{ SourceOfWealth : hasMultiple
    Person ||--o| Employment : hasOne
    Person ||--o| Education : hasOne
    Person ||--o| Fatca : hasOne
    Person ||--o{ CorporateInsider : hasMultiple
    Person ||--o{ MajorShareholder : hasMultiple
    KYC ||--o{ FundFlows : hasMultiple
    KYC ||--o| TotalWealth : hasOne
    KYC ||--o| TotalIncome : hasOne
```