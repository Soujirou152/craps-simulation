
public class PredictableDie extends Die
{
	private int[] throwSequence = {};
	private int nextInSeq = 0;
	
	public PredictableDie(int[] seq)
	{
		if(seq.length == 0 || seq == null)
		{
			throw new RuntimeException();
		}
		this.throwSequence = seq;
	}
	
	public void setThrowSequence(int[] seq)
	{
		if(seq.length == 0 || seq == null)
		{
			throw new RuntimeException();
		}
		this.throwSequence = seq;
	}
	
	@Override public void roll()
	{		
		if(this.nextInSeq == throwSequence.length)
		{
			this.nextInSeq = 0;			
		}
		
		super.lastRoll = throwSequence[nextInSeq];
		
		this.nextInSeq++;		
	}
	
	
	
	public static void main(String[] args)
	{
		//TODO
	}

}
