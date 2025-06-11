package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.FinancialInstrument;
import com.jackson.poc.model.Movement;
import com.jackson.poc.model.PlaceOfTrade;
import com.jackson.poc.model.PostingAmount;
import com.jackson.poc.model.Price;
import com.jackson.poc.model.Quantity;
import com.jackson.poc.model.TransactionType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Transaction entity.
 */

@Schema(name = "Transaction", description = "Transaction entity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Transaction {

  private String id;

  private TransactionType type;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate transactionDate;

  private String customerId;

  private Boolean reversalIndicator = false;

  private Boolean endOfDayIndicator;

  private @Nullable String reference;

  private @Nullable String description;

  private @Nullable PlaceOfTrade placeOfTrade;

  private @Nullable String reversedTransactionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate tradeDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate settlementDate;

  private @Nullable FinancialInstrument triggeringFinancialInstrument;

  private @Nullable Quantity triggeringQuantity;

  private @Nullable Price triggeringPrice;

  @Valid
  private List<@Valid Movement> movementList = new ArrayList<>();

  @Valid
  private List<@Valid PostingAmount> postingAmountList = new ArrayList<>();

  private @Nullable String settlementCurrency;

  private @Nullable String additionalDetails;

  public Transaction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transaction(String id, TransactionType type, LocalDate transactionDate, String customerId, Boolean reversalIndicator, Boolean endOfDayIndicator) {
    this.id = id;
    this.type = type;
    this.transactionDate = transactionDate;
    this.customerId = customerId;
    this.reversalIndicator = reversalIndicator;
    this.endOfDayIndicator = endOfDayIndicator;
  }

  public Transaction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Transaction ID given by the bank.
   * @return id
   */
  @Size(max = 128) 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "9876-54321", description = "Transaction ID given by the bank.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Transaction type(TransactionType type) {
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
  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public Transaction transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return transactionDate
   */
  @NotNull @Valid 
  @Schema(name = "transactionDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionDate")
  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Unique and unambiguous identification used by the bank for the customer.
   * @return customerId
   */
  @NotNull 
  @Schema(name = "customerId", example = "12345-6", description = "Unique and unambiguous identification used by the bank for the customer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Transaction reversalIndicator(Boolean reversalIndicator) {
    this.reversalIndicator = reversalIndicator;
    return this;
  }

  /**
   * Indicates whether it is the reversal of a previously reported movement.
   * @return reversalIndicator
   */
  @NotNull 
  @Schema(name = "reversalIndicator", example = "false", description = "Indicates whether it is the reversal of a previously reported movement.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reversalIndicator")
  public Boolean getReversalIndicator() {
    return reversalIndicator;
  }

  public void setReversalIndicator(Boolean reversalIndicator) {
    this.reversalIndicator = reversalIndicator;
  }

  public Transaction endOfDayIndicator(Boolean endOfDayIndicator) {
    this.endOfDayIndicator = endOfDayIndicator;
    return this;
  }

  /**
   * Indicates if the transaction has been confirmed by the end-of-day (eod) processing.
   * @return endOfDayIndicator
   */
  @NotNull 
  @Schema(name = "endOfDayIndicator", example = "true", description = "Indicates if the transaction has been confirmed by the end-of-day (eod) processing.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endOfDayIndicator")
  public Boolean getEndOfDayIndicator() {
    return endOfDayIndicator;
  }

  public void setEndOfDayIndicator(Boolean endOfDayIndicator) {
    this.endOfDayIndicator = endOfDayIndicator;
  }

  public Transaction reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Transaction reference as used in the transaction statement. This could be equal to the id of the transaction but may not if GUID are used to identify the transaction. 
   * @return reference
   */
  
  @Schema(name = "reference", example = "XS12345678", description = "Transaction reference as used in the transaction statement. This could be equal to the id of the transaction but may not if GUID are used to identify the transaction. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human readable description of the transaction. Often referred to as 'Buchungs-Text' in german transaction statements.
   * @return description
   */
  
  @Schema(name = "description", example = "Buy 500 Apple Inc at 176 USD", description = "Human readable description of the transaction. Often referred to as 'Buchungs-Text' in german transaction statements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction placeOfTrade(PlaceOfTrade placeOfTrade) {
    this.placeOfTrade = placeOfTrade;
    return this;
  }

  /**
   * Get placeOfTrade
   * @return placeOfTrade
   */
  @Valid 
  @Schema(name = "placeOfTrade", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfTrade")
  public PlaceOfTrade getPlaceOfTrade() {
    return placeOfTrade;
  }

  public void setPlaceOfTrade(PlaceOfTrade placeOfTrade) {
    this.placeOfTrade = placeOfTrade;
  }

  public Transaction reversedTransactionId(String reversedTransactionId) {
    this.reversedTransactionId = reversedTransactionId;
    return this;
  }

  /**
   * States the identification of the transaction that was reversed.
   * @return reversedTransactionId
   */
  @Size(max = 128) 
  @Schema(name = "reversedTransactionId", example = "2134123-415", description = "States the identification of the transaction that was reversed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reversedTransactionId")
  public String getReversedTransactionId() {
    return reversedTransactionId;
  }

  public void setReversedTransactionId(String reversedTransactionId) {
    this.reversedTransactionId = reversedTransactionId;
  }

  public Transaction tradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return tradeDate
   */
  @Valid 
  @Schema(name = "tradeDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradeDate")
  public LocalDate getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
  }

  public Transaction settlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return settlementDate
   */
  @Valid 
  @Schema(name = "settlementDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settlementDate")
  public LocalDate getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }

  public Transaction triggeringFinancialInstrument(FinancialInstrument triggeringFinancialInstrument) {
    this.triggeringFinancialInstrument = triggeringFinancialInstrument;
    return this;
  }

  /**
   * Get triggeringFinancialInstrument
   * @return triggeringFinancialInstrument
   */
  @Valid 
  @Schema(name = "triggeringFinancialInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeringFinancialInstrument")
  public FinancialInstrument getTriggeringFinancialInstrument() {
    return triggeringFinancialInstrument;
  }

  public void setTriggeringFinancialInstrument(FinancialInstrument triggeringFinancialInstrument) {
    this.triggeringFinancialInstrument = triggeringFinancialInstrument;
  }

  public Transaction triggeringQuantity(Quantity triggeringQuantity) {
    this.triggeringQuantity = triggeringQuantity;
    return this;
  }

  /**
   * Get triggeringQuantity
   * @return triggeringQuantity
   */
  @Valid 
  @Schema(name = "triggeringQuantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeringQuantity")
  public Quantity getTriggeringQuantity() {
    return triggeringQuantity;
  }

  public void setTriggeringQuantity(Quantity triggeringQuantity) {
    this.triggeringQuantity = triggeringQuantity;
  }

  public Transaction triggeringPrice(Price triggeringPrice) {
    this.triggeringPrice = triggeringPrice;
    return this;
  }

  /**
   * Get triggeringPrice
   * @return triggeringPrice
   */
  @Valid 
  @Schema(name = "triggeringPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggeringPrice")
  public Price getTriggeringPrice() {
    return triggeringPrice;
  }

  public void setTriggeringPrice(Price triggeringPrice) {
    this.triggeringPrice = triggeringPrice;
  }

  public Transaction movementList(List<@Valid Movement> movementList) {
    this.movementList = movementList;
    return this;
  }

  public Transaction addMovementListItem(Movement movementListItem) {
    if (this.movementList == null) {
      this.movementList = new ArrayList<>();
    }
    this.movementList.add(movementListItem);
    return this;
  }

  /**
   * List of movements belonging to a transaction from a banks perspective.
   * @return movementList
   */
  @Valid 
  @Schema(name = "movementList", description = "List of movements belonging to a transaction from a banks perspective.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("movementList")
  public List<@Valid Movement> getMovementList() {
    return movementList;
  }

  public void setMovementList(List<@Valid Movement> movementList) {
    this.movementList = movementList;
  }

  public Transaction postingAmountList(List<@Valid PostingAmount> postingAmountList) {
    this.postingAmountList = postingAmountList;
    return this;
  }

  public Transaction addPostingAmountListItem(PostingAmount postingAmountListItem) {
    if (this.postingAmountList == null) {
      this.postingAmountList = new ArrayList<>();
    }
    this.postingAmountList.add(postingAmountListItem);
    return this;
  }

  /**
   * List of total amounts of money that is to be/was posted to respective accounts in the account currency.
   * @return postingAmountList
   */
  @Valid 
  @Schema(name = "postingAmountList", description = "List of total amounts of money that is to be/was posted to respective accounts in the account currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postingAmountList")
  public List<@Valid PostingAmount> getPostingAmountList() {
    return postingAmountList;
  }

  public void setPostingAmountList(List<@Valid PostingAmount> postingAmountList) {
    this.postingAmountList = postingAmountList;
  }

  public Transaction settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return settlementCurrency
   */
  @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "settlementCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settlementCurrency")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public Transaction additionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Provides additional details on the transaction which can not be included within the structured fields of the message.
   * @return additionalDetails
   */
  @Size(max = 70) 
  @Schema(name = "additionalDetails", example = "Replaces transaction nr. 12234567489", description = "Provides additional details on the transaction which can not be included within the structured fields of the message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.transactionDate, transaction.transactionDate) &&
        Objects.equals(this.customerId, transaction.customerId) &&
        Objects.equals(this.reversalIndicator, transaction.reversalIndicator) &&
        Objects.equals(this.endOfDayIndicator, transaction.endOfDayIndicator) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.placeOfTrade, transaction.placeOfTrade) &&
        Objects.equals(this.reversedTransactionId, transaction.reversedTransactionId) &&
        Objects.equals(this.tradeDate, transaction.tradeDate) &&
        Objects.equals(this.settlementDate, transaction.settlementDate) &&
        Objects.equals(this.triggeringFinancialInstrument, transaction.triggeringFinancialInstrument) &&
        Objects.equals(this.triggeringQuantity, transaction.triggeringQuantity) &&
        Objects.equals(this.triggeringPrice, transaction.triggeringPrice) &&
        Objects.equals(this.movementList, transaction.movementList) &&
        Objects.equals(this.postingAmountList, transaction.postingAmountList) &&
        Objects.equals(this.settlementCurrency, transaction.settlementCurrency) &&
        Objects.equals(this.additionalDetails, transaction.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, transactionDate, customerId, reversalIndicator, endOfDayIndicator, reference, description, placeOfTrade, reversedTransactionId, tradeDate, settlementDate, triggeringFinancialInstrument, triggeringQuantity, triggeringPrice, movementList, postingAmountList, settlementCurrency, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    reversalIndicator: ").append(toIndentedString(reversalIndicator)).append("\n");
    sb.append("    endOfDayIndicator: ").append(toIndentedString(endOfDayIndicator)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    placeOfTrade: ").append(toIndentedString(placeOfTrade)).append("\n");
    sb.append("    reversedTransactionId: ").append(toIndentedString(reversedTransactionId)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    triggeringFinancialInstrument: ").append(toIndentedString(triggeringFinancialInstrument)).append("\n");
    sb.append("    triggeringQuantity: ").append(toIndentedString(triggeringQuantity)).append("\n");
    sb.append("    triggeringPrice: ").append(toIndentedString(triggeringPrice)).append("\n");
    sb.append("    movementList: ").append(toIndentedString(movementList)).append("\n");
    sb.append("    postingAmountList: ").append(toIndentedString(postingAmountList)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
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

