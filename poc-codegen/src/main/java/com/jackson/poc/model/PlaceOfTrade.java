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
 * Market in which a trade transaction is to be or has been executed.
 */

@Schema(name = "PlaceOfTrade", description = "Market in which a trade transaction is to be or has been executed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class PlaceOfTrade {

  private @Nullable String marketIdentificationCode;

  private @Nullable String marketDescription;

  public PlaceOfTrade marketIdentificationCode(String marketIdentificationCode) {
    this.marketIdentificationCode = marketIdentificationCode;
    return this;
  }

  /**
   * Market Identifier Code. Identification of a financial market, as stipulated in the norm ISOMarket Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\". 
   * @return marketIdentificationCode
   */
  @Size(max = 4) 
  @Schema(name = "marketIdentificationCode", example = "XSWX", description = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISOMarket Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\". ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketIdentificationCode")
  public String getMarketIdentificationCode() {
    return marketIdentificationCode;
  }

  public void setMarketIdentificationCode(String marketIdentificationCode) {
    this.marketIdentificationCode = marketIdentificationCode;
  }

  public PlaceOfTrade marketDescription(String marketDescription) {
    this.marketDescription = marketDescription;
    return this;
  }

  /**
   * Description of the market when no Market Identification Code is available.
   * @return marketDescription
   */
  @Size(max = 70) 
  @Schema(name = "marketDescription", example = "OTC", description = "Description of the market when no Market Identification Code is available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketDescription")
  public String getMarketDescription() {
    return marketDescription;
  }

  public void setMarketDescription(String marketDescription) {
    this.marketDescription = marketDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceOfTrade placeOfTrade = (PlaceOfTrade) o;
    return Objects.equals(this.marketIdentificationCode, placeOfTrade.marketIdentificationCode) &&
        Objects.equals(this.marketDescription, placeOfTrade.marketDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketIdentificationCode, marketDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceOfTrade {\n");
    sb.append("    marketIdentificationCode: ").append(toIndentedString(marketIdentificationCode)).append("\n");
    sb.append("    marketDescription: ").append(toIndentedString(marketDescription)).append("\n");
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

