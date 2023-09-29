
public class ArrayofMethodCallsExample
	{
	public static void main(String[] args)
		{
		  Runnable [] myArray = new Runnable[3];

	        myArray[0] = () -> 
	            {
	            System.out.println("Method 1");
	            };
	        myArray[1] = () -> 
	            {
	            System.out.println("Method 2");
	            };
	        myArray[2] = () -> 
	            {
	            System.out.println("Method 3");
	            };

	        int randomNumber = (int)(Math.random() * myArray.length);
	        myArray[randomNumber].run();

        }
	}
