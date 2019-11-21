import java.util.*;

public class w51
{
  public static void main(String args[])
  {
     String s = "";
     Scanner si = new Scanner(System.in);
     System.out.println("Please enter a string to check if it is a palindrome.");	
     String o = si.next();
     for(int i=o.length()-1;i>=0;i--)
	s=s+Character.toString(o.charAt(i));
     
     if(s.equals(o))
	System.out.println("Palindrome.");
     else
	System.out.println("Not a palindrome.");
  }
}
