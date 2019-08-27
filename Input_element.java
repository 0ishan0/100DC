//This program inputs an element in an array in the position assigned by the user.
import java.io.*;
public class Input_element
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n, pos,i,t=0,t1=0,ele;
        
        System.out.print("Enter the no. of elements: ");
        n=Integer.parseInt(br.readLine());
        int a[]= new int [100];
        
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(br.readLine());
        
        for (i = 0; i < n; i++)
            System.out.print(a[i]+"  ");     
             
        System.out.print("\nEnter the position to add element: ");
        pos=Integer.parseInt(br.readLine());
        
        System.out.print("\nEnter the element: ");
        ele=Integer.parseInt(br.readLine());
        
        t=a[pos-1];
        a[pos-1]=ele;
        for(i=pos-1;i<n+1;i++)
        {
            t1=a[i+1];
            a[i+1]=t;
            t=t1;
        }
        System.out.println("Resultant array after insertion: ");
        for (i = 0; i < n+1; i++)
            System.out.print(a[i]+"  ");
    }
}
