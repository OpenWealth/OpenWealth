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
 * Error Types for CommonErrorResponse.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public enum CommonErrorType {
  
  _PROBLEMS_INVALID_PAYLOAD("/problems/INVALID_PAYLOAD"),
  
  _PROBLEMS_MALFORMED_PAYLOAD("/problems/MALFORMED_PAYLOAD"),
  
  _PROBLEMS_INVALID_TOKEN("/problems/INVALID_TOKEN"),
  
  _PROBLEMS_EXPIRED_TOKEN("/problems/EXPIRED_TOKEN"),
  
  _PROBLEMS_INSUFFICIENT_PRIVILEGES("/problems/INSUFFICIENT_PRIVILEGES"),
  
  _PROBLEMS_NO_ACCESS_TO_RESOURCE("/problems/NO_ACCESS_TO_RESOURCE"),
  
  _PROBLEMS_RESOURCE_DOES_NOT_EXIST("/problems/RESOURCE_DOES_NOT_EXIST"),
  
  _PROBLEMS_RESOURCE_NOT_READY("/problems/RESOURCE_NOT_READY"),
  
  _PROBLEMS_RESOURCE_TOO_LARGE("/problems/RESOURCE_TOO_LARGE"),
  
  _PROBLEMS_WRONG_METHOD("/problems/WRONG_METHOD"),
  
  _PROBLEMS_OPERATION_NOT_ALLOWED("/problems/OPERATION_NOT_ALLOWED"),
  
  _PROBLEMS_TECHNICAL_ERROR("/problems/TECHNICAL_ERROR"),
  
  _PROBLEMS_NOT_IMPLEMENTED("/problems/NOT_IMPLEMENTED"),
  
  _PROBLEMS_SERVICE_UNAVAILABLE("/problems/SERVICE_UNAVAILABLE");

  private String value;

  CommonErrorType(String value) {
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
  public static CommonErrorType fromValue(String value) {
    for (CommonErrorType b : CommonErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

