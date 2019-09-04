//Program to count the minimum notes required to make the given Amount.

import java.util.*;

public class Notes
{
    public static int countNotes(int n)
    {
        int c=0;
        while(n>=2000)
        {
            c++;
            n-=2000;
        }
        if(c != 0)
            System.out.println("2000: "+c);
        c=0;
        while(n>=500)
        {
            c++;
            n-=500;
        }
        if(c != 0)
            System.out.println("500: "+c);
        c=0;
        while(n>=200)
        {
            c++;
            n-=200;
        }
        if(c != 0)
            System.out.println("200: "+c);
        c=0;
        while(n>=100)
        {
            c++;
            n-=100;
        }
        if(c != 0)
            System.out.println("100: "+c);
        c=0;
        while(n>=50)
        {
            c++;
            n-=50;
        }
        if(c != 0)
            System.out.println("50: "+c);
        c=0;
        while(n>=20)
        {
            c++;
            n-=20;
        }
        if(c != 0)
            System.out.println("20: "+c);
        c=0;
        while(n>=10)
        {
            c++;
            n-=10;
        }
        if(c != 0)
            System.out.println("10: "+c);
        c=0;
        while(n>=5)
        {
            c++;
            n=n-5;
        }
        if(c != 0)
            System.out.println("5: "+c);
        c=0;
        while(n>=2)
        {
            c++;
            n=n-2;
        }
        if(c != 0)
            System.out.println("2: "+c);
        c=0;
        while(n>=1)
        {
            c++;
            n=n-1;
        }
        if(c != 0)
            System.out.println("1: "+c);
        return 0;
    }
    
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String args[])
    {
        int amt;
        System.out.print("Enter the amount: ");
        amt=sc.nextInt();
        System.out.println("The minimum notes are: ");
        countNotes(amt);
    }
}
