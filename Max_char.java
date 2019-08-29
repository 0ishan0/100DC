import java.io.*;
public class Max_char
{
	static final int n = 256;
	
	static char MaxOccuringChar(String s)
	{
		int c[] = new int [n];
		int e
		int l = s.length(), i;
		for(i=0 ; i<l ; i++)
			c[s.charAt(i)]++;
		int max = -1;
		char result = ' ';
		for(i = 0 ; i < l ; i++)
			if(max < c[s.charAt(i)])
			{
				max = c[charAt(i)];
				result = s.charAt(i);
			}
		
		return result;
	}
	
	public static void main (String args []) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in));
		String s;
		System.out.print("Enter the string value: ");
		s=br . readLine();
		System.out.println("The max occuring character in '" + s + "' is : " + MaxOccuringChar(s));
	}
}
