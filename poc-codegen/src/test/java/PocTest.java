
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.jackson.poc.model.*;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

public class PocTest {

	@Test
	void test() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		FinancialInstrument fixedDeposit = new FixedDeposit().type(FinancialInstrumentType.FIXED_DEPOSIT);
		String fixedDepositString = objectMapper.writeValueAsString(fixedDeposit);
		System.out.println(fixedDepositString);
/*
{
  "type" : "fixedDeposit",
  "name" : null,
  "identificationList" : [ ],
  "cfiCode" : null,
  "currencyOfDenomination" : null,
  "hasFactor" : null,
  "factor" : null,
  "additionalDetails" : null,
  "principalAmount" : null,
  "interestRate" : null,
  "maturityDate" : null
}
 */

		FinancialInstrument deserializedObject  = objectMapper.readValue(fixedDepositString, FinancialInstrument.class);

		System.out.println(deserializedObject);
/*
class FixedDeposit {
    type: fixedDeposit
    name: null
    identificationList: []
    cfiCode: null
    currencyOfDenomination: null
    hasFactor: null
    factor: null
    additionalDetails: null
    principalAmount: null
    interestRate: null
    maturityDate: null
}
 */

		//We would expect the fixed deposit type to be included into the string
		assertTrue(fixedDepositString.contains("fixedDeposit"));
		// .. and the object to be of correct type
		assertTrue(deserializedObject.getType() == FinancialInstrumentType.FIXED_DEPOSIT);
		assertTrue(deserializedObject instanceof FixedDeposit);


		FinancialInstrument fixedLoan = new MoneyMarket().type(FinancialInstrumentType.FIXED_LOAN);
		String fixedLoanString = objectMapper.writeValueAsString(fixedLoan);
		/* would print WRONG :
		{
  "type" : "callableDeposit",
  "name" : null,
  "identificationList" : [ ],
  "cfiCode" : null,
  "currencyOfDenomination" : null,
  "hasFactor" : null,
  "factor" : null,
  "additionalDetails" : null,
  "principalAmount" : null,
  "interestRate" : null,
  "maturityDate" : null
}
		 */
		System.out.println(fixedLoanString);


		FinancialInstrument deserializedFixedLoan  = objectMapper.readValue(fixedLoanString, FinancialInstrument.class);

		System.out.println(deserializedFixedLoan);
/*  Would also print WRONG
class MoneyMarket {
    type: callableDeposit
    name: null
    identificationList: []
    cfiCode: null
    currencyOfDenomination: null
    hasFactor: null
    factor: null
    additionalDetails: null
    principalAmount: null
    interestRate: null
    maturityDate: null
}
 */
	}
}