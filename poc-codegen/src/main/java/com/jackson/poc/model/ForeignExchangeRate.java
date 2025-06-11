package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An exchange rate is a rate at which one currency will be exchanged for another currency.
 */

@Schema(name = "ForeignExchangeRate", description = "An exchange rate is a rate at which one currency will be exchanged for another currency.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class ForeignExchangeRate {

  private BigDecimal value;

  private String sourceCurrency;

  private String targetCurrency;

  public ForeignExchangeRate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ForeignExchangeRate(BigDecimal value, String sourceCurrency, String targetCurrency) {
    this.value = value;
    this.sourceCurrency = sourceCurrency;
    this.targetCurrency = targetCurrency;
  }

  public ForeignExchangeRate value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Current rate as decimal.
   * @return value
   */
  @NotNull @Valid 
  @Schema(name = "value", example = "0.98", description = "Current rate as decimal.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public ForeignExchangeRate sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return sourceCurrency
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "sourceCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceCurrency")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public ForeignExchangeRate targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return targetCurrency
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "targetCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetCurrency")
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForeignExchangeRate foreignExchangeRate = (ForeignExchangeRate) o;
    return Objects.equals(this.value, foreignExchangeRate.value) &&
        Objects.equals(this.sourceCurrency, foreignExchangeRate.sourceCurrency) &&
        Objects.equals(this.targetCurrency, foreignExchangeRate.targetCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, sourceCurrency, targetCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForeignExchangeRate {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

