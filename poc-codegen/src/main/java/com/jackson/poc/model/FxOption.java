package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.CurrencyAmount;
import com.jackson.poc.model.FinancialInstrumentIdentification;
import com.jackson.poc.model.FinancialInstrumentType;
import com.jackson.poc.model.OptionStyle;
import com.jackson.poc.model.OptionType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An FX option is a contract that gives the buyer the right, but not the obligation, to buy or sell a certain currency at a specified exchange rate on or before a specified date. For this right, a premium is paid to the seller. 
 */

@Schema(name = "FxOption", description = "An FX option is a contract that gives the buyer the right, but not the obligation, to buy or sell a certain currency at a specified exchange rate on or before a specified date. For this right, a premium is paid to the seller. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class FxOption implements FinancialInstrument {

  private FinancialInstrumentType type;

  private String name;

  @Valid
  private List<@Valid FinancialInstrumentIdentification> identificationList = new ArrayList<>();

  private @Nullable String cfiCode;

  private @Nullable String currencyOfDenomination;

  private @Nullable Boolean hasFactor;

  private @Nullable BigDecimal factor;

  private @Nullable String additionalDetails;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiryDateTime;

  private CurrencyAmount underlyingAmount;

  private CurrencyAmount counterAmount;

  private @Nullable CurrencyAmount premium;

  private @Nullable OptionType optionType;

  private @Nullable OptionStyle optionStyle;

  public FxOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FxOption(FinancialInstrumentType type, String name, OffsetDateTime expiryDateTime, CurrencyAmount underlyingAmount, CurrencyAmount counterAmount) {
    this.type = type;
    this.name = name;
    this.expiryDateTime = expiryDateTime;
    this.underlyingAmount = underlyingAmount;
    this.counterAmount = counterAmount;
  }

  public FxOption type(FinancialInstrumentType type) {
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

  public FxOption name(String name) {
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

  public FxOption identificationList(List<@Valid FinancialInstrumentIdentification> identificationList) {
    this.identificationList = identificationList;
    return this;
  }

  public FxOption addIdentificationListItem(FinancialInstrumentIdentification identificationListItem) {
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

  public FxOption cfiCode(String cfiCode) {
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

  public FxOption currencyOfDenomination(String currencyOfDenomination) {
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

  public FxOption hasFactor(Boolean hasFactor) {
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

  public FxOption factor(BigDecimal factor) {
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

  public FxOption additionalDetails(String additionalDetails) {
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

  public FxOption expiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
    return this;
  }

  /**
   * DateTime according to ISO 8601.
   * @return expiryDateTime
   */
  @NotNull @Valid 
  @Schema(name = "expiryDateTime", example = "2018-04-13T16:00Z", description = "DateTime according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expiryDateTime")
  public OffsetDateTime getExpiryDateTime() {
    return expiryDateTime;
  }

  public void setExpiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }

  public FxOption underlyingAmount(CurrencyAmount underlyingAmount) {
    this.underlyingAmount = underlyingAmount;
    return this;
  }

  /**
   * Get underlyingAmount
   * @return underlyingAmount
   */
  @NotNull @Valid 
  @Schema(name = "underlyingAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("underlyingAmount")
  public CurrencyAmount getUnderlyingAmount() {
    return underlyingAmount;
  }

  public void setUnderlyingAmount(CurrencyAmount underlyingAmount) {
    this.underlyingAmount = underlyingAmount;
  }

  public FxOption counterAmount(CurrencyAmount counterAmount) {
    this.counterAmount = counterAmount;
    return this;
  }

  /**
   * Get counterAmount
   * @return counterAmount
   */
  @NotNull @Valid 
  @Schema(name = "counterAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counterAmount")
  public CurrencyAmount getCounterAmount() {
    return counterAmount;
  }

  public void setCounterAmount(CurrencyAmount counterAmount) {
    this.counterAmount = counterAmount;
  }

  public FxOption premium(CurrencyAmount premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Get premium
   * @return premium
   */
  @Valid 
  @Schema(name = "premium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("premium")
  public CurrencyAmount getPremium() {
    return premium;
  }

  public void setPremium(CurrencyAmount premium) {
    this.premium = premium;
  }

  public FxOption optionType(OptionType optionType) {
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

  public FxOption optionStyle(OptionStyle optionStyle) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FxOption fxOption = (FxOption) o;
    return Objects.equals(this.type, fxOption.type) &&
        Objects.equals(this.name, fxOption.name) &&
        Objects.equals(this.identificationList, fxOption.identificationList) &&
        Objects.equals(this.cfiCode, fxOption.cfiCode) &&
        Objects.equals(this.currencyOfDenomination, fxOption.currencyOfDenomination) &&
        Objects.equals(this.hasFactor, fxOption.hasFactor) &&
        Objects.equals(this.factor, fxOption.factor) &&
        Objects.equals(this.additionalDetails, fxOption.additionalDetails) &&
        Objects.equals(this.expiryDateTime, fxOption.expiryDateTime) &&
        Objects.equals(this.underlyingAmount, fxOption.underlyingAmount) &&
        Objects.equals(this.counterAmount, fxOption.counterAmount) &&
        Objects.equals(this.premium, fxOption.premium) &&
        Objects.equals(this.optionType, fxOption.optionType) &&
        Objects.equals(this.optionStyle, fxOption.optionStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identificationList, cfiCode, currencyOfDenomination, hasFactor, factor, additionalDetails, expiryDateTime, underlyingAmount, counterAmount, premium, optionType, optionStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FxOption {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identificationList: ").append(toIndentedString(identificationList)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    currencyOfDenomination: ").append(toIndentedString(currencyOfDenomination)).append("\n");
    sb.append("    hasFactor: ").append(toIndentedString(hasFactor)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
    sb.append("    underlyingAmount: ").append(toIndentedString(underlyingAmount)).append("\n");
    sb.append("    counterAmount: ").append(toIndentedString(counterAmount)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    optionStyle: ").append(toIndentedString(optionStyle)).append("\n");
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

