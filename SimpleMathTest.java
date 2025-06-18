import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class SimpleMathTest{

 @Test
public void testThatMultiplicationIsCorrect(){

int input = CalculatorFunction.multiply(5, 4);

int expected = 20;

assertEquals(input, expected); 

}
	
@Test
public void testThatResultIsCorrect(){

int input = CalculatorFunction.calculate(5, 4);

int expected = 29;

assertEquals(input, expected);

	}







}