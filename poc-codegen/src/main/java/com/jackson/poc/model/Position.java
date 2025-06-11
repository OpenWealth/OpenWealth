package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jackson.poc.model.Account;
import com.jackson.poc.model.FinancialInstrument;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Position entity.
 */

@Schema(name = "Position", description = "Position entity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Position {

  private String id;

  private FinancialInstrument financialInstrument;

  private Account account;

  private @Nullable String name;

  private @Nullable String currency;

  private @Nullable String safekeepingPlace;

  private @Nullable String additionalCustodianInformation;

  private @Nullable String additionalDetails;

  public Position() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Position(String id, FinancialInstrument financialInstrument, Account account) {
    this.id = id;
    this.financialInstrument = financialInstrument;
    this.account = account;
  }

  public Position id(String id) {
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

  public Position financialInstrument(FinancialInstrument financialInstrument) {
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

  public Position account(Account account) {
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

  public Position name(String name) {
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

  public Position currency(String currency) {
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

  public Position safekeepingPlace(String safekeepingPlace) {
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

  public Position additionalCustodianInformation(String additionalCustodianInformation) {
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

  public Position additionalDetails(String additionalDetails) {
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
    Position position = (Position) o;
    return Objects.equals(this.id, position.id) &&
        Objects.equals(this.financialInstrument, position.financialInstrument) &&
        Objects.equals(this.account, position.account) &&
        Objects.equals(this.name, position.name) &&
        Objects.equals(this.currency, position.currency) &&
        Objects.equals(this.safekeepingPlace, position.safekeepingPlace) &&
        Objects.equals(this.additionalCustodianInformation, position.additionalCustodianInformation) &&
        Objects.equals(this.additionalDetails, position.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, financialInstrument, account, name, currency, safekeepingPlace, additionalCustodianInformation, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
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

