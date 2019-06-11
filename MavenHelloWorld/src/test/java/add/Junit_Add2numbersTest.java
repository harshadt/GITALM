package add;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_Add2numbersTest {
	AddTwoNumbers2 b = new AddTwoNumbers2();

	@Test
		
		public final void testSum(){
			assertEquals(5,b.sum(2,3));
	}

}
