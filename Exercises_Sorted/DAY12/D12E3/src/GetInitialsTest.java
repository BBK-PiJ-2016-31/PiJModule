import org.junit.*;
import static org.junit.Assert.*;

public class GetInitialsTest { 
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt"; 
		String output = p.getInitials(input); 
		String expected = "DRY"; 
		assertEquals(String.format("%S Came back, %S was expected",output, expected),output,expected);
	} 
}