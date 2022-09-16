package Implementing;

import java.util.Scanner;

public class Hockey 
{
	 
	
	
	
	 public static void main(String args[])
	    {
		 PuckPart1 pp1= new  PuckPart1();
		 Scanner input = new Scanner(System.in);
		 
		 
		 
		 System.out.println("The of your puck weigth is: ");
		 double w = input.nextDouble();
		 pp1.StaYou(w);
		 
		boolean y = pp1.getYouth();
		boolean s = pp1.getStandard();
		if (y==true) 
		{
			System.out.println("Youth");	
		}
		else if (s==true) 
		{
			System.out.println("Standard");
			
		}
		else if (y == false && s == false) 
		{
			System.out.println("is your puck 1 inch thick (y/n): ");	
			String  yn = input.next();
			if (yn == "y" ) 
			{
				System.out.println("you have a offical hockey puck");
			}
			else 
			{
				System.out.println("youdo not have a offical hockey puck");
			}
		
		
		}
		
		
		
		 
	       
	    }

	
}
