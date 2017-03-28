//https://projecteuler.net/problem=16

package powerDigitSum;

public class powerDigitSum {

	public static void main(String[] args) {
		
		long temp =1;
		for (int i=1;i<=15;i++)
		{
			temp=temp*2;
		}
		System.out.println(temp);
		String str = Long.toString(temp);
		String tempstr1;
		long tempint = 0;
		long sum=0;
		
		for(int j=0;j<str.length();j++)
		{		
		tempstr1=str.substring(j,j+1);
		tempint = Long.parseLong(tempstr1);
		System.out.println(tempint);
		sum = sum+tempint;
		}
		System.out.println(sum);

		//array[j] = tempint;
	}

}
