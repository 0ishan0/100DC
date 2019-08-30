import java.io.*;
import java.util.Arrays;
public class QuickSort
{
	
	private int a[]; //The array to be sorted.
	private int l; //Length of the array.
	
	public void sort(int n[]) //To assign the length of the array.
	{
		if(n == null || n.length == 0)
			return;
		
		this.a = n;
		l = n.length;
		q_sort(0 , l - 1);
	}
	
	public void q_sort(int lb , int ub) //To sort the array.
	{
		int i = lb; //Temporary varible to store the value of lb(lower bound).
		int j = ub; //Temporary varible to store the value of ub(upper bound).
		
		//calculate pivot number.
		int p = a[lb + (ub - lb) / 2];
		//Divide the array.
		while(i <= j)
		{
			while(a[i] < p)
				i++;
			while(a[j] > p)
				j--;
		
			if(i <= j)
			{
				swap(i , j);
				//change index to next position on both sides.
				i++;
				j--;
			}
		}
			
		//call q_sort() recursively.
		{
			if(lb < j)
				q_sort(lb , j);
			if(i < ub)
				q_sort(i , ub);
		}
			
	}
	
	//To swap two numbers.
	public void swap(int i , int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        QuickSort ob = new QuickSort();
		System.out.print("Enter the no. of elements: ");
		int n = Integer.parseInt(br. readLine());
		int x[] = new int[n];
		int i;
		System.out.println("Enter the elements: ");
		for(i = 0 ; i < n ; i++)
			x[i] = Integer.parseInt(br.readLine());
		System.out.println(Arrays.toString(x));
		ob.sort(x);
		System.out.println("Sorted Array: ");
                System.out.println(Arrays.toString(x));
	}
}
