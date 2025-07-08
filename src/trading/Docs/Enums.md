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
| marketCancelled | Market has accepted the cancellation of the outstanding amount of the order. |
| marketExpired | Expiry of the order at the placed exchange  |
| marketRejected | Market or broker side rejection of the order. |
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
| order:doneForDay | Order not, or partially, filled; no further executions forthcoming for the trading day. |
| order:orderStatusUpdate | Status of the order has changed |
| order:pendingReplace | Order with an Order Cancel/Replace Request pending . This does not indicated that the order has been replaced. |
| order:replace | The replacement of the order has been successful. |
| order:restate | Sell-side adjustement of an order without the electronical request of the customer. This is used for orders and corporate actions, changes communicated verbally to the sellside either due to normal business practices or as an emergency measure when electronic systems are not available, repricing of orders by the sellside (such as making Sell Short orders compliant with uptick / downtick rules), or other reasons (Broker option). |
| order:suspend | Order has been placed in suspended state. |
| order:trade | Fill or partial fill on the order. |
| order:tradeCancel | A previously traded execution is deemed invalid. Trade Cancel applies at the execution level and is used to cancel an execution which has been reported in error. |
| order:tradeCorrect | Trade Correct applies at the execution level and is used to modify an incorrectly reported fill. |

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

## executionType

| Enum | Description |
| --- | --- |
| limit | The requested execution type is a limited order Therefore, a limitPrice needs to be indicated |
| market | The order should be executed at market price |
| stop | The requested execution type is a stop order Therefore, a stopPrice needs to be indicated |
| stopLimit | The requested execution type is a stopLimit order Therefore, a stopPrice and limitPrice need to be indicated |

## timeInForce

| Enum | Description |
| --- | --- |
| atCrossing | An order that is valid only during crossing (auction) phases |
| atTheClose | Indicated price is to be around the closing price, however, not held to the closing price |
| atTheOpening | A market or limit-price order to be executed at the opening of the stock or notat all; all or part of any order not executed at the opening is treated as canceled |
| day | A buy or sell order that, if not executed expires at the end of the trading day on which it was entered |
| fillOrKill | A market or limit-price order that is to be executed in its entirety as soon as it is represented in the Trading Crowd; if not so executed, the order is to be canceled. Not to be confused with Immediate or Cancel. |
| goodForAuction | An order that is valid for an auction initiated by a trading firm |
| goodForMonth | An order that is valid until the end of the current month, i.e. from the time of order submission until the end of the last trading day of the current month |
| goodForTime | Not used - The order remains valid for a specified time period |
| goodThroughCrossing | An order that is valid up till and including a crossing phase |
| goodTillCancel | An order to buy or sell that remains in effect until it is either executed or canceled; sometimes called an "open order" |
| goodTillCrossing | An order to buy or sell that is canceled prior to the market entering into an auction or crossing phase |
| goodTillDate | The order remains valid until the end of the specified date |
| immediateOrCancel | A market or limit-price order that is to be executed in whole or in part as soon as it is represented in the Trading Crowd; any portion not executed is to be canceled. Not to be confused with Fill or Kill. |


## Cancellation and Rejection Reasons
### Orders

