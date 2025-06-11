package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jackson.poc.model.Account;
import com.jackson.poc.model.CurrencyAmount;
import com.jackson.poc.model.FinancialInstrument;
import com.jackson.poc.model.ForeignExchangeRate;
import com.jackson.poc.model.Price;
import com.jackson.poc.model.Quantity;
import com.jackson.poc.model.Valuation;
import com.jackson.poc.model.ValuationForeignExchangeRate;
import com.jackson.poc.model.ValuationPrice;
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
 * Valuated position entity.
 */

@Schema(name = "ValuatedPosition", description = "Valuated position entity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class ValuatedPosition {

  private Boolean endOfDayIndicator;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate positionDate;

  private Quantity quantity;

  private Valuation valuation;

  private @Nullable ValuationPrice price;

  private @Nullable ValuationForeignExchangeRate foreignExchangeRate;

  private @Nullable Price costPrice;

  private @Nullable ForeignExchangeRate costForeignExchangeRate;

  private @Nullable CurrencyAmount accruedInterest;

  private @Nullable Integer numberOfDaysAccrued;

  private @Nullable Quantity blockedQuantity;

  private String id;

  private FinancialInstrument financialInstrument;

  private Account account;

  private @Nullable String name;

  private @Nullable String currency;

  private @Nullable String safekeepingPlace;

  private @Nullable String additionalCustodianInformation;

  private @Nullable String additionalDetails;

  public ValuatedPosition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValuatedPosition(Boolean endOfDayIndicator, LocalDate positionDate, Quantity quantity, Valuation valuation, String id, FinancialInstrument financialInstrument, Account account) {
    this.endOfDayIndicator = endOfDayIndicator;
    this.positionDate = positionDate;
    this.quantity = quantity;
    this.valuation = valuation;
    this.id = id;
    this.financialInstrument = financialInstrument;
    this.account = account;
  }

  public ValuatedPosition endOfDayIndicator(Boolean endOfDayIndicator) {
    this.endOfDayIndicator = endOfDayIndicator;
    return this;
  }

  /**
   * Indicates if the position has been confirmed by the end-of-day (eod) processing.
   * @return endOfDayIndicator
   */
  @NotNull 
  @Schema(name = "endOfDayIndicator", example = "true", description = "Indicates if the position has been confirmed by the end-of-day (eod) processing.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endOfDayIndicator")
  public Boolean getEndOfDayIndicator() {
    return endOfDayIndicator;
  }

  public void setEndOfDayIndicator(Boolean endOfDayIndicator) {
    this.endOfDayIndicator = endOfDayIndicator;
  }

  public ValuatedPosition positionDate(LocalDate positionDate) {
    this.positionDate = positionDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return positionDate
   */
  @NotNull @Valid 
  @Schema(name = "positionDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("positionDate")
  public LocalDate getPositionDate() {
    return positionDate;
  }

  public void setPositionDate(LocalDate positionDate) {
    this.positionDate = positionDate;
  }

  public ValuatedPosition quantity(Quantity quantity) {
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

  public ValuatedPosition valuation(Valuation valuation) {
    this.valuation = valuation;
    return this;
  }

  /**
   * Get valuation
   * @return valuation
   */
  @NotNull @Valid 
  @Schema(name = "valuation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("valuation")
  public Valuation getValuation() {
    return valuation;
  }

  public void setValuation(Valuation valuation) {
    this.valuation = valuation;
  }

  public ValuatedPosition price(ValuationPrice price) {
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
  public ValuationPrice getPrice() {
    return price;
  }

  public void setPrice(ValuationPrice price) {
    this.price = price;
  }

  public ValuatedPosition foreignExchangeRate(ValuationForeignExchangeRate foreignExchangeRate) {
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
  public ValuationForeignExchangeRate getForeignExchangeRate() {
    return foreignExchangeRate;
  }

  public void setForeignExchangeRate(ValuationForeignExchangeRate foreignExchangeRate) {
    this.foreignExchangeRate = foreignExchangeRate;
  }

  public ValuatedPosition costPrice(Price costPrice) {
    this.costPrice = costPrice;
    return this;
  }

  /**
   * Get costPrice
   * @return costPrice
   */
  @Valid 
  @Schema(name = "costPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costPrice")
  public Price getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(Price costPrice) {
    this.costPrice = costPrice;
  }

  public ValuatedPosition costForeignExchangeRate(ForeignExchangeRate costForeignExchangeRate) {
    this.costForeignExchangeRate = costForeignExchangeRate;
    return this;
  }

  /**
   * Get costForeignExchangeRate
   * @return costForeignExchangeRate
   */
  @Valid 
  @Schema(name = "costForeignExchangeRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costForeignExchangeRate")
  public ForeignExchangeRate getCostForeignExchangeRate() {
    return costForeignExchangeRate;
  }

  public void setCostForeignExchangeRate(ForeignExchangeRate costForeignExchangeRate) {
    this.costForeignExchangeRate = costForeignExchangeRate;
  }

  public ValuatedPosition accruedInterest(CurrencyAmount accruedInterest) {
    this.accruedInterest = accruedInterest;
    return this;
  }

  /**
   * Get accruedInterest
   * @return accruedInterest
   */
  @Valid 
  @Schema(name = "accruedInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accruedInterest")
  public CurrencyAmount getAccruedInterest() {
    return accruedInterest;
  }

  public void setAccruedInterest(CurrencyAmount accruedInterest) {
    this.accruedInterest = accruedInterest;
  }

  public ValuatedPosition numberOfDaysAccrued(Integer numberOfDaysAccrued) {
    this.numberOfDaysAccrued = numberOfDaysAccrued;
    return this;
  }

  /**
   * Number of days used for calculating the accrued interest amount.
   * @return numberOfDaysAccrued
   */
  
  @Schema(name = "numberOfDaysAccrued", example = "34", description = "Number of days used for calculating the accrued interest amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfDaysAccrued")
  public Integer getNumberOfDaysAccrued() {
    return numberOfDaysAccrued;
  }

  public void setNumberOfDaysAccrued(Integer numberOfDaysAccrued) {
    this.numberOfDaysAccrued = numberOfDaysAccrued;
  }

  public ValuatedPosition blockedQuantity(Quantity blockedQuantity) {
    this.blockedQuantity = blockedQuantity;
    return this;
  }

  /**
   * Get blockedQuantity
   * @return blockedQuantity
   */
  @Valid 
  @Schema(name = "blockedQuantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedQuantity")
  public Quantity getBlockedQuantity() {
    return blockedQuantity;
  }

  public void setBlockedQuantity(Quantity blockedQuantity) {
    this.blockedQuantity = blockedQuantity;
  }

  public ValuatedPosition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identification for the position given by the bank.
   * @return id
   */
  @NotNull @Size(max = 128) 
  @Schema(name = "id", example = "876-543219", description = "Identification for the position given by the bank.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ValuatedPosition financialInstrument(FinancialInstrument financialInstrument) {
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

  public ValuatedPosition account(Account account) {
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

  public ValuatedPosition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the position.
   * @return name
   */
  @Size(max = 80) 
  @Schema(name = "name", example = "Stark Industries Inc.", description = "Name of the position.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ValuatedPosition currency(String currency) {
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

  public ValuatedPosition safekeepingPlace(String safekeepingPlace) {
    this.safekeepingPlace = safekeepingPlace;
    return this;
  }

  /**
   * BIC of the place where the securities are safe-kept, physically or notionally.
   * @return safekeepingPlace
   */
  @Pattern(regexp = "^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$") 
  @Schema(name = "safekeepingPlace", example = "INSECHZZXXX", description = "BIC of the place where the securities are safe-kept, physically or notionally.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("safekeepingPlace")
  public String getSafekeepingPlace() {
    return safekeepingPlace;
  }

  public void setSafekeepingPlace(String safekeepingPlace) {
    this.safekeepingPlace = safekeepingPlace;
  }

  public ValuatedPosition additionalCustodianInformation(String additionalCustodianInformation) {
    this.additionalCustodianInformation = additionalCustodianInformation;
    return this;
  }

  /**
   * Used for special use cases where safekeepingPlace is not sufficient. BIC of the place where the securities are safe-kept, physically or notionally. 
   * @return additionalCustodianInformation
   */
  @Pattern(regexp = "^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$") 
  @Schema(name = "additionalCustodianInformation", example = "INSECHZZXXX", description = "Used for special use cases where safekeepingPlace is not sufficient. BIC of the place where the securities are safe-kept, physically or notionally. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalCustodianInformation")
  public String getAdditionalCustodianInformation() {
    return additionalCustodianInformation;
  }

  public void setAdditionalCustodianInformation(String additionalCustodianInformation) {
    this.additionalCustodianInformation = additionalCustodianInformation;
  }

  public ValuatedPosition additionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Provides additional information on the position.
   * @return additionalDetails
   */
  @Size(max = 70) 
  @Schema(name = "additionalDetails", example = "Belongs to contract 129959959", description = "Provides additional information on the position.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalDetails")
  public String getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValuatedPosition valuatedPosition = (ValuatedPosition) o;
    return Objects.equals(this.endOfDayIndicator, valuatedPosition.endOfDayIndicator) &&
        Objects.equals(this.positionDate, valuatedPosition.positionDate) &&
        Objects.equals(this.quantity, valuatedPosition.quantity) &&
        Objects.equals(this.valuation, valuatedPosition.valuation) &&
        Objects.equals(this.price, valuatedPosition.price) &&
        Objects.equals(this.foreignExchangeRate, valuatedPosition.foreignExchangeRate) &&
        Objects.equals(this.costPrice, valuatedPosition.costPrice) &&
        Objects.equals(this.costForeignExchangeRate, valuatedPosition.costForeignExchangeRate) &&
        Objects.equals(this.accruedInterest, valuatedPosition.accruedInterest) &&
        Objects.equals(this.numberOfDaysAccrued, valuatedPosition.numberOfDaysAccrued) &&
        Objects.equals(this.blockedQuantity, valuatedPosition.blockedQuantity) &&
        Objects.equals(this.id, valuatedPosition.id) &&
        Objects.equals(this.financialInstrument, valuatedPosition.financialInstrument) &&
        Objects.equals(this.account, valuatedPosition.account) &&
        Objects.equals(this.name, valuatedPosition.name) &&
        Objects.equals(this.currency, valuatedPosition.currency) &&
        Objects.equals(this.safekeepingPlace, valuatedPosition.safekeepingPlace) &&
        Objects.equals(this.additionalCustodianInformation, valuatedPosition.additionalCustodianInformation) &&
        Objects.equals(this.additionalDetails, valuatedPosition.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endOfDayIndicator, positionDate, quantity, valuation, price, foreignExchangeRate, costPrice, costForeignExchangeRate, accruedInterest, numberOfDaysAccrued, blockedQuantity, id, financialInstrument, account, name, currency, safekeepingPlace, additionalCustodianInformation, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValuatedPosition {\n");
    sb.append("    endOfDayIndicator: ").append(toIndentedString(endOfDayIndicator)).append("\n");
    sb.append("    positionDate: ").append(toIndentedString(positionDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    valuation: ").append(toIndentedString(valuation)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    foreignExchangeRate: ").append(toIndentedString(foreignExchangeRate)).append("\n");
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
    sb.append("    costForeignExchangeRate: ").append(toIndentedString(costForeignExchangeRate)).append("\n");
    sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
    sb.append("    numberOfDaysAccrued: ").append(toIndentedString(numberOfDaysAccrued)).append("\n");
    sb.append("    blockedQuantity: ").append(toIndentedString(blockedQuantity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    financialInstrument: ").append(toIndentedString(financialInstrument)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    safekeepingPlace: ").append(toIndentedString(safekeepingPlace)).append("\n");
    sb.append("    additionalCustodianInformation: ").append(toIndentedString(additionalCustodianInformation)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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

