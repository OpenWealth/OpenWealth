
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

		FinancialInstrument fixedDeposit = new FixedDeposit();
		String fixedDepositString = objectMapper.writeValueAsString(fixedDeposit);
		System.out.println(fixedDepositString);
		/*
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


		FinancialInstrument deserializedObject  = objectMapper.readValue(fixedDepositString, FinancialInstrument.class);
		/* deserialized object is:

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
		System.out.println(deserializedObject);


		//We would expect the fixed deposit type to be included into the string
		//THIS WILL FAIL
		assertTrue(fixedDepositString.contains("fixedDeposit"));
		// .. and the object to be of correct type
		//THIS WILL FAIL TOO
		assertTrue(deserializedObject.getType() == FinancialInstrumentType.FIXED_DEPOSIT);

	}
}