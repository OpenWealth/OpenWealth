package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Overview of the customer with the respective accounts.
 */

@Schema(name = "Customer", description = "Overview of the customer with the respective accounts.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Customer {

  private String id;

  private @Nullable String number;

  private @Nullable String referenceCurrency;

  public Customer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Customer(String id) {
    this.id = id;
  }

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique and unambiguous identification (i.e. UUID) used by the bank for the customer.
   * @return id
   */
  @NotNull @Size(max = 128) 
  @Schema(name = "id", example = "MTIzNDUtNg", description = "Unique and unambiguous identification (i.e. UUID) used by the bank for the customer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Contains the customers custody proprietary customer number if available.
   * @return number
   */
  @Size(max = 70) 
  @Schema(name = "number", example = "12345-6", description = "Contains the customers custody proprietary customer number if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Customer referenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return referenceCurrency
   */
  @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "referenceCurrency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceCurrency")
  public String getReferenceCurrency() {
    return referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.number, customer.number) &&
        Objects.equals(this.referenceCurrency, customer.referenceCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, referenceCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    referenceCurrency: ").append(toIndentedString(referenceCurrency)).append("\n");
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

