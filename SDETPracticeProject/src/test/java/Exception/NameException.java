package Exception;

import java.util.Scanner;

public class NameException
{
	public static void main(String[] args) throws SubnameException
	{ 
		 Scanner sc = new Scanner(System.in);
		 for(;;)
		 {
		 System.out.println("Enter the name");
			String actualname=sc.nextLine();
			String expectedname="Aishwarya";
	
			if(expectedname.equalsIgnoreCase(actualname))
			{
				System.out.println("matching");
			}
			else{
				try
				{
					throw new SubnameException();
			}
				catch(Exception e)
				
				{
					System.out.println("Exception is handled");
				}
			}
		}
       
		
	}
}
	




