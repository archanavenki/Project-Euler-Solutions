// https://projecteuler.net/problem=4
/* A palindromic number reads the same both ways. 
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.*/

package threeDigitPalindromeMultipleMethod;

import java.util.Arrays;


public class palindrome 
{
	//Method to store original number in an array after converting into string and viceversa
	public int storingIntegersInArray(int n)
	{
		String str = Integer.toString(n);
		int tempint=0;		
		String tempstr1;
		int j;
		int array[] = new int[str.length()];
		int checkpalindrome;
		//System.out.print("Original array: ");
		for(j=0;j<str.length();j++)
			{		
			tempstr1=str.substring(j,j+1);
			tempint = Integer.parseInt(tempstr1);
			array[j] = tempint;
			//System.out.print(array[j]);
			}
		//System.out.println();
		checkpalindrome = reverseArray(array);
		return checkpalindrome;
		
	}
	
	//Method to reverse the original array and storing it in a different array
	public int reverseArray(int[] a)
	{
		int array2[] = new int[a.length];
		int checkpalindrome;
		//System.out.print("Reversed array: ");
		for(int z=0;z<array2.length;z++)
		{	
			array2[z] = a[a.length-z-1];
			//System.out.print(array2[z]);	 
			
		}	
		//System.out.println();
	
	checkpalindrome=palindromeCheck(a,array2);
	return checkpalindrome;
	}

	//Method to check for palindrome
	public int palindromeCheck(int[] a1, int [] a2)
	{
		int value2 =0;

		for( int z=0;z<a1.length;z++)
		{		
		if (Arrays.equals(a1,a2))
		{
				value2=1;

		}
		}
		return value2;
		
	}
	
	//Main function
	public static void main(String[] args) 
	{
		palindrome a1 = new palindrome();
		int value1 =0;
		int checkpalindrome = 0;
		int maxpalindrome = 0;

		for(int i=100;i<1000;i++)
		{					
			for (int a=100;a<1000;a++)
			{
				value1 = i*a;	
				checkpalindrome = a1.storingIntegersInArray(value1);
				if (checkpalindrome==1)
				{
					if (value1>maxpalindrome)
					{
						maxpalindrome = value1;
					}
				}

			
			}
			
			
		}
		
	System.out.println(maxpalindrome);

}

}

