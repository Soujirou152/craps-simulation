import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPredictableDie
{

	@Test
	public void test_predictable_die_one_value()
	{
		PredictableDie pd = new PredictableDie(new int[] {1});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_two_value()
	{
		
		PredictableDie pd = new PredictableDie(new int[] {1,2});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(2, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_two_value_rollover()
	{
		
		PredictableDie pd = new PredictableDie(new int[] {1,2});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(2, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_three_value()
	{
		
		PredictableDie pd = new PredictableDie(new int[] {1,2, 3});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(2, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(3, pd.getLastRoll());
	}
	

}
