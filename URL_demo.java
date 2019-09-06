// Gives the information of the URL provided by the user.

import java.net.*;
import java.io.*;
import java.util.*;

public class URL_demo 
{

   public static void main(String [] args) 
   {
      Scanner scan=new Scanner(System.in);
      try 
      {
         String s;
         System.out.println("Enter a URL: ");
         s=scan.nextLine();
         URL url = new URL(s);
         
         System.out.println("URL is: " + url.toString());
         System.out.println("protocol is: " + url.getProtocol());
         System.out.println("authority is: " + url.getAuthority());
         System.out.println("file name is: " + url.getFile());
         System.out.println("host is: " + url.getHost());
         System.out.println("path is: " + url.getPath());
         System.out.println("port is: " + url.getPort());
         System.out.println("default port is: " + url.getDefaultPort());
         System.out.println("query is: " + url.getQuery());
         System.out.println("ref is: " + url.getRef());
      } 
      catch (IOException e) 
      {
         e.printStackTrace();
      }
   }
}
