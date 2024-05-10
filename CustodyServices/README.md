# OpenWealth Custody Services API

This API is part of the OpenWealth APIs for the connectivity between custody banks and WealthTechs (e.g. Portfolio Management Systems). This API allows the user to receive data from custody banks regarding accounts and positions. The API is designed to be used for either update end of day data batches or single near-realtime account/position information. Furthermore, this API allows the user to receive data from custody banks regarding transactions. In this version (2.0) only transactions which include effective cash or securities movements are in scope and corporate actions without any cash impact are delivered only on a informative basis.

The documentation covers these topics:

- [Overview and scope](#overview-and-scope)
- [Quick start](#quick-start)
- [Principles and guidelines](Docs/PrinciplesAndGuidelines.md)
- [Business objects and data entities](Docs/EntityModel.md)
- [Enumeration and types](#enumeration-and-types)
- [Use cases and examples](#use-cases-and-examples)

## Overview and scope

As a first step OpenWealth has decided to support the exchange of data out of the view of an external asset manager (EAM) or alike in the sense of enhancing the ways the EAMs technology provider (i.e. Portfolio Management Solutions) query data. The custody services API provides a set of read only services for portfolio, account, position and transaction information. An EAM is typically authorized on a set of customers of a custodian bank with a power of attorney on a subset of accounts (safekeeping & cash accounts).
The technology provider will access the APIs with the EAM access token and first retrieve a list of authorized clients containing the authorized accounts. In the next step position statements can be queried either by customer or by account and transaction statements are available by customer, account or position.

## Quick start

TBD

- How to use the OpenAPI spec
- What is contained in the specs
- How to implement the spec
- Positions API
- Transactions API

## Enumeration and types

The main strategy to categorize (bankable) wealth and associated business events that cause change in wealth or the underlying risk are the following:

- [Financial Instrument Types](Docs/FinancialInstrumentTypes.md)
- [Transaction and Movement Types](Docs/TransactionAndMovementTypes.md)

The financial instrument type characterizes a monetary contract, which confers a right or claim against some counterparty in the form of a payment, equity ownership or dividends (stocks), debt (bonds, loans, deposit accounts), currency (forex), or derivatives (futures, forwards, options, and swaps). In a technical way the financial instrument type further defines the properties (mandatory and optional) to fully describe the asset.

The transaction types categorize business events (Geschäftsvorfälle). A business event typically results in one or multiple movements - changes of holdings of a position. The transaction type enforces restrictions on its content resulting in guidelines for the implementation of the data object (technical structure, mandatory and optional fields, consistency checks). A dividend payment for example typically consists of a triggering instrument, a gross movement (amount) of cash changed and a withholding tax movement. The typing of these partial movement is described by the movement type enumerator.

## Use cases and examples

### A portfolio life cycle

A good way to get familiar with the needs of a securities accounting is to look at a simple life cycle of a portfolio. Each business event in this life cycle should be interchangeable on a digital data level between the bank and the 3rd party system (EAM software). Business events related to the customer information (such as identification, forms, compliance etc.) are covered by OpenWealths Customer Management API (link TBD). Events related to the customers wealth, such as transfer of funds, investements etc. are covered by the Custody Services API. In the following we will link custody events to example and reference implementation of the API schemes. The chronological events could look like the following:

- EAM signs wealth management contract of a discretionary mandate with customer and sends onboarding docs to the chosen custody
- EAM requests opening of a safekeeping account and on or more cash accounts (i.e. CHF, EUR, USD)
- Transfer of funds to CHF account, 500'000 CHF
- purchase of n Credit Suisse stocks for 50'000 CHF
- purchase of m Apple stocks for 100'000 CHF -> FX involved
- Buy Swiss Government Bond 200.000 CHF
- Buy Apple put option
- Apple Put Option expires
- Spot FX for example CHF/EUR
- Sell 100'000 USD forward rate at 90'000 CHF 6 month -> Hedgeing of DOllar exposure
- Dividend payment Apple stock with FX and reclaimable tax
- Coupon payment Swiss Govern Bond in CHF
- Swapping of forward contract before expiry
- Maturity of Swiss Govern Bond
- Final coupon Swiss Govern Bond
- Purchase of Mutual Fund with Bond payback
- Partial sell of Apple stock
- Deposit of 200.000 CHF fixed term, maturity date fixed
- Interest-paid deposit on a monthly basis
- Maturity of the deposit, including last interest
- Callable loan, with limit of 500000 CHF, initial of 200.000 CHF
- Loan increase of 100.000 CHF
- Decrease by 200.000 CHF
- Final settlement of 100.000CHF, closing of the loan, final interest payment
- Management fee
- Custodian fee
- Customer unhappy with EAM -> transfer of portfolios and funds, closing of portfolio