| Enum | Description |
| --- | --- |
| allocationInvalid | Indicates on the order level, that there some error with an allocation within this order |
| cancelledByHub | Receiving party cancelled the received order |
| cancelledByInstructingParty | Instructing party cancelled the order |
| cancelledByOther | Any other party than instructing party or hub cancelled the order (e.g. exchange, broker, etc.) |
| cannotContainMarketIdentificationAndMarketDescription | Place of trade cannot contain market identification and market description at the same time |
| currencyNotSupportedForFinancialInstrument | The chosen currency is not available for the selected financialInstrument |
| endOfLife | Order reached the endOfLife (e.g. due to expiry) |
| executionTypeInconsequential | Inconsequencial executionType |
| executionTypeNotSupported | Execution type not supported |
| expiryDateTimeInThePast | expiryDateTime cannot be in the past |
| expiryDateTimeMissing | expiryDateTime is missing |
| expiryDateTimeNotAllowed | expiryDateTime not allowed due to rules of the stock exchange |
| financialInstrumentIdentificationNotUnique | Identification of the financial instrument is not unique, e.g. due to missing characters |
| financialInstrumentIdentificationTypeNotSupported | The selected type of the financial instrument is not implemented |
| financialInstrumentNotAllowedViaInterface | The financial instrument is not permitted for trading via Order Placement interface |
| financialInstrumentNotFound | FinancialInstrument not found |
| financialInstrumentNotTradedOnMarket | Instrument not traded on indicated market |
| icebergOrderTooLarge | Iceberg order too large |
| invalidPrices | Invalid prices, e.g. the indicated price is to far of the current market value or the indicated price is provided with the wrong price type |
| limitPriceMissingForExecutionType | LimitPrice is missing. (for executionTypes limit and stopLimit) |
| limitPriceNotAllowedForExecutionType | LimitPrice is not allowed for executionType market or stop |
| marketCurrentlyBlockedForTrading | Market is currently blocked for trading |
| marketQuoteNotAvailableForProduct | Market quotes not available for given product |
| maximumNumberOfAllocationsExceeded | Bank-specific limitation regarding the number of allocations within one order |
| numberOfAllocationsDeviateFromAllocationsProvided | The numberOfAllocations deviate from the number of allocations provided under requestedAllocationList |
| numberOfAllocationsEmpty | numberOfAllocations cannot be empty. Use “1” for single orders. |
| numberOfAllocationsZero | numberOfAllocations equals to zero is not allowed Use “1” for single orders |
| orderQuantityDeviatesFromSumOfAllocationQuantities | The total quantity of the order differs from the sum of all allocation amounts |
| orderQuantityTooHigh | The order quantity is higher than what the financial institution accepts |
| orderQuantityTooSmall | The amount of the orderQuantity does not fulfill the minimum size of the selected financialInstrument |
| orderQuantityTypeNotSupported | The selected type of the orderQuantity is not supported |
| orderQuantityTypeWrong | The selected type of the orderQuantity does not match the selected financialInstrument |
| orderTypeNotSupportedByMarket | Given order type is not valid for given market |
| other | Order has been cancelled due to a different reason |
| placeOfTradeNotSupported | PlaceOfTrade is not supported |
| productExpired | Product indicated in the order is expired |
| selectedTimeInForceNotSupported | The selected timeInForce instruction is not supported |
| stopPriceMissingForExecutionType | StopPrice is missing (for executionTypes stop and stopLimit) |
| stopPriceNotAllowedForExecutionType | StopPrice is not allowed for executionType market or limit |
| timeInForceAndExpiryDateInconsistent | Time in force for day not consistent with expiry date (if both attributes are delivered in the request) |
| valueTooHigh | The value of the order is exceeds the given limit by the receiving party |
| wrongDenomination | The amount of the orderQuantity does not fulfill the tick size of the selected financialInstrument |

### Allocations

| Enum | Description |
| --- | --- |
| accountIdentificationMissing | Account identification is missing |
| accountInvalidForOrderPlacement | The selected account cannot be used for order placements |
| accountTypeMissing | The account type is missing for an indicated account |
| accountTypeNotMatchingAccount | The selected type of the account does not match the account type of the financial institution, e.g. cashAccountID is sent with a accountType:safekeepingAccount |
| allocationQuantityTooHigh | The indicated quantity exeeds the defined threshhold |
| cashAccountMissing | No cashAccount provided for the allocation |
| cashAccountNotFound | Indicated cash account has not been found |
| insufficientBuyingPower | Client has not enough buying power |
| insufficientQuantityAvailable | Client has not enough securities to sell |
| invalidCurrencyForAccount | Invalid currency for given customer account/indicated currency not matching with accountCurrency |
| other | Allocation has been cancelled/rejected due to another reason |
| pretradeCheckFailed | Pre-trade checks failed. Allocation has been cancelled/rejected due to a reason that is not made available |
| safekeepingAccountMissing | No safekeepingAccount provided for the allocation |
| safekeepingAccountNotFound | Indicated safekeeping account has not been found |
| tooManyCashAccountsIndicated | More than one cashAccount provided for the allocation Expected is exactly one cashAccount per allocation |
| tooManySafekeepingAccounts | More than one safekeepingAccount provided for the allocation  Expected is exactly one safekeepingAccount per allocation |
| valueTooHigh | The value of the order is exceeds the defined limit by the receiving party |
| zeroQuantity | Zero quantity not processed |

