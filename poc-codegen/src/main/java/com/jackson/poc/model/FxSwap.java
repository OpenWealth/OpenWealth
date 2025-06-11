package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.CurrencyAmount;
import com.jackson.poc.model.FinancialInstrumentIdentification;
import com.jackson.poc.model.FinancialInstrumentType;
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
 * A foreign currency swap is an agreement between two foreign parties to swap interest payments on a loan made in one currency for interest payments on a loan made in another currency. 
 */

@Schema(name = "FxSwap", description = "A foreign currency swap is an agreement between two foreign parties to swap interest payments on a loan made in one currency for interest payments on a loan made in another currency. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class FxSwap implements FinancialInstrument {

  private FinancialInstrumentType type;

  private String name;

  @Valid
  private List<@Valid FinancialInstrumentIdentification> identificationList = new ArrayList<>();

  private @Nullable String cfiCode;

  private @Nullable String currencyOfDenomination;

  private @Nullable Boolean hasFactor;

  private @Nullable BigDecimal factor;

  private @Nullable String additionalDetails;

  private CurrencyAmount nearAmountPaid;

  private CurrencyAmount nearAmountReceived;

  private CurrencyAmount farAmountPaid;

  private CurrencyAmount farAmountReceived;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate nearMaturityDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate maturityDate;

  public FxSwap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FxSwap(FinancialInstrumentType type, String name, CurrencyAmount nearAmountPaid, CurrencyAmount nearAmountReceived, CurrencyAmount farAmountPaid, CurrencyAmount farAmountReceived, LocalDate nearMaturityDate, LocalDate maturityDate) {
    this.type = type;
    this.name = name;
    this.nearAmountPaid = nearAmountPaid;
    this.nearAmountReceived = nearAmountReceived;
    this.farAmountPaid = farAmountPaid;
    this.farAmountReceived = farAmountReceived;
    this.nearMaturityDate = nearMaturityDate;
    this.maturityDate = maturityDate;
  }

  public FxSwap type(FinancialInstrumentType type) {
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

  public FxSwap name(String name) {
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

  public FxSwap identificationList(List<@Valid FinancialInstrumentIdentification> identificationList) {
    this.identificationList = identificationList;
    return this;
  }

  public FxSwap addIdentificationListItem(FinancialInstrumentIdentification identificationListItem) {
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

  public FxSwap cfiCode(String cfiCode) {
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

  public FxSwap currencyOfDenomination(String currencyOfDenomination) {
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

  public FxSwap hasFactor(Boolean hasFactor) {
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

  public FxSwap factor(BigDecimal factor) {
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

  public FxSwap additionalDetails(String additionalDetails) {
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

  public FxSwap nearAmountPaid(CurrencyAmount nearAmountPaid) {
    this.nearAmountPaid = nearAmountPaid;
    return this;
  }

  /**
   * Get nearAmountPaid
   * @return nearAmountPaid
   */
  @NotNull @Valid 
  @Schema(name = "nearAmountPaid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nearAmountPaid")
  public CurrencyAmount getNearAmountPaid() {
    return nearAmountPaid;
  }

  public void setNearAmountPaid(CurrencyAmount nearAmountPaid) {
    this.nearAmountPaid = nearAmountPaid;
  }

  public FxSwap nearAmountReceived(CurrencyAmount nearAmountReceived) {
    this.nearAmountReceived = nearAmountReceived;
    return this;
  }

  /**
   * Get nearAmountReceived
   * @return nearAmountReceived
   */
  @NotNull @Valid 
  @Schema(name = "nearAmountReceived", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nearAmountReceived")
  public CurrencyAmount getNearAmountReceived() {
    return nearAmountReceived;
  }

  public void setNearAmountReceived(CurrencyAmount nearAmountReceived) {
    this.nearAmountReceived = nearAmountReceived;
  }

  public FxSwap farAmountPaid(CurrencyAmount farAmountPaid) {
    this.farAmountPaid = farAmountPaid;
    return this;
  }

  /**
   * Get farAmountPaid
   * @return farAmountPaid
   */
  @NotNull @Valid 
  @Schema(name = "farAmountPaid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("farAmountPaid")
  public CurrencyAmount getFarAmountPaid() {
    return farAmountPaid;
  }

  public void setFarAmountPaid(CurrencyAmount farAmountPaid) {
    this.farAmountPaid = farAmountPaid;
  }

  public FxSwap farAmountReceived(CurrencyAmount farAmountReceived) {
    this.farAmountReceived = farAmountReceived;
    return this;
  }

  /**
   * Get farAmountReceived
   * @return farAmountReceived
   */
  @NotNull @Valid 
  @Schema(name = "farAmountReceived", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("farAmountReceived")
  public CurrencyAmount getFarAmountReceived() {
    return farAmountReceived;
  }

  public void setFarAmountReceived(CurrencyAmount farAmountReceived) {
    this.farAmountReceived = farAmountReceived;
  }

  public FxSwap nearMaturityDate(LocalDate nearMaturityDate) {
    this.nearMaturityDate = nearMaturityDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return nearMaturityDate
   */
  @NotNull @Valid 
  @Schema(name = "nearMaturityDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nearMaturityDate")
  public LocalDate getNearMaturityDate() {
    return nearMaturityDate;
  }

  public void setNearMaturityDate(LocalDate nearMaturityDate) {
    this.nearMaturityDate = nearMaturityDate;
  }

  public FxSwap maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Date according to ISO 8601.
   * @return maturityDate
   */
  @NotNull @Valid 
  @Schema(name = "maturityDate", example = "2018-04-13", description = "Date according to ISO 8601.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    FxSwap fxSwap = (FxSwap) o;
    return Objects.equals(this.type, fxSwap.type) &&
        Objects.equals(this.name, fxSwap.name) &&
        Objects.equals(this.identificationList, fxSwap.identificationList) &&
        Objects.equals(this.cfiCode, fxSwap.cfiCode) &&
        Objects.equals(this.currencyOfDenomination, fxSwap.currencyOfDenomination) &&
        Objects.equals(this.hasFactor, fxSwap.hasFactor) &&
        Objects.equals(this.factor, fxSwap.factor) &&
        Objects.equals(this.additionalDetails, fxSwap.additionalDetails) &&
        Objects.equals(this.nearAmountPaid, fxSwap.nearAmountPaid) &&
        Objects.equals(this.nearAmountReceived, fxSwap.nearAmountReceived) &&
        Objects.equals(this.farAmountPaid, fxSwap.farAmountPaid) &&
        Objects.equals(this.farAmountReceived, fxSwap.farAmountReceived) &&
        Objects.equals(this.nearMaturityDate, fxSwap.nearMaturityDate) &&
        Objects.equals(this.maturityDate, fxSwap.maturityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identificationList, cfiCode, currencyOfDenomination, hasFactor, factor, additionalDetails, nearAmountPaid, nearAmountReceived, farAmountPaid, farAmountReceived, nearMaturityDate, maturityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FxSwap {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identificationList: ").append(toIndentedString(identificationList)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    currencyOfDenomination: ").append(toIndentedString(currencyOfDenomination)).append("\n");
    sb.append("    hasFactor: ").append(toIndentedString(hasFactor)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    nearAmountPaid: ").append(toIndentedString(nearAmountPaid)).append("\n");
    sb.append("    nearAmountReceived: ").append(toIndentedString(nearAmountReceived)).append("\n");
    sb.append("    farAmountPaid: ").append(toIndentedString(farAmountPaid)).append("\n");
    sb.append("    farAmountReceived: ").append(toIndentedString(farAmountReceived)).append("\n");
    sb.append("    nearMaturityDate: ").append(toIndentedString(nearMaturityDate)).append("\n");
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

