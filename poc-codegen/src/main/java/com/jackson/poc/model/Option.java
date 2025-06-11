package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.FinancialInstrument;
import com.jackson.poc.model.FinancialInstrumentIdentification;
import com.jackson.poc.model.FinancialInstrumentType;
import com.jackson.poc.model.OptionStyle;
import com.jackson.poc.model.OptionType;
import com.jackson.poc.model.Price;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An option is a financial instrument that gives the holder the right, but not the obligation, to buy or sell an underlying asset at a predetermined price within a given time frame. 
 */

@Schema(name = "Option", description = "An option is a financial instrument that gives the holder the right, but not the obligation, to buy or sell an underlying asset at a predetermined price within a given time frame. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class Option implements FinancialInstrument {

  private FinancialInstrumentType type;

  private String name;

  @Valid
  private List<@Valid FinancialInstrumentIdentification> identificationList = new ArrayList<>();

  private @Nullable String cfiCode;

  private @Nullable String currencyOfDenomination;

  private @Nullable Boolean hasFactor;

  private @Nullable BigDecimal factor;

  private @Nullable String additionalDetails;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate expiryDate;

  private @Nullable Price exercisePrice;

  private BigDecimal contractSize = new BigDecimal("1");

  private @Nullable OptionType optionType;

  private @Nullable OptionStyle optionStyle;

  private FinancialInstrument underlyingFinancialInstrument;

  public Option() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Option(FinancialInstrumentType type, String name, FinancialInstrument underlyingFinancialInstrument) {
    this.type = type;
    this.name = name;
    this.underlyingFinancialInstrument = underlyingFinancialInstrument;
  }

  public Option type(FinancialInstrumentType type) {
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
  public FinancialInstrumentType getType() {
    return type;
  }

  public void setType(FinancialInstrumentType type) {
    this.type = type;
  }

  public Option name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the financial instrument in free format text.
   * @return name
   */
  @NotNull @Size(max = 170) 
  @Schema(name = "name", example = "Novartis AG", description = "Name of the financial instrument in free format text.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Option identificationList(List<@Valid FinancialInstrumentIdentification> identificationList) {
    this.identificationList = identificationList;
    return this;
  }

  public Option addIdentificationListItem(FinancialInstrumentIdentification identificationListItem) {
    if (this.identificationList == null) {
      this.identificationList = new ArrayList<>();
    }
    this.identificationList.add(identificationListItem);
    return this;
  }

  /**
   * List of identification objects.
   * @return identificationList
   */
  @Valid @Size(min = 1) 
  @Schema(name = "identificationList", description = "List of identification objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificationList")
  public List<@Valid FinancialInstrumentIdentification> getIdentificationList() {
    return identificationList;
  }

  public void setIdentificationList(List<@Valid FinancialInstrumentIdentification> identificationList) {
    this.identificationList = identificationList;
  }

  public Option cfiCode(String cfiCode) {
    this.cfiCode = cfiCode;
    return this;
  }

  /**
   * Indicates the type of the financial instrument. Must follow the ISO 10962, which is also known as CFI (classification of financial instruments). At least indicate the CFI Category (1st character) and the CFI Group (2nd character). The CFI attributes 1-4 (3rd to 6th character in the string) are optional. 
   * @return cfiCode
   */
  @Pattern(regexp = "^[A-Z]{2,6}$") @Size(min = 2, max = 6) 
  @Schema(name = "cfiCode", example = "ESVUFR", description = "Indicates the type of the financial instrument. Must follow the ISO 10962, which is also known as CFI (classification of financial instruments). At least indicate the CFI Category (1st character) and the CFI Group (2nd character). The CFI attributes 1-4 (3rd to 6th character in the string) are optional. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cfiCode")
  public String getCfiCode() {
    return cfiCode;
  }

  public void setCfiCode(String cfiCode) {
    this.cfiCode = cfiCode;
  }

  public Option currencyOfDenomination(String currencyOfDenomination) {
    this.currencyOfDenomination = currencyOfDenomination;
    return this;
  }

  /**
   * ISO 4217 code.
   * @return currencyOfDenomination
   */
  @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currencyOfDenomination", example = "CHF", description = "ISO 4217 code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyOfDenomination")
  public String getCurrencyOfDenomination() {
    return currencyOfDenomination;
  }

  public void setCurrencyOfDenomination(String currencyOfDenomination) {
    this.currencyOfDenomination = currencyOfDenomination;
  }

  public Option hasFactor(Boolean hasFactor) {
    this.hasFactor = hasFactor;
    return this;
  }

  /**
   * Indicates if there is a factor present for this financial instrument. If this indicator is set to TRUE, but the factor attribute is not present, might indicate, that the factor cannot be delivered or is currently not available. 
   * @return hasFactor
   */
  
  @Schema(name = "hasFactor", example = "true", description = "Indicates if there is a factor present for this financial instrument. If this indicator is set to TRUE, but the factor attribute is not present, might indicate, that the factor cannot be delivered or is currently not available. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasFactor")
  public Boolean getHasFactor() {
    return hasFactor;
  }

  public void setHasFactor(Boolean hasFactor) {
    this.hasFactor = hasFactor;
  }

  public Option factor(BigDecimal factor) {
    this.factor = factor;
    return this;
  }

  /**
   * Information regarding the factor.
   * @return factor
   */
  @Valid 
  @Schema(name = "factor", example = "0.85", description = "Information regarding the factor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("factor")
  public BigDecimal getFactor() {
    return factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }

  public Option additionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Provides additional information about the financial instrument in narrative form.
   * @return additionalDetails
   */
  @Size(max = 70) 
  @Schema(name = "additionalDetails", example = "Group contract number 129959961", description = "Provides additional information about the financial instrument in narrative form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalDetails")
  public String getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public Option expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return expiryDate
   */
  @Valid 
  @Schema(name = "expiryDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryDate")
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Option exercisePrice(Price exercisePrice) {
    this.exercisePrice = exercisePrice;
    return this;
  }

  /**
   * Get exercisePrice
   * @return exercisePrice
   */
  @Valid 
  @Schema(name = "exercisePrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exercisePrice")
  public Price getExercisePrice() {
    return exercisePrice;
  }

  public void setExercisePrice(Price exercisePrice) {
    this.exercisePrice = exercisePrice;
  }

  public Option contractSize(BigDecimal contractSize) {
    this.contractSize = contractSize;
    return this;
  }

  /**
   * Contract size of the instrument.
   * @return contractSize
   */
  @Valid 
  @Schema(name = "contractSize", example = "100", description = "Contract size of the instrument.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractSize")
  public BigDecimal getContractSize() {
    return contractSize;
  }

  public void setContractSize(BigDecimal contractSize) {
    this.contractSize = contractSize;
  }

  public Option optionType(OptionType optionType) {
    this.optionType = optionType;
    return this;
  }

  /**
   * Get optionType
   * @return optionType
   */
  @Valid 
  @Schema(name = "optionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionType")
  public OptionType getOptionType() {
    return optionType;
  }

  public void setOptionType(OptionType optionType) {
    this.optionType = optionType;
  }

  public Option optionStyle(OptionStyle optionStyle) {
    this.optionStyle = optionStyle;
    return this;
  }

  /**
   * Get optionStyle
   * @return optionStyle
   */
  @Valid 
  @Schema(name = "optionStyle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionStyle")
  public OptionStyle getOptionStyle() {
    return optionStyle;
  }

  public void setOptionStyle(OptionStyle optionStyle) {
    this.optionStyle = optionStyle;
  }

  public Option underlyingFinancialInstrument(FinancialInstrument underlyingFinancialInstrument) {
    this.underlyingFinancialInstrument = underlyingFinancialInstrument;
    return this;
  }

  /**
   * Get underlyingFinancialInstrument
   * @return underlyingFinancialInstrument
   */
  @NotNull @Valid 
  @Schema(name = "underlyingFinancialInstrument", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("underlyingFinancialInstrument")
  public FinancialInstrument getUnderlyingFinancialInstrument() {
    return underlyingFinancialInstrument;
  }

  public void setUnderlyingFinancialInstrument(FinancialInstrument underlyingFinancialInstrument) {
    this.underlyingFinancialInstrument = underlyingFinancialInstrument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.type, option.type) &&
        Objects.equals(this.name, option.name) &&
        Objects.equals(this.identificationList, option.identificationList) &&
        Objects.equals(this.cfiCode, option.cfiCode) &&
        Objects.equals(this.currencyOfDenomination, option.currencyOfDenomination) &&
        Objects.equals(this.hasFactor, option.hasFactor) &&
        Objects.equals(this.factor, option.factor) &&
        Objects.equals(this.additionalDetails, option.additionalDetails) &&
        Objects.equals(this.expiryDate, option.expiryDate) &&
        Objects.equals(this.exercisePrice, option.exercisePrice) &&
        Objects.equals(this.contractSize, option.contractSize) &&
        Objects.equals(this.optionType, option.optionType) &&
        Objects.equals(this.optionStyle, option.optionStyle) &&
        Objects.equals(this.underlyingFinancialInstrument, option.underlyingFinancialInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identificationList, cfiCode, currencyOfDenomination, hasFactor, factor, additionalDetails, expiryDate, exercisePrice, contractSize, optionType, optionStyle, underlyingFinancialInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identificationList: ").append(toIndentedString(identificationList)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    currencyOfDenomination: ").append(toIndentedString(currencyOfDenomination)).append("\n");
    sb.append("    hasFactor: ").append(toIndentedString(hasFactor)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    exercisePrice: ").append(toIndentedString(exercisePrice)).append("\n");
    sb.append("    contractSize: ").append(toIndentedString(contractSize)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    optionStyle: ").append(toIndentedString(optionStyle)).append("\n");
    sb.append("    underlyingFinancialInstrument: ").append(toIndentedString(underlyingFinancialInstrument)).append("\n");
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

