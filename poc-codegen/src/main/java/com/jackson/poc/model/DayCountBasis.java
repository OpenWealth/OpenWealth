package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Interest method of the instrument.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public enum DayCountBasis {
  
  ACT_360("act_360"),
  
  ACT_365("act_365"),
  
  ACT_ACT_ICMA("act_actIcma"),
  
  ACT_ACT_ISDA("act_actIsda"),
  
  ACT_ACT_AFB("act_actAfb"),
  
  ACT_365_L("act_365L"),
  
  BUS_252("bus_252"),
  
  U30_360("u30_360"),
  
  U30_E_360_ICMA("u30E_360Icma"),
  
  U30_E_360_ISDA("u30E_360Isda"),
  
  U30_E_360("u30E_360"),
  
  U30_U_360("u30U_360");

  private String value;

  DayCountBasis(String value) {
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
  public static DayCountBasis fromValue(String value) {
    for (DayCountBasis b : DayCountBasis.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

