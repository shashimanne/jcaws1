
import static org.junit.Assert.*;



import org.junit.Test;

public class PassValidatorTest {

 @Test

 public void test() {

// PassValidator ob=new PassValidator();

 //boolean res=ob.isValid("aef123");
	 boolean res=PassValidator.isValid("af23");


 assertEquals(true,res);

 }

}







