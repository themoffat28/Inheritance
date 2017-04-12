package model;

public abstract class Animal implements Flammable
{
	String name;
	int speed;
	int flammability;
	
	public Animal(String name, int speed)
	{
		this.name = name;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "[name = " + this.name + ", speed = " + this.speed + "]";
	}
}
