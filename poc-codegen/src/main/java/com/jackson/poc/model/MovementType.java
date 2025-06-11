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
 * Describes which kind of movement is reported from a banks perspective.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public enum MovementType {
  
  ACCRUED_INTEREST("accruedInterest"),
  
  ADDITIONAL_WITHHOLDING_TAX("additionalWithholdingTax"),
  
  ASSET("asset"),
  
  BROKERAGE_FEE("brokerageFee"),
  
  CAPITAL_GAIN_TAX("capitalGainTax"),
  
  CASH("cash"),
  
  COMMISSION("commission"),
  
  CUSTODY_FEE("custodyFee"),
  
  EXCHANGE_FEE("exchangeFee"),
  
  FINANCIAL_TRANSACTION_TAX("financialTransactionTax"),
  
  INTEREST("interest"),
  
  MANAGEMENT_FEE("managementFee"),
  
  OTHER_FEE("otherFee"),
  
  OTHER("other"),
  
  OTHER_TAX("otherTax"),
  
  PREMIUM("premium"),
  
  RECLAIMABLE_TAX("reclaimableTax"),
  
  REINVESTMENT_AMOUNT("reinvestmentAmount"),
  
  STAMP_DUTY("stampDuty"),
  
  THIRD_PARTY_FEE("thirdPartyFee"),
  
  TRANSACTION_FEE("transactionFee"),
  
  VALUE_ADDED_TAX("valueAddedTax"),
  
  WITHHOLDING_TAX("withholdingTax");

  private String value;

  MovementType(String value) {
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
  public static MovementType fromValue(String value) {
    for (MovementType b : MovementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

