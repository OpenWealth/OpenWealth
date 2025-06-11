package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jackson.poc.model.Account;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Total amount of money that is to be/was posted to the account in the account currency.
 */

@Schema(name = "PostingAmount", description = "Total amount of money that is to be/was posted to the account in the account currency.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class PostingAmount {

  private BigDecimal amount;

  private String currency;

  private Account account;

  public PostingAmount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostingAmount(BigDecimal amount, String currency, Account account) {
    this.amount = amount;
    this.currency = currency;
    this.account = account;
  }

  public PostingAmount amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Signed amount of the cash transaction.
   * @return amount
   */
  @NotNull @Valid 
  @Schema(name = "amount", example = "13023", description = "Signed amount of the cash transaction.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PostingAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return currency
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currency", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PostingAmount account(Account account) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostingAmount postingAmount = (PostingAmount) o;
    return Objects.equals(this.amount, postingAmount.amount) &&
        Objects.equals(this.currency, postingAmount.currency) &&
        Objects.equals(this.account, postingAmount.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostingAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

