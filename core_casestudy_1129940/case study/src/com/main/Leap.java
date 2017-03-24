package com.main;


	
import java.util.InputMismatchException;
import java.util.Scanner;

public class Leap
{
	public static void main(String args[]) throws InputMismatchException,NumberFormatException
	{
		int year;

		boolean status=false;

		System.out.print("\n Enter the year:");
		Scanner input=new Scanner(System.in);
		year=input.nextInt();
 
		try
		{
			
			
			
				if((year%4 == 0) && (year%100!=0))
				{
					status=true;
				}
				else if(year%100 == 0)
				{
					status=false;
				}
				else if(year%400 == 0)
				{
					status=true;
				}
				else
				{
					status=false;
				}
			
		}
		catch(InputMismatchException e)
		{
			
			System.out.println("e");
		}
		catch(NumberFormatException e)
		{
			System.out.println("jlk");
		}
		
		finally
		{
			if(status==false)
			{
				System.out.println("Not a leap year");
			}
			else
			{
				System.out.println("Is a leap year");
			}
    
		}
  
 }
}

