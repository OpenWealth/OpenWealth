package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.PortfolioInformation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Account entity.
 */

@Schema(name = "Account", description = "Account entity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Account {

  private String id;

  /**
   * Indicates the type of the account. If the account type is cashAccount, no information on the financial instrument is provided in the respective position in the account. 
   */
  public enum TypeEnum {
    CASH_ACCOUNT("cashAccount"),
    
    SAFEKEEPING_ACCOUNT("safekeepingAccount"),
    
    OTHER("other");

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

  private @Nullable String name;

  private String referenceCurrency;

  private @Nullable String iban;

  private @Nullable String number;

  private @Nullable String designation;

  private @Nullable PortfolioInformation portfolioInformation;

  public Account() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Account(String id, TypeEnum type, String referenceCurrency) {
    this.id = id;
    this.type = type;
    this.referenceCurrency = referenceCurrency;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique and unambiguous identification for the account. The IBAN should NOT be the account identifier.
   * @return id
   */
  @NotNull @Size(max = 128) 
  @Schema(name = "id", example = "8765432-19", description = "Unique and unambiguous identification for the account. The IBAN should NOT be the account identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of the account. If the account type is cashAccount, no information on the financial instrument is provided in the respective position in the account. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "cashAccount", description = "Indicates the type of the account. If the account type is cashAccount, no information on the financial instrument is provided in the respective position in the account. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner. 
   * @return name
   */
  @Size(max = 70) 
  @Schema(name = "name", example = "Household account", description = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account referenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return referenceCurrency
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "referenceCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("referenceCurrency")
  public String getReferenceCurrency() {
    return referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Contains the accounts International Banking Account Number (IBAN) for an account if available.
   * @return iban
   */
  @Size(max = 34) 
  @Schema(name = "iban", example = "CH123456789", description = "Contains the accounts International Banking Account Number (IBAN) for an account if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Account number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Contains the accounts custody proprietary account number for an account if available.
   * @return number
   */
  @Size(max = 70) 
  @Schema(name = "number", example = "123-1234-234", description = "Contains the accounts custody proprietary account number for an account if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Account designation(String designation) {
    this.designation = designation;
    return this;
  }

  /**
   * Supplementary information on the account. Designated by the account servicer.
   * @return designation
   */
  @Size(max = 70) 
  @Schema(name = "designation", example = "Current Account CHF", description = "Supplementary information on the account. Designated by the account servicer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("designation")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Account portfolioInformation(PortfolioInformation portfolioInformation) {
    this.portfolioInformation = portfolioInformation;
    return this;
  }

  /**
   * Get portfolioInformation
   * @return portfolioInformation
   */
  @Valid 
  @Schema(name = "portfolioInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolioInformation")
  public PortfolioInformation getPortfolioInformation() {
    return portfolioInformation;
  }

  public void setPortfolioInformation(PortfolioInformation portfolioInformation) {
    this.portfolioInformation = portfolioInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.referenceCurrency, account.referenceCurrency) &&
        Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.number, account.number) &&
        Objects.equals(this.designation, account.designation) &&
        Objects.equals(this.portfolioInformation, account.portfolioInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, referenceCurrency, iban, number, designation, portfolioInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceCurrency: ").append(toIndentedString(referenceCurrency)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    portfolioInformation: ").append(toIndentedString(portfolioInformation)).append("\n");
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

