package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jackson.poc.model.CurrencyAmount;
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
 * Detailed information about the valuation of a position.
 */

@Schema(name = "Valuation", description = "Detailed information about the valuation of a position.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Valuation {

  private CurrencyAmount valueInPositionCurrency;

  private @Nullable CurrencyAmount valueInReferenceCurrency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate valuationDate;

  public Valuation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Valuation(CurrencyAmount valueInPositionCurrency) {
    this.valueInPositionCurrency = valueInPositionCurrency;
  }

  public Valuation valueInPositionCurrency(CurrencyAmount valueInPositionCurrency) {
    this.valueInPositionCurrency = valueInPositionCurrency;
    return this;
  }

  /**
   * Get valueInPositionCurrency
   * @return valueInPositionCurrency
   */
  @NotNull @Valid 
  @Schema(name = "valueInPositionCurrency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("valueInPositionCurrency")
  public CurrencyAmount getValueInPositionCurrency() {
    return valueInPositionCurrency;
  }

  public void setValueInPositionCurrency(CurrencyAmount valueInPositionCurrency) {
    this.valueInPositionCurrency = valueInPositionCurrency;
  }

  public Valuation valueInReferenceCurrency(CurrencyAmount valueInReferenceCurrency) {
    this.valueInReferenceCurrency = valueInReferenceCurrency;
    return this;
  }

  /**
   * Get valueInReferenceCurrency
   * @return valueInReferenceCurrency
   */
  @Valid 
  @Schema(name = "valueInReferenceCurrency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueInReferenceCurrency")
  public CurrencyAmount getValueInReferenceCurrency() {
    return valueInReferenceCurrency;
  }

  public void setValueInReferenceCurrency(CurrencyAmount valueInReferenceCurrency) {
    this.valueInReferenceCurrency = valueInReferenceCurrency;
  }

  public Valuation valuationDate(LocalDate valuationDate) {
    this.valuationDate = valuationDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return valuationDate
   */
  @Valid 
  @Schema(name = "valuationDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valuationDate")
  public LocalDate getValuationDate() {
    return valuationDate;
  }

  public void setValuationDate(LocalDate valuationDate) {
    this.valuationDate = valuationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Valuation valuation = (Valuation) o;
    return Objects.equals(this.valueInPositionCurrency, valuation.valueInPositionCurrency) &&
        Objects.equals(this.valueInReferenceCurrency, valuation.valueInReferenceCurrency) &&
        Objects.equals(this.valuationDate, valuation.valuationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueInPositionCurrency, valueInReferenceCurrency, valuationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Valuation {\n");
    sb.append("    valueInPositionCurrency: ").append(toIndentedString(valueInPositionCurrency)).append("\n");
    sb.append("    valueInReferenceCurrency: ").append(toIndentedString(valueInReferenceCurrency)).append("\n");
    sb.append("    valuationDate: ").append(toIndentedString(valuationDate)).append("\n");
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

