package com.jackson.poc.api;

import com.jackson.poc.model.Account;
import com.jackson.poc.model.CommonErrorResponse;
import com.jackson.poc.model.Customer;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import com.jackson.poc.model.Transaction;
import com.jackson.poc.model.ValuatedPosition;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link CustomersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-11T20:28:41.461831241+02:00[Europe/Zurich]", comments = "Generator version: 7.12.0")
public interface CustomersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /customers/{customerId}/accounts/{accountId} : Returns an account by id for a specific customer
     * Returns an account by id for a specific customer.
     *
     * @param customerId Customer ID Parameter. (required)
     * @param accountId Account ID parameter. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @return Account (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomerAccountById
     */
    default ResponseEntity<Account> getCustomerAccountById(String customerId,
        String accountId,
        String xCorrelationID) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId}/accounts : Returns the accounts for a specific customer accessible to the querying user
     * Returns all accounts for a specific customer. Paging is done based on the account object, i.e. if limit is set to 1, then 1 account will be returned per page. 
     *
     * @param customerId Customer ID Parameter. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @param cursor An opaque string value used for pagination. (optional)
     * @param limit Maximum number of items to return. (optional)
     * @return Account List (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomerAccountsByCustomerId
     */
    default ResponseEntity<List<Account>> getCustomerAccountsByCustomerId(String customerId,
        String xCorrelationID,
        String cursor,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId}/positions : Returns the positions for a specific customer
     * Returns all positions for a specific customer. Paging is done based on the position object, i.e. if limit is set to 1, then 1 position will be returned per page. 
     *
     * @param customerId Customer ID Parameter. (required)
     * @param date A date value. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @param endOfDayIndicator Indicates if the resources (positions &amp; transactions) have been confirmed by the end-of-day (eod) processing. - If the parameter is not set, all resources will be delivered. - If the parameter is set to true, only resources with with the particular property set to true will be delivered. - If the parameter is set to false, only resources with with the particular property set to false will be delivered.  (optional)
     * @param cursor An opaque string value used for pagination. (optional)
     * @param limit Maximum number of items to return. (optional)
     * @return Position List (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomerPositionByCustomerId
     */
    default ResponseEntity<List<ValuatedPosition>> getCustomerPositionByCustomerId(String customerId,
        LocalDate date,
        String xCorrelationID,
        Boolean endOfDayIndicator,
        String cursor,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"costForeignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"valuation\" : { \"valueInPositionCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valueInReferenceCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valuationDate\" : \"2018-04-13\" }, \"numberOfDaysAccrued\" : 34, \"price\" : { \"priceDate\" : \"\", \"sourceOfPrice\" : \"SIX Swiss Exchange\", \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"positionDate\" : \"2018-04-13\", \"blockedQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"endOfDayIndicator\" : true, \"costPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"rateDate\" : \"\", \"value\" : 0.98, \"sourceOfRate\" : \"Reuters 4 o'clock\" }, \"accruedInterest\" : { \"amount\" : 12000, \"currency\" : \"CHF\" } }, { \"costForeignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"valuation\" : { \"valueInPositionCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valueInReferenceCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valuationDate\" : \"2018-04-13\" }, \"numberOfDaysAccrued\" : 34, \"price\" : { \"priceDate\" : \"\", \"sourceOfPrice\" : \"SIX Swiss Exchange\", \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"positionDate\" : \"2018-04-13\", \"blockedQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"endOfDayIndicator\" : true, \"costPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"rateDate\" : \"\", \"value\" : 0.98, \"sourceOfRate\" : \"Reuters 4 o'clock\" }, \"accruedInterest\" : { \"amount\" : 12000, \"currency\" : \"CHF\" } } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId}/positions/{positionId} : Returns a positions by id for a specific customer
     * Returns a positions for a specific customer.
     *
     * @param customerId Customer ID Parameter. (required)
     * @param positionId Position ID parameter. (required)
     * @param date A date value. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @param endOfDayIndicator Indicates if the resources (positions &amp; transactions) have been confirmed by the end-of-day (eod) processing. - If the parameter is not set, all resources will be delivered. - If the parameter is set to true, only resources with with the particular property set to true will be delivered. - If the parameter is set to false, only resources with with the particular property set to false will be delivered.  (optional)
     * @return Position (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomerPositionById
     */
    default ResponseEntity<ValuatedPosition> getCustomerPositionById(String customerId,
        String positionId,
        LocalDate date,
        String xCorrelationID,
        Boolean endOfDayIndicator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"costForeignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"valuation\" : { \"valueInPositionCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valueInReferenceCurrency\" : { \"amount\" : 12000, \"currency\" : \"CHF\" }, \"valuationDate\" : \"2018-04-13\" }, \"numberOfDaysAccrued\" : 34, \"price\" : { \"priceDate\" : \"\", \"sourceOfPrice\" : \"SIX Swiss Exchange\", \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"positionDate\" : \"2018-04-13\", \"blockedQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"endOfDayIndicator\" : true, \"costPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"rateDate\" : \"\", \"value\" : 0.98, \"sourceOfRate\" : \"Reuters 4 o'clock\" }, \"accruedInterest\" : { \"amount\" : 12000, \"currency\" : \"CHF\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers : Returns all customers (business partners) accessible for the logged in user
     * This endpoint returns a highlevel list of customers accessible for the logged in user. Paging is done based on the customer object, i.e. if limit is set to 1, then 1 customer will be returned per page. 
     *
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @param cursor An opaque string value used for pagination. (optional)
     * @param limit Maximum number of items to return. (optional)
     * @return Returns a list with all customers. (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomers
     */
    default ResponseEntity<List<Customer>> getCustomers(String xCorrelationID,
        String cursor,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"number\" : \"12345-6\", \"referenceCurrency\" : \"CHF\", \"id\" : \"MTIzNDUtNg\" }, { \"number\" : \"12345-6\", \"referenceCurrency\" : \"CHF\", \"id\" : \"MTIzNDUtNg\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId} : Returns a specific customer accessible for the logged in user
     * This endpoint returns a single customer.
     *
     * @param customerId Customer ID Parameter. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @return Returns a the specified customer. (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getCustomersByCustomerId
     */
    default ResponseEntity<Customer> getCustomersByCustomerId(String customerId,
        String xCorrelationID) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"number\" : \"12345-6\", \"referenceCurrency\" : \"CHF\", \"id\" : \"MTIzNDUtNg\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId}/transactions : Returns a transactions for a specific customer
     * Returns all transactions for the a specific customer. Paging is done based on the transaction object, i.e. if limit is set to 1, then 1 transaction will be returned per page. 
     *
     * @param customerId Customer ID Parameter. (required)
     * @param date A date value. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @param endOfDayIndicator Indicates if the resources (positions &amp; transactions) have been confirmed by the end-of-day (eod) processing. - If the parameter is not set, all resources will be delivered. - If the parameter is set to true, only resources with with the particular property set to true will be delivered. - If the parameter is set to false, only resources with with the particular property set to false will be delivered.  (optional)
     * @param cursor An opaque string value used for pagination. (optional)
     * @param limit Maximum number of items to return. (optional)
     * @return Returns a transaction list for a specific customer. (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getTransactionByCustomerId
     */
    default ResponseEntity<List<Transaction>> getTransactionByCustomerId(String customerId,
        LocalDate date,
        String xCorrelationID,
        Boolean endOfDayIndicator,
        String cursor,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"reversalIndicator\" : false, \"placeOfTrade\" : { \"marketDescription\" : \"OTC\", \"marketIdentificationCode\" : \"XSWX\" }, \"description\" : \"Buy 500 Apple Inc at 176 USD\", \"triggeringFinancialInstrument\" : { \"identificationList\" : [ { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" }, { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" } ], \"name\" : \"Novartis AG\", \"currencyOfDenomination\" : \"CHF\", \"type\" : \"equity\", \"factor\" : 0.85, \"additionalDetails\" : \"Group contract number 129959961\", \"cfiCode\" : \"ESVUFR\", \"hasFactor\" : true }, \"tradeDate\" : \"2018-04-13\", \"settlementDate\" : \"2018-04-13\", \"type\" : \"buy\", \"transactionDate\" : \"2018-04-13\", \"additionalDetails\" : \"Replaces transaction nr. 12234567489\", \"postingAmountList\" : [ { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } }, { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } } ], \"reference\" : \"XS12345678\", \"reversedTransactionId\" : \"2134123-415\", \"settlementCurrency\" : \"CHF\", \"movementList\" : [ { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" }, { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" } ], \"customerId\" : \"12345-6\", \"endOfDayIndicator\" : true, \"triggeringPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"id\" : \"9876-54321\", \"triggeringQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 } }, { \"reversalIndicator\" : false, \"placeOfTrade\" : { \"marketDescription\" : \"OTC\", \"marketIdentificationCode\" : \"XSWX\" }, \"description\" : \"Buy 500 Apple Inc at 176 USD\", \"triggeringFinancialInstrument\" : { \"identificationList\" : [ { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" }, { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" } ], \"name\" : \"Novartis AG\", \"currencyOfDenomination\" : \"CHF\", \"type\" : \"equity\", \"factor\" : 0.85, \"additionalDetails\" : \"Group contract number 129959961\", \"cfiCode\" : \"ESVUFR\", \"hasFactor\" : true }, \"tradeDate\" : \"2018-04-13\", \"settlementDate\" : \"2018-04-13\", \"type\" : \"buy\", \"transactionDate\" : \"2018-04-13\", \"additionalDetails\" : \"Replaces transaction nr. 12234567489\", \"postingAmountList\" : [ { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } }, { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } } ], \"reference\" : \"XS12345678\", \"reversedTransactionId\" : \"2134123-415\", \"settlementCurrency\" : \"CHF\", \"movementList\" : [ { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" }, { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" } ], \"customerId\" : \"12345-6\", \"endOfDayIndicator\" : true, \"triggeringPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"id\" : \"9876-54321\", \"triggeringQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 } } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customerId}/transactions/{transactionId} : Returns a transaction for a specific customer
     * Returns a transaction instance by id.
     *
     * @param customerId Customer ID Parameter. (required)
     * @param transactionId Transaction ID. (required)
     * @param xCorrelationID Unique ID (defined by the caller) which will be reflected back in the response. (required)
     * @return Returns a transaction list for a specific customer. (status code 200)
     *         or Bad Request - The server cannot or will not process the request due to something that is perceived to be a client error as malformed request syntax.  (status code 400)
     *         or Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource. (status code 401)
     *         or Forbidden - The server understood the request but refuses to authorize it. (status code 403)
     *         or Not Found - The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.  (status code 404)
     *         or Method Not Allowed - The method received in the request-line is known by the origin server but not supported by the target resource.  (status code 405)
     *         or Internal Server Error - The server encountered an unexpected condition that prevented it from fulfilling the request. (status code 500)
     *         or Not Implemented - The server does not support the functionality required to fulfill the request. (status code 501)
     *         or Service Unavailable - The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. (status code 503)
     * @see CustomersApi#getTransactionByTransactionId
     */
    default ResponseEntity<Transaction> getTransactionByTransactionId(String customerId,
        String transactionId,
        String xCorrelationID) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"reversalIndicator\" : false, \"placeOfTrade\" : { \"marketDescription\" : \"OTC\", \"marketIdentificationCode\" : \"XSWX\" }, \"description\" : \"Buy 500 Apple Inc at 176 USD\", \"triggeringFinancialInstrument\" : { \"identificationList\" : [ { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" }, { \"identifier\" : \"CH0012005267\", \"type\" : \"isin\" } ], \"name\" : \"Novartis AG\", \"currencyOfDenomination\" : \"CHF\", \"type\" : \"equity\", \"factor\" : 0.85, \"additionalDetails\" : \"Group contract number 129959961\", \"cfiCode\" : \"ESVUFR\", \"hasFactor\" : true }, \"tradeDate\" : \"2018-04-13\", \"settlementDate\" : \"2018-04-13\", \"type\" : \"buy\", \"transactionDate\" : \"2018-04-13\", \"additionalDetails\" : \"Replaces transaction nr. 12234567489\", \"postingAmountList\" : [ { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } }, { \"amount\" : 13023, \"currency\" : \"CHF\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" } } ], \"reference\" : \"XS12345678\", \"reversedTransactionId\" : \"2134123-415\", \"settlementCurrency\" : \"CHF\", \"movementList\" : [ { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" }, { \"movementTypeAdditionalInformation\" : \"Fees for Reporting Service\", \"quantity\" : { \"type\" : \"unit\", \"value\" : 12000 }, \"positionId\" : \"1234566-12-1\", \"price\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"movementDate\" : \"2018-04-13\", \"foreignExchangeRate\" : { \"targetCurrency\" : \"CHF\", \"sourceCurrency\" : \"CHF\", \"value\" : 0.98 }, \"valueDate\" : \"2018-04-13\", \"type\" : \"cash\", \"account\" : { \"portfolioInformation\" : { \"identification\" : \"87654-3219\", \"referenceCurrency\" : \"CHF\" }, \"number\" : \"123-1234-234\", \"referenceCurrency\" : \"CHF\", \"iban\" : \"CH123456789\", \"name\" : \"Household account\", \"id\" : \"8765432-19\", \"designation\" : \"Current Account CHF\", \"type\" : \"cashAccount\" }, \"positionCurrency\" : \"CHF\" } ], \"customerId\" : \"12345-6\", \"endOfDayIndicator\" : true, \"triggeringPrice\" : { \"currency\" : \"CHF\", \"type\" : \"percentage\", \"value\" : 12000 }, \"id\" : \"9876-54321\", \"triggeringQuantity\" : { \"type\" : \"unit\", \"value\" : 12000 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
