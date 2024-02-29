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