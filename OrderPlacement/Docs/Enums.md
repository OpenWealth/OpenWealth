# Enumerations

## orderStatus

 Enum | Description |
| --- | --- |
| accepted | The order including allocations has been validated as the service provider has run its (pre-)trade checks against rules, restrictions and other constraints. The order may remain in this state for a longer time, for example, if the order is placed after closure of the market, it may stay inside the service provider’s system until the market opens and the order is placed at the market. Note that the order has not yet been sent to the market. |
| acknowledged | The order has been submitted successfully to the service provider and is confirmed to be syntactically correct (i.e. correct in form and format). Note that the service provider has not yet accepted the order to be placed at the market as no (pre-)trade checks have been run yet. |
| cancelled | The order had no executions (no fills) and is confirmed to be cancelled. This is a terminal state. |
| customerRelease | Before the accepted order can be placed the customer may have to confirm the order (2FA, MFA). Until the confirmation to release the order happens the order stays in this state (except it is cancelled or it expires) |
| executed | The completely filled order has been allocated to the client(s) and is confirmed to be (fully) executed. This is a terminal state. |
| expired | The order had no executions (no fills) and is confirmed to be expired. This is a terminal state. |
| filled | The order has been fully executed. |
| marketCancelled | Description |
| marketExpired | Description |
| marketRejected | Description |
| partiallyCancelled | The partially filled order has been allocated to the client(s) and is confirmed to be cancelled. Note that the cancelled order contains partial executions and their corresponding allocations. This is a terminal state. |
| partiallyExpired | The partially filled order has been allocated to the client(s) and is confirmed to be expired. This is a terminal state. |
| partiallyFilled | The order has been patially executed |
| partiallyRejected | The partially filled order has been allocated to the client(s) and is confirmed to be rejected. This is a terminal state. |
| pendingCancel | The order is flagged for cancellation and not successfully processed nor confirmed yet. Note that should the cancellation not be possible, the state of the order might return to its previous state. |
| placed | The order has been placed at the market (or at another counter party). |
| rejected | The order had no executions (no fills) and is confirmed to be rejected. This is a terminal state. |


## eventType

| Enum | Description |
| --- | --- |
| heartbeat | This event is sent to check if the receiving server is responsive. |
| order:doneForDay | Order not, or partially, filled; no further executions forthcoming for the trading day |
| order:orderStatusUpdate | Status of the order has changed |
| order:pendingReplace | Description |
| order:replace | Description |
| order:restate | Description |
| order:suspend | Order has been placed in suspended state. |
| order:trade | Fill or partial fill on the order. |
| order:tradeCancel | A previously traded execution is deemed invalid |
| order:tradeCorrect | Description |

## financialInstrumentIdentification Type

| Enum | Description |
| --- | --- |
| belgian | Identifier for Belgian securities. |
| bloomberg | Identifier of a security assigned by the Bloomberg organisation. |
| common | Identifier of securities issued in Luxembourg. The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes. |
| cta | Identifier of a security assigned by the Consolidated Tape Association. |
| cusip | Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security. Non-US securities have a similar number called the CINS number. |
| dutch | Identifier for Dutch securities. |
| isin | International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country. |
| otherProprietaryIdentification | Proprietary identification of the security assigned by an institution or organisation. |
| quick | Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments. |
| ric | Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, for example, IBM in UK is IBM.UK. |
| sedol | Stock Exchange Daily Official List (SEDOL) number. A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number. |
| sicovam | Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France. The Sicovam is composed of 5-digits. |
| tickerSymbol | Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, for example, RTR.L for Reuters quoted in London. |
| valoren | Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency. |
| wertpapier | Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities. |