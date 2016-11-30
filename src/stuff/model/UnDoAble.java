package stuff.model;

public interface UnDoAble
{
	public void undoesThat();
	public void removesThingsFromNumberedSlots(int [] things);
	public int undoesOtherThings();
}
