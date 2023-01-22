package FizzBuzz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Please intput maximum valume");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //reads user input

		int inpuNum = 0; // this gives a default value

		try
		{
			String Value = reader.readLine(); //this converts the input string into an integer
			inpuNum = Integer.parseInt(Value);
		}catch(Exception e)
		{
			System.out.println("Invalid input"); //this will be thrown if the integer can't be made
		}
		loop(inpuNum); //this calls the below loop function wile carrying the integer value 

	}
	
	public static void loop(int input){
		for(int n = 1; n <= input; n++) {
			
			boolean isFactorOf3 = (n%3 == 0);
			boolean isFactorOf5 = (n%5 == 0);
			
			if (isFactorOf3 && isFactorOf5) {
				System.out.println("FizzBuzz");
				}
			else if (isFactorOf3) {
				System.out.println("Fizz");
			}
			else if (isFactorOf5) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(n);
			}
			
		}
		
	}
}
