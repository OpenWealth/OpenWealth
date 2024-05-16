# Instrument and transaction types

The main discriminators to categorize (bankable) wealth and associated business events that cause change in wealth or the underlying risk are:

- [Financial Instrument Types](#financial-instrument-types)
- [Transaction Types](#transaction-types)
- [Movement Types](#movement-types)

The financial instrument type characterizes a monetary contract, which confers a right or claim against some counterparty in the form of a payment, equity ownership or revenue, debt (bonds, loans, deposit accounts), currency (forex), or derivatives (futures, forwards, options, and swaps). The financial instrument type in particular determines the (mandatory and optional) properties to describe the asset and restricts the transaction types related to the instrument.

The transaction types categorize business events (Geschäftsvorfälle). A business event typically results in one or multiple movements - changes of holdings of a position. The transaction type determines restrictions on its content resulting in guidelines for the implementation of the data object (technical structure, mandatory and optional fields, consistency checks). A dividend payment for example typically consists of a triggering instrument, a gross movement (amount) of cash and a withholding or reclaimable tax movement. The typing of these partial movements is described by the movement type enumerator.

Detailed description of the business events related to each instrument type can be found here:

[Business events in the lifecycle of the financial instruments and implementation guide](#business-events-in-the-lifecycle-of-the-financial-instruments-and-implementation-guide)

## Financial instrument types

Here you find an overview on the currently supported financial instruments with asociated busines events (transaction types) associated to these instruments.

| Enum | Description | Common business events / transaction types |
| --- | --- | --- |
| cash | Currency | All transactions where a cash flow is involved |
| bond | Bond | buy, sell, coupon, redemption, redemptionPartial, redemptionPrior, conversionBondShare, deliveryFreeOfPayment, deliveryVsPayment, receiveFreeOfPayment, receiveVsPayment |
| equity | Equity is an ownership interest in property that may be offset by debts or other liabilities. | buy, sell, bonus, dividendCash, dividendChoice, dividendReinvestment, dividendStock, conversionBondShare, deliveryFreeOfPayment, deliveryVsPayment, receiveFreeOfPayment, receiveVsPayment, capitalIncrease, liquidationPayment, merger, premium, spinOff, stockSplit |
| fund | An investment fund is a supply of capital belonging to numerous investors used to collectively purchase securities while each investor retains ownership and control of his own shares. | buy, sell, deliveryFreeOfPayment, deliveryVsPayment, receiveFreeOfPayment, receiveVsPayment, accumulation, subscription, prepaymentSubstitution, spinOff |
| index | A financial index produces a numeric score based on inputs such as a variety of asset prices. It can be used to track the performance of a group of assets in a standardized way. Indexes typically measure the performance of a basket of securities intended to replicate a certain area of the market. | |
| commodity | Commodities are raw materials used to create the products consumers buy, from food to furniture to gasoline or petrol. Commodities include agricultural products such as wheat and cattle, energy products such as oil and natural gas, and metals such as gold, silver and aluminum. | buy, sell |
| option | An option is a financial instrument that gives the holder the right, but not the obligation, to buy or sell an underlying asset at a predetermined price within a given timeframe | buy, sell, buyToClose, sellToOpen, deliveryFreeOfPayment, deliveryVsPayment, receiveFreeOfPayment, receiveVsPayment, rightDistribution, expiration |
| future | Futures are derivative financial contracts that obligate parties to buy or sell an asset at a predetermined future date and price. | buy, sell, buyToClose, sellToOpen, deliveryFreeOfPayment, deliveryVsPayment, receiveFreeOfPayment, receiveVsPayment, expiration |
| fxForward | A forward contract is a customized contract between two parties to buy or sell currencies at a specified price on a future date. | openContract, closeContract |
| fxSwap | A foreign currency swap is an agreement between two foreign parties to swap interest payments on a loan made in one currency for interest payments on a loan made in another currency. | openContract, closeContract |
| fxOption | An FX option is a contract that gives the buyer the right, but not the obligation, to buy or sell a certain currency at a specified exchange rate on or before a specified date. For this right, a premium is paid to the seller. | buy, sell, buyToClose, sellToOpen |
| mortgage | A mortgage is a type of loan used to purchase or maintain a home, plot of land, or other types of real estate. | openContract, closeContract, interestPayment, amortizationAndInterestPayment |
| credit | A credit refers to a contractual agreement in which a borrower receives a sum of money or something else of value and commits to repaying the lender at a later date, typically with interest. | openContract, closeContract, interestPayment, amortizationAndInterestPayment |
| fixedLoan | A fixed loan is a type of loan where the interest rate remains unchanged for the entire term of the loan or for a part of the loan term. | openContract, closeContract, interestPayment |
| fixedDeposit | A fixed deposit is an instrument through which you can grow a lumpsum over a fixed tenure at a fixed interest rate. | openContract, closeContract, interestPayment |
| callableLoan | A call loan is a loan that the lender can demand to be repaid at any time. | openContract, closeContract, interestPayment, decreasePrincipal, increasePrincipal |
| callableDeposit | Call deposits are basically accounts that require you to keep a minimum balance in exchange for a higher interest rate. Unlike time deposits, you have ready access to most of your cash, yet are still able to earn a higher return. | openContract, closeContract, interestPayment, decreasePrincipal, increasePrincipal |
| interestRateSwap | An interest rate swap is a forward contract in which one stream of future interest payments is exchanged for another based on a specified principal amount. | openContract, closeContract, adjustNotional, interestPayment, unwind, additionalPayment |
| totalReturnSwap | A swap agreement in which Party A pays fees to Party B in exchange for the income or return generated by an asset owned by Party B. | openContract, closeContract, adjustNotional, resetPayment, unwind, additionalPayment |
| creditDefaultSwap | A derivative product which serves as a form of insurance against the default of an underlying borrower or debt instrument | openContract, closeContract, adjustNotional, resetPayment, unwind, upfrontPayment, additionalPayment |
| cryptoAsset |  | |
| other |  | |

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

| Enum | Description | Business event group | Possible contained movement types |
| --- | --- | --- | --- |
| accumulation | Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. | CorporateAction | cash, taxes, reinvestmentAmount|
| additionalPayment | Payment that is related to an OTC Contract without changing the principal amount, typically a fee or premium | OtherOTC | cash, premium, fees, taxes |
| adjustNotional | Adjustment of the principal or notional value of the underlying asset in a contract | OtherOTC | cash, fees, taxes |
| amortizationAndInterestPayment | Amortization and interest payment | OtcBorrowingLending | cash, interest, fees |
| bonus | Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding | CorporateAction | asset |
| buy | Purchase of a security or financial instrument | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| buyToClose | Buy to close involves buying back an asset previously sold short to close out a short position | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| capitalIncrease | Capital increase | CorporateAction | cash, asset, fees, taxes |
| closeContract | Closing of an over-the-counter contract | FX, OtcBorrowingLending, OtherOTC | cash, accruedInterest, interest, fees|
| conversionBondShare | Conversion bond into share | CorporateAction | asset, cash |
| coupon | Interest payment distributed to holders of an interest bearing asset. | CorporateAction | cash, fees, taxes |
| creditEvent | An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions) | OtherOTC | cash, asset |
| custodyFee | Custody Fee | CashTransfer | cash, taxes |
| decreasePrincipal | Decrease of principal amount of a ledning or bowwowing contract | OtcBorrowingLending | cash |
| deliveryFreeOfPayment | Security delivery free of payment | SecurityTransfer | asset |
| deliveryVsPayment | Security delivery against payment | SecurityTrade | cash, asset, fees, taxes |
| dividendCash | Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency | CorporateAction | cash, fees, taxes |
| dividendChoice | Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from dividendReinvestment as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market. | CorporateAction | cash, fees, taxes |
| dividendReinvestment | Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from dividendOption as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend. | CorporateAction  | cash, asset, fees, taxes |
| dividendStock | Dividend paid to shareholders in the form of equities of the issuing corporation | CorporateAction | asset |
| exercise | Exercise of a right, an option or warrant || asset, cash, fees, taxes|
| expiration | Expiration of a security - contract, right, an option or warrant || asset |
| finalLiquidationPayment | Final liquidation payment under expiration of the old security | CorporateAction |  cash, fees |
| fxSpot | Foreign exchange spot transaction | FX | cash |
| increasePrincipal | Increase of principal amount of a borrowing or lending contract | OtcBorrowingLending | cash |
| inflowCash | Incoming payments related to cash account. | CashTransfer | cash |
| instrumentExchange | Exchange of securities, typically a debit of one asset in exchange of a credit of another. This also includes receive and deliver security from/to fund | CorporateAction | asset |
| interestPayment | Interest payment | CashTransfer | cash, fees, taxes |
| internalTransfer | Account Transfer within the same client/bank | CashTransfer | cash |
| liquidationPayment | A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security. | CorporateAction | cash, fees, taxes |
| managementFee | Management Fee | CashTransfer | cash, taxes |
| merger | Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange. | CorporateAction | asset |
| openContract | Opening of an OTC contract | FX, OtcBorrowingLending, OtherOTC | cash, asset, fees, premium |
| other | Other transaction type not covered by enum || all movementTypes possible |
| outflowCash | Outgoing payments related to cash account. This covers for example the payment of bills, account transfers across banks, card payments, cash withdrawals, standing orders across clients/banks, “LSV” | CashTransfer | cash |
| premium | This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications | CorporateAction | cash, fees, taxes |
| receiveFreeOfPayment | Receive of security free of payment | Security transfer | asset |
| receiveVsPayment | Receive of security against payment | SecurityTrade | cash, asset, fees, taxes |
| redemption | The redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity. | CorporateAction | cash, asset, fees, taxes |
| redemptionPartial | Partial redemption | CorporateAction | cash, asset, fees, taxes |
| redemptionPrior | Redemption prior to maturity | CorporateAction | cash, asset, fees, taxes |
| reductionOfNominal | Reduction of nominal | CorporateAction | cash, asset, fees, taxes |
| resetPayment | Net payment of the accrued interest of the swapped legs of an interest rate swap | OtherOTC | cash |
| rightDistribution | Right distribution (e.g. subscription rights related to a capital increase or in case of a dividend with the choice between stock/cash) | CorporateAction | asset |
| sell | Sale of a security or financial instrument | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| sellToOpen | Sell to open refers to instances in which an option investor initiates, or opens, an option trade by selling or establishing a short position in an option | SecurityTrade | cash, asset, accruedInterest, fees, taxes |
| spinOff | A distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment. | CorporateAction | asset |
| stockSplit | Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly. | CorporateAction | asset |
| subscription | Prepayment to purchase e.g. a mutual or hedge fund with infrequent NAV calculation || cash, asset, fees, taxes |
| taxCorrections | Correction of tax payment | CashTransfer | cash |
| tax | General tax payment | CashTransfer | cash |
| transferMetalPhysical | TBD | ||
| unwind | Closing of an open OTC contract prior to the agreed expiration. This may involve payments of accrued interests, fees and the closing of the contract | OtherOTC | cash, asset, fees|
| upfrontPayment | Upfront payment that is related to an OTC Contract without changing the principal amount, typically a fee or premium | OtherOTC | cash, premium, fees, taxes |
| variationMargin | Variation margin payment on for example a future | CorporateAction | cash, fees, taxes |

## Movement types

| Enum | Description |
| --- | --- |
| accruedInterest | Accrued Interest |
| additionalWithholdingTax | Additional Withholding Tax |
| asset | Default type for securities and contracts |
| brokerageFee | Brokerage Fee charged by the exchange |
| capitalGainTax | Capital Gain Tax |
| cash | Default type for a cash amount |
| exchangeFee | Exchange Fee |
| financialTransactionTax | Financial Transaction Tax |
| otherFee | Other Fee |
| other | Other |
| otherTax | Other Tax |
| reclaimableTax | Reclaimable Tax |
| reinvestmentAmount | Reinvestment Amount |
| stampDuty | Stamp Duty |
| thirdPartyFee | Third Party Fee |
| transactionFee | Transaction Fee charged by the custodian |
| withholdingTax | Withholding Tax |

## Business events in the lifecycle of the financial instruments and implementation guide

### Generic security related business events

- Buy / Sell

Purchase/Sale of a secuity
The movements typically consisting of an entry of type=asset and the nominal quantity of the purchased/sold security, a gross cash movement (type=cash), an accrued interest movement (for fixed income instruments) and possible fee/tax movements.

- Receive Free Of Payment / Delivery Free Of Payment

Receive/Delivery free of payment is a settlement method for a securities transaction in which the delivery or reception of the securities is not linked to a corresponding transfer of funds.
The movements typically only consist of a credit/debit movement of the instrument of subject.

- Receive Versus Payment / Delivery Versus Payment

Receive/Delivery versus payment is a procedure for the settlement of securities transactions in which the cash payment/receipt and the reception/delivery of the securities need to happen simultaneously in order for the transaction to settle.
In terms of movements these transaction types are identical to a Buy/Sell (see above)

### Cash

This section consists of all transaction types that result in cash movements only without a triggering reason originating from another instrument such as revenue, fees, taxes resulting from a corporate action, interest or similar. The default transaction types are inflow and outflow cash, but also fees like custody, management or account fees belong here as well as tax general obligations. The movements consist normally of a single entry, but may also contain multiples movements on the same account such as a gross amount (type=cash) and for example a value added tax

### Bond

- Coupon

The coupon payment of a bond is the periodic payout of the accrued interest.
The movements will at least contain a gross cash movement (type=cash), possible also fees/taxes. Triggering instrument must be set.

- Redemption / Redemption Prior

The business event when the mutual fund share or money invested in a fixed-income security (bond) is returned on or before its maturity date.
The movements contain at least the closing of the bond position and the repayment of cash.

- Redemption Partial

A partial redemption is the retirement or payment of a portion of a callable (or redeemable) security before its maturity date.
It typically results in a cash movement and potentially a change in the held quantity of the bond or in a change in the factor property of the instrument: The redemption is reflected in a pool factor reduction. No movement of securities occurs.

- Conversion Bond Share

Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio.
This includes at least two security (type=asset) movements - the debit of the bond and credit of the share/equity.

### Equity

- Bonus

Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding
The movements typically contain just a single entry of the credited securities. Triggering instrument must be set.

- Dividend Cash

Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.
The movements usually consist of a gross cash entry (type=cash) and a withholding or reclaimable tax entry. Triggering instrument must be set.

- Dividend Choice

Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from dividendReinvestment as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market.
The movements usually consist of a gross cash entry (type=cash) and a withholding or reclaimable tax entry. The exercise to reinvest would usually be confirmed as a separat business event. Triggering instrument must be set.


- Dividend Reinvestment

Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from divivdendChoice as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.
The movements typically consisting of an entry of type=asset and the nominal quantity of the newly acquired security, a gross cash movement (type=cash), and possible fee/tax movements

- Dividend Stock

Dividend paid to shareholders in the form of equities of the issuing corporation.
The movements typically only consist of a credit movement of the instrument of subject. Triggering instrument must be set.

- Capital Increase

TBD

- Liquidation Payment

A distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.
The movements may consist of a credit of security or cash or both. Triggering instrument must be set.

- Merger

Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.
The movements consist of a debit and a credit of security and a possible cash credit. Triggering instrument must be set.

- Premium

This corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.

- Spin Off

A distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment.
The movements may consist of a credit of the newly created security. Triggering instrument must be set.

- Stock Split

Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.
The movements may consist of a debit of the old held quantity and a credit of the multiple of the old quantity. Triggering instrument must be set. Enusre the prices respect before and after situation.

### Fund

- Subscription

Subscription refers to the process of investors signing up and committing to invest in a financial instrument, before the actual closing of the purchase.
The movements derscribing this event typically consist of a security credit of the nominal value at price 1 in the given currency, a cash debit of the committed value and possible fees and taxe. The security is typically identified as a 'dummy' paper with a proprietary identifier. The 'prepayment substitution' (see below) will exchange the dummy paper into real fund shares. Triggering instrument must be set.

- Prepayment Substitution

This transaction type will be sent when the fund prepayment (subscription) has been converted into fund shares.
The movements consists of the debit of the prepayment 'dummy paper', the credit of the fund shares (often up to 3 decimal places), and possible cash credit or debit fractions. Triggering instrument must be set.

- Accumulation

Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes.
The movements typicall< consist of a gross cash credit (type=cash), a debit withholding or reclaimable tax and a reinvested amount. This results in a net zero posting amount - no actual movement on the account occurs. Triggering instrument must be set.

### Commodity

TBD

### Option

- Exercise

### Future

- Margin payment

### FX Forward

- Open Contract

- Close Contract

### FX Swap

- Open Contract

- FX Spot

- Close Contract

### Mortgage and Credit

- Open Contract

- Amortization And Interest Payment

- Interest Payment

- Close Contract

### Fixed and Callable Loans and Deposits

- Open Contract

- Increase / Decrease Principal

- Close Contract

### Interest Rate Swap

- Open contract

The transaction instance of the opening of the contract should contain only one movement with quantity = 1 of the InterestRateSwap instrument. Make sure to set the properties on the contract instrument properly (principal, both interests, maturity etc)

- Interest payment

The payment typically occurs periodically and the net amount consist of the difference betwee the two accumulated interests based on the swapped rates.
The implementation of the transaction ideally consists of at least the two cash movements (each accrued interest)

- Additional payment

The payment may occur during the lifetime of the contract is undertstood as a premium or fee payment of some sort for the contract.

- Close contract

The transaction instance of the closing of the contract should contain at least one movement with quantity = -1 of the InterestRateSwap instrument. Additionally the interests of both legs and possible fees may also be contained in the transaction as separate movements

- Unwind

The business event of an unwind typically includes all necessary movements in order the close the contract before maturity, this may include closing of contract, interests, fees, additional payments etc.

### Total Return Swap

- Open contract

The transaction instance of the opening of the contract should contain at minimal one movement with quantity = 1 of of the TotalReturnSwap instrument. Make sure to set the properties on the contract instrument properly (principal, interest rate, underlying instrument and maturity)

- Reset payment

The payment occurs periodically or at maturity and the net amount consist of the difference between the accumulated interest and the total return of the underlying instrument calculated on the agreed notional principal amount.

- Additional payment

The payment may occur during the lifetime of the contract is undertstood as a premium or fee payment of some sort for the contract.

- Close contract

The transaction instance of the closing of the contract should contain at least one movement with quantity = -1 of the TotalReturnSwap instrument. Additionally the reset payment amount (see description above) may also be contained in the transaction as separate movement if not delivered as separate transaction

- Unwind

The business event of an unwind typically includes all necessary movements in order the close the contract before maturity, this may include closing of contract, interests, fees, additional payments etc.

### Credit Default Swap

- Open contract

The transaction instance of the opening of the contract should contain at minimal one movement with quantity = 1 of of the CreditDefaultSwap instrument. Make sure to set the properties on the contract instrument properly (principal, underlying instrument and maturity)

- Upfront payment

The payment typically occurs before the contract comes into effect is undertstood as a premium payment for the default 'insurance'.

- Additional payment

The payment may occur during the lifetime of the contract  is undertstood as a premium or fee payment of some sort for the contract.

- Close contract

The transaction instance of the closing of the contract should contain at least one movement with quantity = -1 of the CreditDefaultSwap instrument.

- Credit event

An occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions). The credit event is a trigger that causes the CDS buyer to settle the contract - typically a default in the form of bankruptsy or similar.
For a single-name CDS the resulting payment will consist of the principal amount. For basketized CDS the default of a constituant may result in a payment of a fraction of the principal and an adjustment of the factor of the CDS. Instead of a cash settlement the credit event may result in the issuance of a new bond to the CDS buyer called physical settlement.

- Unwind

The business event of an unwind typically includes all necessary movements in order the close the contract before maturity, this may include closing of contract, interests, fees, additional payments etc.

