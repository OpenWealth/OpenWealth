package com.jackson.poc.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jackson.poc.model.CommonErrorType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Common error response.
 */

@Schema(name = "CommonErrorResponse", description = "Common error response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public class CommonErrorResponse {

  private @Nullable CommonErrorType type;

  private @Nullable String title;

  private @Nullable String detail;

  private @Nullable String instance;

  public CommonErrorResponse type(CommonErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public CommonErrorType getType() {
    return type;
  }

  public void setType(CommonErrorType type) {
    this.type = type;
  }

  public CommonErrorResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the error response.
   * @return title
   */
  
  @Schema(name = "title", example = "This is the general problem description", description = "Title of the error response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CommonErrorResponse detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detailed description of the error response.
   * @return detail
   */
  
  @Schema(name = "detail", example = "Detailed problem description with respect to the current request", description = "Detailed description of the error response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public CommonErrorResponse instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Entity instance that threw the error.
   * @return instance
   */
  
  @Schema(name = "instance", example = "path/to/corresponding/resource", description = "Entity instance that threw the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonErrorResponse commonErrorResponse = (CommonErrorResponse) o;
    return Objects.equals(this.type, commonErrorResponse.type) &&
        Objects.equals(this.title, commonErrorResponse.title) &&
        Objects.equals(this.detail, commonErrorResponse.detail) &&
        Objects.equals(this.instance, commonErrorResponse.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonErrorResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

