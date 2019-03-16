
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestOverridingStaticMethods {
	
	@Test
	public void test_overriding_static_method()
	{
		
		CrookedDie1 crooked1 = new CrookedDie1();
		
		Die die = new Die();
		
		die = crooked1;
		
		assertNotEquals(crooked1.testStatic(), die.testStatic());
		
		
		
	}

}
