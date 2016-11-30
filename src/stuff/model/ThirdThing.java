package stuff.model;

public class ThirdThing extends SubThing implements UnDoAble
{
	
	public void undoesThat()
	{
		
	}
	
	public int undoesOtherThings()
	{
		return Integer.MIN_VALUE;
	}
	
	public void removesThingsFromNumberedSlots(int [] things)
	{
		
	}
	
	public int doesOtherThings(int times)
	{
		return Integer.MAX_VALUE;
	}
	
	public int [] shovesThingsIntoNumberSlots()
	{
		int [] temp = new int[5];
		
		return temp;
	}
	
	public void doesThat()
	{
		System.out.println("sub class version");
		super.doesThat();
	}
}
