package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.Account;
import com.jackson.poc.model.FinancialInstrument;
import com.jackson.poc.model.ForeignExchangeRate;
import com.jackson.poc.model.MovementType;
import com.jackson.poc.model.Price;
import com.jackson.poc.model.Quantity;
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
 * Describes a single movement/booking/flow within a transaction. Every transaction contains in the minimum one movement.
 */

@Schema(name = "Movement", description = "Describes a single movement/booking/flow within a transaction. Every transaction contains in the minimum one movement.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Movement {

  private MovementType type;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate movementDate;

  private FinancialInstrument financialInstrument;

  private Account account;

  private Quantity quantity;

  private String positionId;

  private @Nullable String positionCurrency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate valueDate;

  private @Nullable Price price;

  private @Nullable ForeignExchangeRate foreignExchangeRate;

  private @Nullable String movementTypeAdditionalInformation;

  public Movement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Movement(MovementType type, LocalDate movementDate, FinancialInstrument financialInstrument, Account account, Quantity quantity, String positionId) {
    this.type = type;
    this.movementDate = movementDate;
    this.financialInstrument = financialInstrument;
    this.account = account;
    this.quantity = quantity;
    this.positionId = positionId;
  }

  public Movement type(MovementType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public MovementType getType() {
    return type;
  }

  public void setType(MovementType type) {
    this.type = type;
  }

  public Movement movementDate(LocalDate movementDate) {
    this.movementDate = movementDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return movementDate
   */
  @NotNull @Valid 
  @Schema(name = "movementDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("movementDate")
  public LocalDate getMovementDate() {
    return movementDate;
  }

  public void setMovementDate(LocalDate movementDate) {
    this.movementDate = movementDate;
  }

  public Movement financialInstrument(FinancialInstrument financialInstrument) {
    this.financialInstrument = financialInstrument;
    return this;
  }

  /**
   * Get financialInstrument
   * @return financialInstrument
   */
  @NotNull @Valid 
  @Schema(name = "financialInstrument", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("financialInstrument")
  public FinancialInstrument getFinancialInstrument() {
    return financialInstrument;
  }

  public void setFinancialInstrument(FinancialInstrument financialInstrument) {
    this.financialInstrument = financialInstrument;
  }

  public Movement account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @NotNull @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Movement quantity(Quantity quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @NotNull @Valid 
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public Movement positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Identification for the position given by the bank.
   * @return positionId
   */
  @NotNull @Size(max = 128) 
  @Schema(name = "positionId", example = "1234566-12-1", description = "Identification for the position given by the bank.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("positionId")
  public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public Movement positionCurrency(String positionCurrency) {
    this.positionCurrency = positionCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return positionCurrency
   */
  @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "positionCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positionCurrency")
  public String getPositionCurrency() {
    return positionCurrency;
  }

  public void setPositionCurrency(String positionCurrency) {
    this.positionCurrency = positionCurrency;
  }

  public Movement valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return valueDate
   */
  @Valid 
  @Schema(name = "valueDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueDate")
  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public Movement price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Movement foreignExchangeRate(ForeignExchangeRate foreignExchangeRate) {
    this.foreignExchangeRate = foreignExchangeRate;
    return this;
  }

  /**
   * Get foreignExchangeRate
   * @return foreignExchangeRate
   */
  @Valid 
  @Schema(name = "foreignExchangeRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foreignExchangeRate")
  public ForeignExchangeRate getForeignExchangeRate() {
    return foreignExchangeRate;
  }

  public void setForeignExchangeRate(ForeignExchangeRate foreignExchangeRate) {
    this.foreignExchangeRate = foreignExchangeRate;
  }

  public Movement movementTypeAdditionalInformation(String movementTypeAdditionalInformation) {
    this.movementTypeAdditionalInformation = movementTypeAdditionalInformation;
    return this;
  }

  /**
   * Provides further details on an informative level, which goes beyond the granularity of the movementType.
   * @return movementTypeAdditionalInformation
   */
  @Size(max = 35) 
  @Schema(name = "movementTypeAdditionalInformation", example = "Fees for Reporting Service", description = "Provides further details on an informative level, which goes beyond the granularity of the movementType.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("movementTypeAdditionalInformation")
  public String getMovementTypeAdditionalInformation() {
    return movementTypeAdditionalInformation;
  }

  public void setMovementTypeAdditionalInformation(String movementTypeAdditionalInformation) {
    this.movementTypeAdditionalInformation = movementTypeAdditionalInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movement movement = (Movement) o;
    return Objects.equals(this.type, movement.type) &&
        Objects.equals(this.movementDate, movement.movementDate) &&
        Objects.equals(this.financialInstrument, movement.financialInstrument) &&
        Objects.equals(this.account, movement.account) &&
        Objects.equals(this.quantity, movement.quantity) &&
        Objects.equals(this.positionId, movement.positionId) &&
        Objects.equals(this.positionCurrency, movement.positionCurrency) &&
        Objects.equals(this.valueDate, movement.valueDate) &&
        Objects.equals(this.price, movement.price) &&
        Objects.equals(this.foreignExchangeRate, movement.foreignExchangeRate) &&
        Objects.equals(this.movementTypeAdditionalInformation, movement.movementTypeAdditionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, movementDate, financialInstrument, account, quantity, positionId, positionCurrency, valueDate, price, foreignExchangeRate, movementTypeAdditionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    movementDate: ").append(toIndentedString(movementDate)).append("\n");
    sb.append("    financialInstrument: ").append(toIndentedString(financialInstrument)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionCurrency: ").append(toIndentedString(positionCurrency)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    foreignExchangeRate: ").append(toIndentedString(foreignExchangeRate)).append("\n");
    sb.append("    movementTypeAdditionalInformation: ").append(toIndentedString(movementTypeAdditionalInformation)).append("\n");
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

