package controller;

import java.util.ArrayList;

public class AppController
{
	private ArrayList<Derpy> myDerps;
	
	private void setupList()
	{
		myDerps.add(new Pizza());
		myDerps.add(new MorningThing());
		myDerps.add(new AfternoonDerp());
	}
	
	public String doStuffWithLists()
	{
		String displayResults = "";
		for(Derpy currentDerp : myDerps)
		{
			displayResults += current
		}
	}
}
