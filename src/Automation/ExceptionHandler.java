package Automation;

public class ExceptionHandler {

	public void mathematicalOperation(int a, int b) 
	{
		System.out.println(a*b);
		
		try 
		{
		System.out.println(a/b);
		}
		
		catch (Exception e)
		{
			System.out.println("Invalid input by user");
			e.printStackTrace();
		}
			System.out.println("Thanks for using");
	}
			
		public static void main (String[]args) {
			ExceptionHandler obj = new ExceptionHandler();
			obj.mathematicalOperation(5,5);
			
		
			}
		}
	