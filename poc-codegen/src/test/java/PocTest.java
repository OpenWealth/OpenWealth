
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.swissquote.poc.model.FinancialInstrument;
import com.swissquote.poc.model.FinancialInstrumentType;
import com.swissquote.poc.model.InterestRateSwap;

public class PocTest {

	@Test
	void test() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		FinancialInstrument swap = new InterestRateSwap();

		String swapString = objectMapper.writeValueAsString(swap);
		System.out.println(swapString);

		FinancialInstrument financialInstrument = objectMapper.readValue(swapString, FinancialInstrument.class);

		System.out.println(financialInstrument.getType());
		System.out.println("Deserialized object is equity: " + financialInstrument.getType().equals(FinancialInstrumentType.EQUITY));
		System.out.println("Deserialized object is IRS: " + financialInstrument.getType().equals(FinancialInstrumentType.INTEREST_RATE_SWAP));
	}
}
