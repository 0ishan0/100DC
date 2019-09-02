import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Array_rotate_left
{

    // Complete the rotLeft function below.
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        System.out.print("Enter the size of array and the number of time to rotate.(Please apply a space in between): ");
        
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);
        
        System.out.print("Enter the array: ");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int b[]=new int[n];
        StringBuilder output = new StringBuilder();
    
        for(int i = 0; i<n; i++) {
        
            b[i] = a[(i+d) % n];
            output = output.append(b[i]).append(" ");
        
        }
        
        System.out.println("The final value: ");
        
        for (int i = 0; i < b.length; i++) {
            bufferedWriter.write(String.valueOf(b[i]));

            if (i != b.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
