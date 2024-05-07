# Fix OpenWealth Mapping

## OrdStatus <39> to orderStatus

| Fix 4.4 OrdStatus | Comment | OW orderStatus | Description |
| --- | --- | --- | --- |
| B = Calculated ||||
| 3 = DoneForDay | eventType order:doneForDay |||
| 0 = New || accepted | The order including allocations has been validated as the service provider has run its (pre-)trade checks against rules, restrictions and other constraints. The order may remain in this state for a longer time, for example, if the order is placed after closure of the market, it may stay inside the service provider’s system until the market opens and the order is placed at the market. Note that the order has not yet been sent to the market. |
| A = PendingNew || acknowledged | The order has been submitted successfully to the service provider and is confirmed to be syntactically correct (i.e. correct in form and format). Note that the service provider has not yet accepted the order to be placed at the market as no (pre-)trade checks have been run yet. |
| 4 = Canceled || cancelled | The order had no executions (no fills) and is confirmed to be cancelled. This is a terminal state. |
| D = AcceptedForBidding ||||
||| customerRelease | Before the accepted order can be placed the customer may have to confirm the order (2FA, MFA). Until the confirmation to release the order happens the order stays in this state (except it is cancelled or it expires) |
||| executed | The completely filled order has been allocated to the client(s) and is confirmed to be (fully) executed. This is a terminal state. |
| C = Expired || expired | The order had no executions (no fills) and is confirmed to be expired. This is a terminal state. |
| 2 = Filled || filled | The order has been fully executed. |
||| marketCancelled | Market has accepted the cancellation of the outstanding amount of the order. |
||| marketExpired | Expiry of the order at the placed exchange  |
||| marketRejected | Market or broker side rejection of the order. |
||| partiallyCancelled | The partially filled order has been allocated to the client(s) and is confirmed to be cancelled. Note that the cancelled order contains partial executions and their corresponding allocations. This is a terminal state. |
||| partiallyExpired | The partially filled order has been allocated to the client(s) and is confirmed to be expired. This is a terminal state. |
| 1 =  PartiallyFilled || partiallyFilled | The order has been patially executed |
||| partiallyRejected | The partially filled order has been allocated to the client(s) and is confirmed to be rejected. This is a terminal state. |
| 6 = PendingCancel || pendingCancel | The order is flagged for cancellation and not successfully processed nor confirmed yet. Note that should the cancellation not be possible, the state of the order might return to its previous state. |
| 7 = Stopped ||||
||| placed | The order has been placed at the market (or at another counter party). |
| E = PendingReplace | eventType order:pendingReplace |||
| 8 = Rejected || rejected | The order had no executions (no fills) and is confirmed to be rejected. This is a terminal state. |
| 9 = Suspended | eventType order:suspended |||


## ExecutionType <150> to eventType

| Fix 4.4 ExecType | Comment | OW eventType | Description |
| --- | --- | --- | --- |
||| heartbeat | This event is sent to check if the receiving server is responsive. |
||| order:restate | Sell-side adjustement of an order without the electronical request of the customer. This is used for orders and corporate actions, changes communicated verbally to the sellside either due to normal business practices or as an emergency measure when electronic systems are not available, repricing of orders by the sellside (such as making Sell Short orders compliant with uptick / downtick rules), or other reasons (Broker option). |
| 0 = New ||||
| 3 = DoneForDay || order:doneForDay | Order not, or partially, filled; no further executions forthcoming for the trading day. |
| 4 = Canceled || order:tradeCancel | A previously traded execution is deemed invalid. Trade Cancel applies at the execution level and is used to cancel an execution which has been reported in error. |
| 5 = Replaced || order:replace | The replacement of the order has been successful. |
| 6 = PendingCancel ||||
| 7 = Stopped ||||
| 8 = Rejected || order:orderStatusUpdate | Status of the order has changed. |
| 9 = Suspended || order:suspend | Order has been placed in suspended state. |
| A = PendingNew ||||
| B = Calculated ||||
| C = Expired || order:orderStatusUpdate | Status of the order has changed. |
| D = Restarted ||||
| E = PendingReplace || order:pendingReplace | Order with an Order Cancel/Replace Request pending . This does not indicated that the order has been replaced. |
| F = Trade || order:trade | Fill or partial fill on the order. |
| G = TradeCorrect || order:tradeCorrect | Trade Correct applies at the execution level and is used to modify an incorrectly reported fill. |
| H = TradeCancel || order:tradeCancel | A previously traded execution is deemed invalid. Trade Cancel applies at the execution level and is used to cancel an execution which has been reported in error. |
| I = OrderStatus || order:orderStatusUpdate | Status of the order has changed. |
| J = TradeInAClearingHold ||||
| K = TradeHasBeenReleasedToClearing ||||
| L = TriggeredOrActivatedBySystem ||||
| M = Locked ||||
| N = Released ||||
