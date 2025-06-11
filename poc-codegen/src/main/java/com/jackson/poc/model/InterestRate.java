package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.DayCountBasis;
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
 * Per annum ratio of interest received or paid to the principal amount of the contract for a specific period of time.
 */

@Schema(name = "InterestRate", description = "Per annum ratio of interest received or paid to the principal amount of the contract for a specific period of time.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class InterestRate {

  /**
   * Indicates the type of interest, where - 'fixed' denotes a fixed interest rate for the agreed period. - 'variable' denotes a rate that fluctuates over time because it is based on an underlying benchmark ('basis') interest rate that changes periodically with the market. - 'staggered' denotes a rate that is set at different levels for different periods of time or different underlying principal amount. 
   */
  public enum TypeEnum {
    FIXED("fixed"),
    
    VARIABLE("variable"),
    
    STAGGERED("staggered");

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

  private @Nullable BigDecimal value;

  private @Nullable DayCountBasis dayCountBasis;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate paymentDate;

  /**
   * Specifies the frequency of an interest payment.
   */
  public enum PaymentFrequencyEnum {
    ANNUAL("annual"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    SEMI_ANNUAL("semiAnnual"),
    
    WEEKLY("weekly"),
    
    AT_MATURITY("atMaturity"),
    
    OTHER("other");

    private String value;

    PaymentFrequencyEnum(String value) {
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
    public static PaymentFrequencyEnum fromValue(String value) {
      for (PaymentFrequencyEnum b : PaymentFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PaymentFrequencyEnum paymentFrequency;

  private @Nullable String basis;

  private @Nullable BigDecimal spread;

  public InterestRate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InterestRate(TypeEnum type) {
    this.type = type;
  }

  public InterestRate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of interest, where - 'fixed' denotes a fixed interest rate for the agreed period. - 'variable' denotes a rate that fluctuates over time because it is based on an underlying benchmark ('basis') interest rate that changes periodically with the market. - 'staggered' denotes a rate that is set at different levels for different periods of time or different underlying principal amount. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "fixed", description = "Indicates the type of interest, where - 'fixed' denotes a fixed interest rate for the agreed period. - 'variable' denotes a rate that fluctuates over time because it is based on an underlying benchmark ('basis') interest rate that changes periodically with the market. - 'staggered' denotes a rate that is set at different levels for different periods of time or different underlying principal amount. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InterestRate value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Current rate as decimal.
   * @return value
   */
  @Valid 
  @Schema(name = "value", example = "0.00125", description = "Current rate as decimal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public InterestRate dayCountBasis(DayCountBasis dayCountBasis) {
    this.dayCountBasis = dayCountBasis;
    return this;
  }

  /**
   * Get dayCountBasis
   * @return dayCountBasis
   */
  @Valid 
  @Schema(name = "dayCountBasis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dayCountBasis")
  public DayCountBasis getDayCountBasis() {
    return dayCountBasis;
  }

  public void setDayCountBasis(DayCountBasis dayCountBasis) {
    this.dayCountBasis = dayCountBasis;
  }

  public InterestRate paymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return paymentDate
   */
  @Valid 
  @Schema(name = "paymentDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentDate")
  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public InterestRate paymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Specifies the frequency of an interest payment.
   * @return paymentFrequency
   */
  
  @Schema(name = "paymentFrequency", example = "quarterly", description = "Specifies the frequency of an interest payment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentFrequency")
  public PaymentFrequencyEnum getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public InterestRate basis(String basis) {
    this.basis = basis;
    return this;
  }

  /**
   * Benchmark by which floating rate will adjust in accordance with market conditions, such as LIBOR, EURIBOR.
   * @return basis
   */
  
  @Schema(name = "basis", example = "LIBOR", description = "Benchmark by which floating rate will adjust in accordance with market conditions, such as LIBOR, EURIBOR.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("basis")
  public String getBasis() {
    return basis;
  }

  public void setBasis(String basis) {
    this.basis = basis;
  }

  public InterestRate spread(BigDecimal spread) {
    this.spread = spread;
    return this;
  }

  /**
   * The floating rate will be equal to the base rate (basis) plus the spread.
   * @return spread
   */
  @Valid 
  @Schema(name = "spread", example = "0.001", description = "The floating rate will be equal to the base rate (basis) plus the spread.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spread")
  public BigDecimal getSpread() {
    return spread;
  }

  public void setSpread(BigDecimal spread) {
    this.spread = spread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestRate interestRate = (InterestRate) o;
    return Objects.equals(this.type, interestRate.type) &&
        Objects.equals(this.value, interestRate.value) &&
        Objects.equals(this.dayCountBasis, interestRate.dayCountBasis) &&
        Objects.equals(this.paymentDate, interestRate.paymentDate) &&
        Objects.equals(this.paymentFrequency, interestRate.paymentFrequency) &&
        Objects.equals(this.basis, interestRate.basis) &&
        Objects.equals(this.spread, interestRate.spread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, dayCountBasis, paymentDate, paymentFrequency, basis, spread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestRate {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dayCountBasis: ").append(toIndentedString(dayCountBasis)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    basis: ").append(toIndentedString(basis)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
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

