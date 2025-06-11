
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jackson.poc.model.Equity;
import com.jackson.poc.model.FinancialInstrument;
import com.jackson.poc.model.InterestRateSwap;

public class PocTest {

	@Test
	void test() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		//we create concrete class for IRS
		FinancialInstrument irsObject = new InterestRateSwap();
		//we serialize it to string
		String irsString = objectMapper.writeValueAsString(irsObject);
		//we see that the output contains property "type" indicating concrete type
		System.out.println(irsString);

		//we take the json string for the irs
		//and deserialize it using top level interface FinancialInstrument (behind is concrete class)
		FinancialInstrument financialInstrument = objectMapper.readValue(irsString, FinancialInstrument.class);

		//the type is IRS
		System.out.println(financialInstrument.getType());
		//the concrete deserialized class is not equity
		System.out.println("Deserialized object is equity: " + (financialInstrument instanceof Equity));
		assertFalse(financialInstrument instanceof Equity);
		//the concrete deserialized class is IRS
		System.out.println("Deserialized object is IRS: " + (financialInstrument instanceof InterestRateSwap));
		assertTrue(financialInstrument instanceof InterestRateSwap);
	}
}