package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Foreign exchange rate of given by a defined source and used for valuation.
 */

@Schema(name = "ValuationForeignExchangeRate", description = "Foreign exchange rate of given by a defined source and used for valuation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class ValuationForeignExchangeRate {

  private BigDecimal value;

  private String sourceCurrency;

  private String targetCurrency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate rateDate;

  private @Nullable String sourceOfRate;

  public ValuationForeignExchangeRate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValuationForeignExchangeRate(BigDecimal value, String sourceCurrency, String targetCurrency) {
    this.value = value;
    this.sourceCurrency = sourceCurrency;
    this.targetCurrency = targetCurrency;
  }

  public ValuationForeignExchangeRate value(BigDecimal value) {
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

  public ValuationForeignExchangeRate sourceCurrency(String sourceCurrency) {
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

  public ValuationForeignExchangeRate targetCurrency(String targetCurrency) {
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

  public ValuationForeignExchangeRate rateDate(LocalDate rateDate) {
    this.rateDate = rateDate;
    return this;
  }

  /**
   * Date of rate.
   * @return rateDate
   */
  @Valid 
  @Schema(name = "rateDate", example = "2018-04-13", description = "Date of rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateDate")
  public LocalDate getRateDate() {
    return rateDate;
  }

  public void setRateDate(LocalDate rateDate) {
    this.rateDate = rateDate;
  }

  public ValuationForeignExchangeRate sourceOfRate(String sourceOfRate) {
    this.sourceOfRate = sourceOfRate;
    return this;
  }

  /**
   * Indicates the source of the (market) price.
   * @return sourceOfRate
   */
  @Size(max = 70) 
  @Schema(name = "sourceOfRate", example = "Reuters 4 o'clock", description = "Indicates the source of the (market) price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceOfRate")
  public String getSourceOfRate() {
    return sourceOfRate;
  }

  public void setSourceOfRate(String sourceOfRate) {
    this.sourceOfRate = sourceOfRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationForeignExchangeRate valuationForeignExchangeRate = (ValuationForeignExchangeRate) o;
    return Objects.equals(this.value, valuationForeignExchangeRate.value) &&
        Objects.equals(this.sourceCurrency, valuationForeignExchangeRate.sourceCurrency) &&
        Objects.equals(this.targetCurrency, valuationForeignExchangeRate.targetCurrency) &&
        Objects.equals(this.rateDate, valuationForeignExchangeRate.rateDate) &&
        Objects.equals(this.sourceOfRate, valuationForeignExchangeRate.sourceOfRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, sourceCurrency, targetCurrency, rateDate, sourceOfRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationForeignExchangeRate {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    rateDate: ").append(toIndentedString(rateDate)).append("\n");
    sb.append("    sourceOfRate: ").append(toIndentedString(sourceOfRate)).append("\n");
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

