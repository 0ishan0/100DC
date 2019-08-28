//Find longest Palindromic Substring within a string from the string given by the user.

import java.io.*;

public class Longest_palindrome
{
	public static void printSubStr(String str, int m, int n)
	{
		System.out.println(str.substring(m, n+1));
	}
	
	public static int longPalSubstr(String str)
	{
		int n=str.length();
		boolean t[][]= new boolean[n][n];
		int l=1, i, k, j;
		for(i=0;i<n;++i)
			t[i][i]=true;
		int strt=0;
		for(i=0;i<n-1;++i)
			if(str.charAt(i) == str.charAt(i+1))
			{
				t[i][i+1]=true;
				strt=i;
				l=2;
			}
		for(k=3;k<=n;++k)
			for(i=0;i<n-k+1;++i)
			{
				j=i + k - 1;
				if(t[i+1][j-1] && str.charAt(i) == str.charAt(j))
				{
					t[i][j]= true;
					if(k > l)
					{
						strt = i;
						l=k;
					}
				}
			}
		
		System.out.print("The longest palindrome in the Given String is: ");
		printSubStr(str, strt, strt + l - 1);
		return l;
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.print("Enter the string value: ");
		s= br.readLine();
		System.out.println("The length of the palindrome substring is: " + longPalSubstr(s));
	}
}
