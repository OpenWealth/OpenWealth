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
 * Information about the portfolio.
 */

@Schema(name = "PortfolioInformation", description = "Information about the portfolio.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class PortfolioInformation {

  private @Nullable String identification;

  private @Nullable String referenceCurrency;

  public PortfolioInformation identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification for the portfolio between the portfolio owner and the portfolio servicer.
   * @return identification
   */
  @Size(min = 1, max = 128) 
  @Schema(name = "identification", example = "87654-3219", description = "Unique and unambiguous identification for the portfolio between the portfolio owner and the portfolio servicer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PortfolioInformation referenceCurrency(String referenceCurrency) {
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
    PortfolioInformation portfolioInformation = (PortfolioInformation) o;
    return Objects.equals(this.identification, portfolioInformation.identification) &&
        Objects.equals(this.referenceCurrency, portfolioInformation.referenceCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, referenceCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioInformation {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

