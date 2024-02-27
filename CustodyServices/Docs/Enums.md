# Enumerations



## Transaction types

The enumerations transaction type and movement type are the main classifiers of business events (Geschäftsvorfälle) and their componenets. The transaction type should be used to determine the business event type in the sense that it descripes an event like a purchase, a dividend payment etc that results in changes of wealth holding. These changes or deltas are called movements, such as security moves or cash moves. If a resulting cash move consists of multiple parts sush as taxes, fees and gross amounts each of these will be listed as separate movements. In this case the type of movement further determines the type of this change. The default types for cash movements - 'cash' - and security and contract movements - 'asset' should be used if the transaction type alse determines the type of this particular movement.

| Enum | Description |
| --- | --- |
| accumulation | Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. |
| additionalPayment | Description |
| adjustNotional | Description |
| assignment | Assignment of an option or warrant |
| assimilation | Assimilation refers to the absorption of a new or secondary stock issuance by the public after it has been purchased by the underwriter |
| bonus | Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding |
| buy | Purchase of a security or financial instrument |
| buyBarrier | Description |
| buyDigital | Description |
| buyIssue | Buy of a new issue (primary market) |
| buyToClose | Description |
| buyToOpen | Description |
| capitalIncrease | Capital increase |
| closeCallableLoan | Description |
| closeCallDeposit | Description |
| closeCreditDefaultSwap | Description |
| closeFxForward | Description |
| closeFxSwap | Description |
| closeFixedDeposit | Description |
| closeFixedLoan | Description |
| closeInterestSwap | Description |
| closeTotalReturnSwap | Description |
| closeNonDeliverableForward | Description |
| conversionBondShare | Conversion bond into share |
| coupon | Interest payment distributed to holders of an interest bearing asset. |
| creditEvent | An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions) |
| decrease | Description |
| decreaseCallableLoan | Description |
| decreaseCallDeposit | Description |
| deliverSecurityToFund | Description |
| deliveryFreeOfPayment | Description |
| deliveryVsPayment | Description |
| dividendCash | Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency |
| dividendChoice | Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from dividendReinvestment as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market. |
| dividendReinvestment | Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from dividendOption as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend. |
| dividendStock | Dividend paid to shareholders in the form of equities of the issuing corporation |
| exercise | Exercise of an option or warrant |
| exerciseCash | Description |
| exercisePhysical | Description |
| expiration | Description |
| expirationOldSecurity | Expiration old security, includes lapses for options/warrants |
| fees | Description |
| finalLiquidationPayment | Final liquidation payment under expiration of the old security |
| fxSpot | Description |
| incompleteRights | Description |
| increase | Description |
| increaseCallableLoan | Description |
| increaseCallDeposit | Description |
| inflowCash | Incoming payments related to cash account. |
| instrumentExchange | Description |
| interest | Description |
| internalTransfer | Account Transfer within the same client/bank |
| knockIn | Description |
| knockOut | Description |
| liquidationPayment | A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. |
| markToMarket | Description |
| markToMarketCash | Description |
| merger | Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange. |
| openCallableLoan | Description |
| openCallDeposit | Description |
| openFixedDeposit | Description |
| openFixedLoan | Description |
| openFxForward | Description |
| openFxSwap | Description |
| openNonDeliverableForward | Description |
| other | Description |
| outflowCash | Outgoing payments related to cash account. This covers for example the payment of bills, account transfers across banks, card payments, cash withdrawals, standing orders accross clients/banks, “LSV” |
| premium | Description |
| prepayment | Prepayment to purchase e.g. a hedge fund with infrequent NAV calculation |
| publicOffer | Public offer |
| receiveFreeOfPayment | Description |
| receiveFromFund | Description |
| receiveSecurityFromFund | Description |
| receiveVsPayment | Description |
| redemption | The redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity. |
| redemptionPartial | Partial redemption |
| redemptionPrior | Redemption prior to maturity |
| reductionOfNominal | Reduction of nominal |
| resetPayment | Description |
| rightDistribution | Right distribution (e.g. subscription rights related to a capital increase or in case of a dividend with the choice between stock/cash) |
| sell | Sale of a security or financial instrument |
| sellBarrier | Description |
| sellDigital | Description |
| sellToClose | Description |
| sellToOpen | Description |
| spinOff | A distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment. |
| stockSplit | Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly. |
| subscription | Description |
| taxCorrections | Description |
| taxes | Description |
| transferMetalPhysical | Description |
| unwind | Description |
| variationMargin | Variation margin payment on for example a future |

## Movement types

| Enum | Description |
| --- | --- |
| accruedInterest | Accrued Interest |
| additionalWithholdingTax | Additional Withholding Tax |
| asset | Default type for securities and contracts |
| brokerageFee | Brokerage Fee |
| capitalGainTax | Capital Gain Tax |
| cash | Default type for a cash amount |
| custodyFee | Custody Fee |
| courtage | Courtage |
| exchangeFee | Exchange Fee |
| financialTransactionTax | Financial Transaction Tax |
| managementFee | Management Fee |
| otherFee | Other Fee |
| other | Other |
| otherTax | Other Tax |
| reinvestmentAmount | Reinvestment Amount |
| stampDuty | Stamp Duty |
| thirdPartyFee | Third Party Fee |
| transactionFee | Transaction Fee |
| withholdingTax | Withholding Tax |
