package oddeven1;
import static org.junit.Assert.*;
import org.junit.Test;

public class NumberCheck {

 @Test
 public void test1() {

  assertTrue(NumberCheck.isEven(2));
  assertFalse(NumberCheck.isEven(2));
 }

private static boolean isEven(int i) {
	// TODO Auto-generated method stub
	return false;
}
}