//This program displays the day when the date is provided.

import java.io.*;
import java.util.*;
import java.time.LocalDate;
class Result 
{
    public static String findDay(int month, int day, int year) 
    {
        return LocalDate.of(year, month, day).getDayOfWeek().name();

    }
}
public class Date_and_time {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the date in DD MM YYYY manner: ");
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int day = Integer.parseInt(firstMultipleInput[0]);
        int month = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);
        System.out.println("The day is: "+res);
        bufferedReader.close();
    }
}
