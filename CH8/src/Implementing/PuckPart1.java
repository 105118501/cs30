package Implementing;

public class PuckPart1 
{

	boolean sta=false, you=false;
	
	double wei,thi,dia;
	
	public void StaYou (double w) 
	{
		wei = w;
		sta=false;
		you=false;
		
		if (wei >= 4 && wei <= 4.5) 
		{
			you = true ;
			
		}
		else if (wei >= 5 && wei <= 5.5)
		{
			sta= true ;
			
		}
		
		
	}
	
	public boolean getYouth() 
	{
		return(you);
	}
	public boolean getStandard() 
	{
		return(sta);
	}
	
	public double getWeigth() 
	{
		return(wei);
	}
	
	public double getDivision() 
	{
		return(dia);
	}
	
	public String toString() 
	{
		String out="";
		return(out);
	}
}
