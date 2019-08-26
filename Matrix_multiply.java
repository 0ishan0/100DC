//This program multiply 2 given matrices.
import java .io.*;
public class Matrix_multiply
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int i,j,k,r1,c1,r2,c2; double sum=0;
        System.out.print("Enter the no. of rows of 1st matrix: ");
        r1=Integer.parseInt(br.readLine());
        System.out.print("Enter the no. of columns of 1st matrix: ");
        c1=Integer.parseInt(br.readLine());
        System.out.println("Enter the elements of First Array:");
        
        double a[][]=new double [r1][c1];
        
        for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)   
                a[i][j]=Integer.parseInt(br.readLine());
        
        System.out.println("The first matrix:");
 
        for (i = 0; i < r1; i++)
        {
            for (j = 0; j < c1; j++)
               System.out.print(a[i][j]+"\t");
 
            System.out.print("\n");
        }        
                
        System.out.print("Enter the no. of rows of 2nd matrix: ");
        r2=Integer.parseInt(br.readLine());
        System.out.print("Enter the no. of columns of 2nd matrix: ");
        c2=Integer.parseInt(br.readLine());
        System.out.println("Enter the elements of Second Array:");
        
        double b[][]=new double [r2][c2];
        
        for(i=0;i<r2;i++)
            for(j=0;j<c2;j++)
                b[i][j]=Integer.parseInt(br.readLine());
        
        System.out.println("The second matrix:");
 
        for (i = 0; i < r2; i++)
        {
            for (j = 0; j < c2; j++)
               System.out.print(b[i][j]+"\t");
 
            System.out.print("\n");
        }        
                
        if(r1!=c2)
        {
            System.out .println("The matrix can not be multiplied.");
            System.exit(0);
        }
        
        else
        {
            double c[][]=new double [r2][c1];
            
            for(i=0;i<c1;i++)
                for(j=0;j<r2;j++)
                {
                    for(k=0;k<c2;k++)
                        sum=sum+a[i][k]*b[k][j];
                    c[i][j]=sum;
                    sum=0;
                }
            
            
            System.out.println("Product of the matrices:");
 
            for (i = 0; i < r1; i++)
            {
                for (j = 0; j < c2; j++)
                    System.out.print(c[i][j]+"\t");
                    
                System.out.print("\n");
            }
        }
    }
}
