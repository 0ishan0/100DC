// the program converts the number given by the user to words.

import java.util.*;

public class Num_to_word
{
    
    public static int returnAt(int n, int p)
    {
        int c=0, t=0;
        while(n!=0)
        {
            t=n%10;
            
            c++;
            if(p == c)
                return t;
            n/=10;
        }
        return 0;
    }
    
    public static void pValue(int n1, int n)
    {
        if(n==3 && n1!=0)
            System.out.print("hundred ");
        else if(n==4 && n1!=0)
            System.out.print("thousand ");
        else if(n==6 && n1!=0)
            System.out.print("lakh ");
        else if(n==8 && n1!=0)
            System.out.print("crore ");
    }
    
    public static void num(int n, int n1, int n2, int p)
    {
        if(p == 3)
            n2 = 0;
        if(p == 9 || p == 7 || p == 5 || p == 2)
        {
           if(n == 1)
            {
                if(n1 == 0)
                    System.out.print("ten ");
                else if(n1 == 1)
                    System.out.print("eleven ");
                else if(n1 == 2)
                    System.out.print("twelve ");
                else if(n1 == 3)
                    System.out.print("thirteen ");
                else if(n1 == 4)
                    System.out.print("fourteen ");
                else if(n1 == 5)
                    System.out.print("fifteen ");
                else if(n1 == 6)
                    System.out.print("sixteen ");
                else if(n1 == 7)
                    System.out.print("seventeen ");
                else if(n1 == 8)
                    System.out.print("eighteen ");
                else if(n1 == 9)
                    System.out.print("nineteen ");
            }
            
                else if(n==2 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("twenty ");
                else if(n==3 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("thirty ");
                else if(n==4 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("forty ");
                else if(n==5 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("fifty ");
                else if(n==6 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("sixty ");
                else if(n==7 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("seventy ");
                else if(n==8 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("eighty ");
                else if(n==9 && (p == 2 || p == 5 || p == 7 || p == 9))
                    System.out.print("ninty ");
        }        
         
        else if(n == 1 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("one ");    
        else if(n == 2 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("two ");
        else if(n == 3 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("three ");
        else if(n == 4 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("four ");
        else if(n == 5 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("five ");
        else if(n == 6 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("six ");
        else if(n == 7 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("seven ");
        else if(n == 8 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("eight ");
        else if(n == 9 && n2 != 1 && (p == 1 || p == 3 || p == 4 || p == 6 || p == 8))
            System.out.print("nine ");
    }
    
    public static int count(int n)
    {
        int c = 0;
        
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n, i;
        System.out.print("Enter the money: ");
        n= sc.nextInt();
        sc.nextLine();
        int c1=count(n);
        int t=n;
        while(t!=0)
        {
            if(t==0)
                num(returnAt(n,c1),returnAt(n,c1-1),1,count(t));
            else
                num(returnAt(n,c1),returnAt(n,c1-1),returnAt(n,c1+1),count(t));
            pValue(returnAt(n,c1), count(t));
            t/=10;
            c1--;
        }
        System.out.println("only.");   
    }
}
