package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Price used for valuation purpose.
 */

@Schema(name = "ValuationPrice", description = "Price used for valuation purpose.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class ValuationPrice {

  /**
   * Indicates whether the price amount is depicted as actual currency amount per unit or as percentage.
   */
  public enum TypeEnum {
    ACTUAL("actual"),
    
    PERCENTAGE("percentage");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private BigDecimal value;

  private @Nullable String currency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate priceDate;

  private @Nullable String sourceOfPrice;

  public ValuationPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValuationPrice(TypeEnum type, BigDecimal value) {
    this.type = type;
    this.value = value;
  }

  public ValuationPrice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether the price amount is depicted as actual currency amount per unit or as percentage.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "percentage", description = "Indicates whether the price amount is depicted as actual currency amount per unit or as percentage.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ValuationPrice value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Signed decimal number.
   * @return value
   */
  @NotNull @Valid 
  @Schema(name = "value", example = "12000", description = "Signed decimal number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public ValuationPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return currency
   */
  @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ValuationPrice priceDate(LocalDate priceDate) {
    this.priceDate = priceDate;
    return this;
  }

  /**
   * Date of the price.
   * @return priceDate
   */
  @Valid 
  @Schema(name = "priceDate", example = "2018-04-13", description = "Date of the price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceDate")
  public LocalDate getPriceDate() {
    return priceDate;
  }

  public void setPriceDate(LocalDate priceDate) {
    this.priceDate = priceDate;
  }

  public ValuationPrice sourceOfPrice(String sourceOfPrice) {
    this.sourceOfPrice = sourceOfPrice;
    return this;
  }

  /**
   * Indicates the source of the (market)price.
   * @return sourceOfPrice
   */
  @Size(max = 70) 
  @Schema(name = "sourceOfPrice", example = "SIX Swiss Exchange", description = "Indicates the source of the (market)price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceOfPrice")
  public String getSourceOfPrice() {
    return sourceOfPrice;
  }

  public void setSourceOfPrice(String sourceOfPrice) {
    this.sourceOfPrice = sourceOfPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuationPrice valuationPrice = (ValuationPrice) o;
    return Objects.equals(this.type, valuationPrice.type) &&
        Objects.equals(this.value, valuationPrice.value) &&
        Objects.equals(this.currency, valuationPrice.currency) &&
        Objects.equals(this.priceDate, valuationPrice.priceDate) &&
        Objects.equals(this.sourceOfPrice, valuationPrice.sourceOfPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, currency, priceDate, sourceOfPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuationPrice {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priceDate: ").append(toIndentedString(priceDate)).append("\n");
    sb.append("    sourceOfPrice: ").append(toIndentedString(sourceOfPrice)).append("\n");
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

