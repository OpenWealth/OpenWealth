package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the transaction.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public enum TransactionType {
  
  ACCUMULATION("accumulation"),
  
  ADDITIONAL_PAYMENT("additionalPayment"),
  
  ADJUST_NOTIONAL("adjustNotional"),
  
  AMORTIZATION_AND_INTEREST_PAYMENT("amortizationAndInterestPayment"),
  
  ASSIGNMENT("assignment"),
  
  ASSIMILATION("assimilation"),
  
  BONUS("bonus"),
  
  BUY("buy"),
  
  BUY_TO_CLOSE("buyToClose"),
  
  CAPITAL_INCREASE("capitalIncrease"),
  
  CLOSE_CONTRACT("closeContract"),
  
  CONVERSION_BOND_SHARE("conversionBondShare"),
  
  COUPON("coupon"),
  
  CREDIT_EVENT("creditEvent"),
  
  DECREASE_PRINCIPAL("decreasePrincipal"),
  
  DELIVERY_FREE_OF_PAYMENT("deliveryFreeOfPayment"),
  
  DELIVERY_VS_PAYMENT("deliveryVsPayment"),
  
  DIVIDEND_CASH("dividendCash"),
  
  DIVIDEND_CHOICE("dividendChoice"),
  
  DIVIDEND_REINVESTMENT("dividendReinvestment"),
  
  DIVIDEND_STOCK("dividendStock"),
  
  EXERCISE("exercise"),
  
  EXPIRATION("expiration"),
  
  FEES("fees"),
  
  FINAL_LIQUIDATION_PAYMENT("finalLiquidationPayment"),
  
  FX_SPOT("fxSpot"),
  
  INCREASE_PRINCIPAL("increasePrincipal"),
  
  INFLOW_CASH("inflowCash"),
  
  INSTRUMENT_EXCHANGE("instrumentExchange"),
  
  INTEREST_PAYMENT("interestPayment"),
  
  INTERNAL_TRANSFER("internalTransfer"),
  
  LIQUIDATION_PAYMENT("liquidationPayment"),
  
  MERGER("merger"),
  
  OPEN_CONTRACT("openContract"),
  
  OTHER("other"),
  
  OUTFLOW_CASH("outflowCash"),
  
  PREMIUM("premium"),
  
  PREPAYMENT_SUBSTITUTION("prepaymentSubstitution"),
  
  RECEIVE_FREE_OF_PAYMENT("receiveFreeOfPayment"),
  
  RECEIVE_VS_PAYMENT("receiveVsPayment"),
  
  REDEMPTION("redemption"),
  
  REDEMPTION_PARTIAL("redemptionPartial"),
  
  REDEMPTION_PRIOR("redemptionPrior"),
  
  REDUCTION_OF_NOMINAL("reductionOfNominal"),
  
  RESET_PAYMENT("resetPayment"),
  
  RIGHT_DISTRIBUTION("rightDistribution"),
  
  SELL("sell"),
  
  SELL_TO_OPEN("sellToOpen"),
  
  SPIN_OFF("spinOff"),
  
  STOCK_SPLIT("stockSplit"),
  
  SUBSCRIPTION("subscription"),
  
  TAX_CORRECTIONS("taxCorrections"),
  
  TAXES("taxes"),
  
  TRANSFER_METAL_PHYSICAL("transferMetalPhysical"),
  
  UNWIND("unwind"),
  
  VARIATION_MARGIN("variationMargin");

  private String value;

  TransactionType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionType fromValue(String value) {
    for (TransactionType b : TransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

