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
 * Type of the financial instrument.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public enum FinancialInstrumentType {
  
  CASH("cash"),
  
  BOND("bond"),
  
  EQUITY("equity"),
  
  FUND("fund"),
  
  INDEX("index"),
  
  COMMODITY("commodity"),
  
  OPTION("option"),
  
  FUTURE("future"),
  
  FX_FORWARD("fxForward"),
  
  FX_SWAP("fxSwap"),
  
  FX_OPTION("fxOption"),
  
  MORTGAGE("mortgage"),
  
  CREDIT("credit"),
  
  FIXED_LOAN("fixedLoan"),
  
  FIXED_DEPOSIT("fixedDeposit"),
  
  CALLABLE_LOAN("callableLoan"),
  
  CALLABLE_DEPOSIT("callableDeposit"),
  
  INTEREST_RATE_SWAP("interestRateSwap"),
  
  TOTAL_RETURN_SWAP("totalReturnSwap"),
  
  CREDIT_DEFAULT_SWAP("creditDefaultSwap"),
  
  CRYPTO_ASSET("cryptoAsset"),
  
  OTHER("other");

  private String value;

  FinancialInstrumentType(String value) {
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
  public static FinancialInstrumentType fromValue(String value) {
    for (FinancialInstrumentType b : FinancialInstrumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

