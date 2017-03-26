//https://projecteuler.net/problem=2
/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.*/

package fibanocciEvenNumbersSummation;

public class fibanocciEvenNumbersSummation 
{
	public static int summation(int n)
	{
	int a =0;
	int b=1;
	System.out.println("The Fibonocci series are: ");
	System.out.println(a);
	System.out.println(b);
	int twomutiplessum = 0;
	
	for (int i=0;i+a<n;i++)
	{
		i = a+b;
		a=b;
		b=i;
		System.out.println(i);
		
	if (i%2 ==0)
		{
			twomutiplessum = twomutiplessum + i;

		}
	}
	System.out.println();
	System.out.println("The Summation of the even numbers are :");
	System.out.println(twomutiplessum);
	return 0;
	}
	
	public static void main(String[] args)
	{
		fibanocciEvenNumbersSummation.summation(15);
	}

}
