import java.util.*;

public class w51alternate
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("Please enter a string to check if it is a palindrome.");
     String temp = s.next();
     StringBuffer ol = new StringBuffer(temp);
     String org = ol.toString();
     String rev = ol.reverse().toString();
  
     if(org.equals(rev))
	System.out.println("Palindrome");
     else
        System.out.println("Not a palindrome.");     
     
  }
}
