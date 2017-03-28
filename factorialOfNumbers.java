//https://projecteuler.net/problem=20

public class factorialOfNumbers {

	public static int factorialNumbers(int n)
	{
		double total =1;
		for (int i =1;i<=n;i++)
		{
		total = total*i	;
		}
		System.out.println(total);
		return 0;
	}
	
	public static void main(String[] args) {
		factorialOfNumbers.factorialNumbers(100);
	}

}
