package model;

public class Dragon extends Animal
{
	public Dragon()
	{
		super("Ridgeback", 2000);
		flammability = 0;
	}
	
	@Override
	public boolean isFlammable()
	{
		return false;
	}
	
	@Override
	public boolean isFlameRetardant()
	{
		return true;
	}
	
	@Override
	public boolean isDrenchedInLighterFluid()
	{
		return false;
	}
	
	@Override
	public void setFlammabilityLevel(int level)
	{
		this.flammability = level;
	}
	
	@Override
	public int getFlammabilityLevel()
	{
		return flammability;
	}
}
