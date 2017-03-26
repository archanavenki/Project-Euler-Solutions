// Project Euler problem 1 
//https://projecteuler.net/problem=1

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

public class threeAndFiveMultiplesSummation {
	
	public static int mutiplesummation(int n)
	{
		int i =0;
		int total =0;// variable to store the totals of 3 and 5 multiples
		for(i=1;i<n;i++)
		{
			if ((i%3==0) || (i%5==0))
			{
				total = total +i;
			}
		}
		System.out.println(total);

		return 0;
	}

	public static void main(String[] args)
	{
	threeAndFiveMultiplesSummation.mutiplesummation(1000); //calling the created method using the class
	}

}
