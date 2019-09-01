import java.io.*;
import java.util.*;

public class Max_min_sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
    {
        int s[] = new int[5];
        int t=0,i,j;
        for(i=0;i<5;i++)
        {
            int sum=0;
            for(j=0;j<5;j++)
            {
                if(j==i);
                else
                {
                    sum+=arr[j];
                }
            }
            s[i]=sum;
        }
        int min=s[0],max=s[0];
        for(i=1;i<5;i++)
        {
            if(min>s[i])
                min=s[i];
            if(max<s[i])
                max=s[i];
        }

        System.out.println("Min sum: "+min+", Max sum: "+max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.print("Enter 5 no with spaces: "); 
        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 5; i++) 
        {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
