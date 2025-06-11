package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.CurrencyAmount;
import com.jackson.poc.model.FinancialInstrumentIdentification;
import com.jackson.poc.model.FinancialInstrumentType;
import com.jackson.poc.model.InterestRate;
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
 * An interest rate swap is a forward contract in which one stream of future interest payments is exchanged for another based on a specified principal amount. 
 */

@Schema(name = "InterestRateSwap", description = "An interest rate swap is a forward contract in which one stream of future interest payments is exchanged for another based on a specified principal amount. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class InterestRateSwap implements FinancialInstrument {

  private FinancialInstrumentType type;

  private String name;

  @Valid
  private List<@Valid FinancialInstrumentIdentification> identificationList = new ArrayList<>();

  private @Nullable String cfiCode;

  private @Nullable String currencyOfDenomination;

  private @Nullable Boolean hasFactor;

  private @Nullable BigDecimal factor;

  private @Nullable String additionalDetails;

  private CurrencyAmount notionalAmount;

  private InterestRate interestRatePaid;

  private InterestRate interestRateReceived;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate maturityDate;

  public InterestRateSwap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InterestRateSwap(FinancialInstrumentType type, String name, CurrencyAmount notionalAmount, InterestRate interestRatePaid, InterestRate interestRateReceived) {
    this.type = type;
    this.name = name;
    this.notionalAmount = notionalAmount;
    this.interestRatePaid = interestRatePaid;
    this.interestRateReceived = interestRateReceived;
  }

  public InterestRateSwap type(FinancialInstrumentType type) {
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

  public InterestRateSwap name(String name) {
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

  public InterestRateSwap identificationList(List<@Valid FinancialInstrumentIdentification> identificationList) {
    this.identificationList = identificationList;
    return this;
  }

  public InterestRateSwap addIdentificationListItem(FinancialInstrumentIdentification identificationListItem) {
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

  public InterestRateSwap cfiCode(String cfiCode) {
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

  public InterestRateSwap currencyOfDenomination(String currencyOfDenomination) {
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

  public InterestRateSwap hasFactor(Boolean hasFactor) {
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

  public InterestRateSwap factor(BigDecimal factor) {
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

  public InterestRateSwap additionalDetails(String additionalDetails) {
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

  public InterestRateSwap notionalAmount(CurrencyAmount notionalAmount) {
    this.notionalAmount = notionalAmount;
    return this;
  }

  /**
   * Get notionalAmount
   * @return notionalAmount
   */
  @NotNull @Valid 
  @Schema(name = "notionalAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notionalAmount")
  public CurrencyAmount getNotionalAmount() {
    return notionalAmount;
  }

  public void setNotionalAmount(CurrencyAmount notionalAmount) {
    this.notionalAmount = notionalAmount;
  }

  public InterestRateSwap interestRatePaid(InterestRate interestRatePaid) {
    this.interestRatePaid = interestRatePaid;
    return this;
  }

  /**
   * Get interestRatePaid
   * @return interestRatePaid
   */
  @NotNull @Valid 
  @Schema(name = "interestRatePaid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interestRatePaid")
  public InterestRate getInterestRatePaid() {
    return interestRatePaid;
  }

  public void setInterestRatePaid(InterestRate interestRatePaid) {
    this.interestRatePaid = interestRatePaid;
  }

  public InterestRateSwap interestRateReceived(InterestRate interestRateReceived) {
    this.interestRateReceived = interestRateReceived;
    return this;
  }

  /**
   * Get interestRateReceived
   * @return interestRateReceived
   */
  @NotNull @Valid 
  @Schema(name = "interestRateReceived", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interestRateReceived")
  public InterestRate getInterestRateReceived() {
    return interestRateReceived;
  }

  public void setInterestRateReceived(InterestRate interestRateReceived) {
    this.interestRateReceived = interestRateReceived;
  }

  public InterestRateSwap maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return maturityDate
   */
  @Valid 
  @Schema(name = "maturityDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maturityDate")
  public LocalDate getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestRateSwap interestRateSwap = (InterestRateSwap) o;
    return Objects.equals(this.type, interestRateSwap.type) &&
        Objects.equals(this.name, interestRateSwap.name) &&
        Objects.equals(this.identificationList, interestRateSwap.identificationList) &&
        Objects.equals(this.cfiCode, interestRateSwap.cfiCode) &&
        Objects.equals(this.currencyOfDenomination, interestRateSwap.currencyOfDenomination) &&
        Objects.equals(this.hasFactor, interestRateSwap.hasFactor) &&
        Objects.equals(this.factor, interestRateSwap.factor) &&
        Objects.equals(this.additionalDetails, interestRateSwap.additionalDetails) &&
        Objects.equals(this.notionalAmount, interestRateSwap.notionalAmount) &&
        Objects.equals(this.interestRatePaid, interestRateSwap.interestRatePaid) &&
        Objects.equals(this.interestRateReceived, interestRateSwap.interestRateReceived) &&
        Objects.equals(this.maturityDate, interestRateSwap.maturityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identificationList, cfiCode, currencyOfDenomination, hasFactor, factor, additionalDetails, notionalAmount, interestRatePaid, interestRateReceived, maturityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestRateSwap {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identificationList: ").append(toIndentedString(identificationList)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    currencyOfDenomination: ").append(toIndentedString(currencyOfDenomination)).append("\n");
    sb.append("    hasFactor: ").append(toIndentedString(hasFactor)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    notionalAmount: ").append(toIndentedString(notionalAmount)).append("\n");
    sb.append("    interestRatePaid: ").append(toIndentedString(interestRatePaid)).append("\n");
    sb.append("    interestRateReceived: ").append(toIndentedString(interestRateReceived)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
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

