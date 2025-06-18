import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

	public class SquareFunctinTest{

 @Test

 public void testSquareIsCorrect(){

 int actual = SquareFunction.square(4);
  
  int expected = 16;

 assertEquals(actual, expected);


	}

@Test

public void testNegativeSquareIsCorrect(){

int actual =  SquareFunction.square(-10);
int expected = 100;
assertEquals(actual, expected);

}




}