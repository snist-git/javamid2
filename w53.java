//program to count the number of words in a file

import java.util.*;
import java.io.*;

public class w53
{
  public static void main(String args[]) throws IOException
  {
     FileInputStream fis = new FileInputStream("a.txt");
     int ch;
     int count=1;
     String a="";
     while((ch=fis.read())!=-1)
     {	
	      if(((char)ch)==' ')
		      count+=1;	
     }
     System.out.println("Number of words in the file :"+count);
    
 }
}
