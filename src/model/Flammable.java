package model;
/**
 * 
 *@author Braeden Moffat
 *@author Dylan Robson
 *@author Kaden Martinsen
 *@author Jacob Osborne
 * 
 */
public interface Flammable
{
	public boolean isFlammable();
	public boolean isFlameRetardant();
	public boolean isDrenchedInLighterFluid();
	
	public void setFlammabilityLevel(int level);
	public int getFlammabilityLevel();
	public int flammability = 0;
}
