# Enumerations

- [Transaction Types](#transaction-types)
- [Movement types](#movement-types)

## Transaction types

The enumerations transaction type and movement type are the main classifiers of business events (Geschäftsvorfälle) and their componenets. The transaction type should be used to determine the business event type in the sense that it descripes an event like a purchase, a dividend payment etc that results in changes of wealth holding. These changes or deltas are called movements, such as security moves or cash moves. If a resulting cash move consists of multiple parts sush as taxes, fees and gross amounts each of these will be listed as separate movements. In this case the type of movement further determines the type of this change. The default types for cash movements - 'cash' - and security and contract movements - 'asset' should be used if the transaction type alse determines the type of this particular movement.

For clarification of content we group the transaction types by business event group and capture the possible movement types per transaction type.

**Business event groups:**

| Name | Description |
| --- | --- |
| CashTransfer | Inflows and Ourflows (external and internal) of cash |
| SecurityTransfer | Inflows and Outlfows (external and internal) of security |
| SecurityTrade | Exchange trades of securites and securiticed assets |
| FX | Foreign Exchange related transactions |
| OtcBorrowingLending | Over-The-Counter borrowing and lending activities |
| CorporateAction | Events by a company, agreed by the board and authorized by shareholders, that cause material change to the company's securities resulting in movements of cash or securities |
| OtherOTC | Over-The-Counter contracts other than FX and borrowing and lending related |
| PreciousMetal | Transactions related to precious metal |

**Transaction type enumeration:**

*marked transaction types: samples to be collected

| Enum | Description | Business event group | Possible contained movement types |
| --- | --- | --- | --- |
| accumulation | Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. | CorporateAction | cash, taxes, reinvestmentAmount|
| additionalPayment* || OtherOTC | cash, fees, taxes |
| adjustNotional* | Adjustment of the principal or notional value of the underlying asset in a contract | OtherOTC | cash, fees, taxes |
| assignment* | The seller's obligation to fullfill the terms of the contract by either selling or buying the underlying security at the exercise price | SecurityTrade ||
| assimilation* | Assimilation refers to the absorption of a new or secondary stock issuance by the public after it has been purchased by the underwriter |||
| bonus | Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding | CorporateAction | asset |
| buy | Purchase of a security or financial instrument | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| buyToClose | Buy to close involves buying back an asset previously sold short to close out a short position | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| capitalIncrease | Capital increase | CorporateAction | cash, asset, fees, taxes |
| closeContract | Closing of an over-the-counter contract | OtcBorrowingLending, OtherOTC | cash, accruedInterest|
| closeCallDeposit | Closing of a callable deposit | OtcBorrowingLending ||
| closeCreditDefaultSwap* | Closing of a credit default swap | OtherOTC | asset |
| closeFxForward | Closing of a foreign exchange forward contract | FX | cash, asset |
| closeFxSwap | Closing of a foreign exchange swap contract | FX | cash, asset|
| closeFixedDeposit | Closing of a fixed deposit | OtcBorrowingLending | cash, asset, accruedInterest |
| closeFixedLoan | Closing of a fixed loan | OtcBorrowingLending | cash, asset, accruedInterest |
| closeInterestRateSwap* | Closing of an interest swap | OtherOTC | asset, cash, how is P&L paid? |
| closeTotalReturnSwap* | Closing of a total return swap | OtherOTC | asset, cash, how is P&L paid? |
| closeNonDeliverableForward | Closing of a non deliverable forward | OtherOTC | cash, asset, how is P&L paid? |
| conversionBondShare | Conversion bond into share | CorporateAction | asset, cash |
| coupon | Interest payment distributed to holders of an interest bearing asset. | CorporateAction | cash, fees, taxes |
| creditEvent* | An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions) | OtherOTC | cash |
| custodyFee | Custody Fee | CashTransfer | cash, taxes |
| decreasePrincipal | Decrease of principal amount of a ledning or bowwowing contract | OtcBorrowingLending | cash |
| deliveryFreeOfPayment | Security delivery free of payment | SecurityTransfer | asset |
| deliveryVsPayment | Security delivery against payment | SecurityTrade | cash, asset, fees, taxes |
| dividendCash | Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency | CorporateAction | cash, fees, taxes |
| dividendChoice | Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from dividendReinvestment as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market. | CorporateAction | cash, fees, taxes |
| dividendReinvestment | Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from dividendOption as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend. | CorporateAction  | cash, asset, fees, taxes |
| dividendStock | Dividend paid to shareholders in the form of equities of the issuing corporation | CorporateAction | asset |
| exercise* | TBD Exercise of an option or warrant |||
| expiration* | TBD |||
| expirationOldSecurity | Expiration old security, includes lapses for options/warrants |||
| finalLiquidationPayment* | Final liquidation payment under expiration of the old security | CorporateAction |  cash, fees |
| fxSpot | Foreign exchange spot transaction | FX | cash |
| incompleteRights | TBD - can this be removed |||
| increasePrincipal | Increase of principal amount of a borrowing or lending contract | OtcBorrowingLending | cash |
| inflowCash | Incoming payments related to cash account. | CashTransfer | cash |
| instrumentExchange | Exchange of securities, typically a debit of one asset in exchange of a credit of another. This also includes receive and deliver security from/to fund | CorporateAction | asset |
| interest | Interest payment | CashTransfer | cash, fees, taxes |
| internalTransfer | TBD: still needed? Account Transfer within the same client/bank |||
| knockIn | TBD - should this be modelled on the contract/option? |||
| knockOut | TBD - should this be modelled on the contract/option? |||
| liquidationPayment* | A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. | CorporateAction | cash, fees, taxes |
| managementFee | Management Fee | CashTransfer | cash, taxes |
| markToMarket | TBD |||
| markToMarketCash | TBD |||
| merger | Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange. | CorporateAction | asset |
| openCallableLoan | Opening of a callable loan contract | OtcBorrowingLending | cash, asset |
| openCallDeposit | Opening of a call deposit contract | OtcBorrowingLending | cash, asset |
| openFixedDeposit | Opening of a fixed deposit contract | OtcBorrowingLending | cash, asset |
| openFixedLoan | Opening of a fixed loan contract | OtcBorrowingLending | cash, asset |
| openFxForward | Opening of a foreign exchange forward contract | FX | cash |
| openFxSwap | Opening of a foreign exchange swap contract | FX | cash |
| openInterestRateSwap | Opening of an interest rate swap | OtherOTC | asset, cash |
| openTotalReturnSwap | Opening of a total return swap | OtherOTC | asset, cash |
| openNonDeliverableForward | Opening of a non-deliverable forward contract | OtherOTC | cash, asset |
| other | Other transaction type not covered by enum || all movementTypes possible |
| outflowCash | Outgoing payments related to cash account. This covers for example the payment of bills, account transfers across banks, card payments, cash withdrawals, standing orders across clients/banks, “LSV” | CashTransfer | cash |
| premium* | This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications | CorporateAction | cash, fees, taxes |
| prepayment* | difference to subscription TBD. Prepayment to purchase e.g. a hedge fund with infrequent NAV calculation | SecurityTrade | cash, asset, fees, taxes |
| publicOffer | TBD - needed? |||
| receiveFreeOfPayment | Receive of security free of payment | Security transfer | asset |
| receiveFromFund | TBD |||
| receiveVsPayment | Receive of security against payment | SecurityTrade | cash, asset, fees, taxes |
| redemption | The redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity. | CorporateAction | cash, asset, fees, taxes |
| redemptionPartial | Partial redemption | CorporateAction | cash, asset, fees, taxes |
| redemptionPrior | Redemption prior to maturity | CorporateAction | cash, asset, fees, taxes |
| reductionOfNominal* | Reduction of nominal | CorporateAction | cash, asset, fees, taxes |
| resetPayment | Net payment of the accrued interest of the swapped legs of an interest rate swap |||
| rightDistribution | Right distribution (e.g. subscription rights related to a capital increase or in case of a dividend with the choice between stock/cash) | CorporateAction | asset |
| sell | Sale of a security or financial instrument | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| sellToOpen | Sell to open refers to instances in which an option investor initiates, or opens, an option trade by selling or establishing a short position in an option | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| spinOff | A distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment. | CorporateAction | asset |
| stockSplit | Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly. | CorporateAction | asset |
| subscription | Prepayment to purchase e.g. a mutual or hedge fund with infrequent NAV calculation || cash, asset, fees, taxes |
| taxCorrections | Correction of tax payment | CashTransfer | cash |
| tax | General tax payment | CashTransfer | cash |
| transferMetalPhysical | TBD | ||
| unwind | TBD |||
| variationMargin | Variation margin payment on for example a future | CorporateAction | cash, fees, taxes |

## Movement types

| Enum | Description |
| --- | --- |
| accruedInterest | Accrued Interest |
| additionalWithholdingTax | Additional Withholding Tax |
| asset | Default type for securities and contracts |
| brokerageFee | Brokerage Fee |
| capitalGainTax | Capital Gain Tax |
| cash | Default type for a cash amount |
| courtage | Courtage |
| exchangeFee | Exchange Fee |
| financialTransactionTax | Financial Transaction Tax |
| otherFee | Other Fee |
| other | Other |
| otherTax | Other Tax |
| reinvestmentAmount | Reinvestment Amount |
| stampDuty | Stamp Duty |
| thirdPartyFee | Third Party Fee |
| transactionFee | Transaction Fee |
| withholdingTax | Withholding Tax |
