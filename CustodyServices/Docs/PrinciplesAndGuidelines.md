# Principles and guidelines

In addition to specifying the the OpenWealth interface in a machine readable format (i.e. OpenApi spec), OpenWealth strives for a common understanding of business events. OpenWealth considers the common modelling of business events as important as the structural specification for an essential gain of imperoperability and reduction of implementation costs.
For this purpose a number of guidelines and principles have been elaborated:

## Positions

TBD

## Transactions

- Bottom up consistency of the movements in the ledger

The smallest unit of a transaction is the movement. It consists of a change in unit/amount of a particular financial instrument associated to an account. The movements in a transaction sum up to the net booking amount (posting amount for cash) of the particular instrument and account and the historic sum of units up to a particular date aggregate to the holdings from the position statement of the same date.

- No duplicate movements in separate statements

The same movement shall not be repeated in another transaction statement (for example in the closing statement if already present in the opening)

- Business event oriented modelling

All movements that result from a business event shall be contained in the same transaction statement, i.e. for a purchase of a stock: credit of stock units and dedit of the cash gross and fee amounts.

- Minimization of redundancies

Redundant information shall be minimized. For example the closing of a contract does not need to be sent if the expiry date is set at opening.

- Transaction date consistency

A transaction statement must only be sent at one particular date, the transaction date. This must be a RESTful operation and backward compatible. If amendments are made on a transaction at a later date, the transaction must be subject to the amendments log at the date of amendment (TBD)

- Transaction date vs movement date

The transaction date is the date of transaction entity - the relevant date for filtering by parameter in the relevant API endpoints. This date may differ from trade date, settlement date, and movement date of associated movements, yet often the are equal. The movement date is set on each movement associated to the transaction and is understood as the date when the movement was confirmed in the custodians ledger, typically corresponds with the booking date (or posting date) by the bank.
