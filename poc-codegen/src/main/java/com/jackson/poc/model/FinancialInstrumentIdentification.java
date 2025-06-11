package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Financial instrument identification in the form of a key value pair.
 */

@Schema(name = "FinancialInstrumentIdentification", description = "Financial instrument identification in the form of a key value pair.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class FinancialInstrumentIdentification {

  private String identifier;

  /**
   * Type of the instrument ID. isin is preferred.
   */
  public enum TypeEnum {
    ISIN("isin"),
    
    SEDOL("sedol"),
    
    CUSIP("cusip"),
    
    RIC("ric"),
    
    TICKER_SYMBOL("tickerSymbol"),
    
    BLOOMBERG("bloomberg"),
    
    CTA("cta"),
    
    QUICK("quick"),
    
    WERTPAPIER("wertpapier"),
    
    DUTCH("dutch"),
    
    VALOREN("valoren"),
    
    SICOVAM("sicovam"),
    
    BELGIAN("belgian"),
    
    COMMON("common"),
    
    ISO3("iso3"),
    
    OTHER_PROPRIETARY_IDENTIFICATION("otherProprietaryIdentification");

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

  public FinancialInstrumentIdentification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FinancialInstrumentIdentification(String identifier, TypeEnum type) {
    this.identifier = identifier;
    this.type = type;
  }

  public FinancialInstrumentIdentification identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Instrument identification.
   * @return identifier
   */
  @NotNull @Size(max = 128) 
  @Schema(name = "identifier", example = "CH0012005267", description = "Instrument identification.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public FinancialInstrumentIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the instrument ID. isin is preferred.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "isin", description = "Type of the instrument ID. isin is preferred.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstrumentIdentification financialInstrumentIdentification = (FinancialInstrumentIdentification) o;
    return Objects.equals(this.identifier, financialInstrumentIdentification.identifier) &&
        Objects.equals(this.type, financialInstrumentIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstrumentIdentification {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

