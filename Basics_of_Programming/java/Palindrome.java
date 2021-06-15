//Program to check if string is palindrome
/*Object Oriented Programming Concepts used:
Classes and Objects: We only have one class Palindrome here.
Dependency - Palindrome class is Dependent on Scanner class for reading input.
*/
import java.util.*;

class Palindrome{
  public static boolean isPalindrome(String str)
  {
    //System.out.println(str);
    int j=str.length()-1, i=0;
    while(i<=j)
    {
      if(str.charAt(i)!=str.charAt(j))
        return false;
      i+=1;
      j-=1;
    }
    return true;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String:");
    String str = sc.nextLine();
    boolean res = isPalindrome(str);
    if(res)
    {
      System.out.println("String is Palindrome");
    }
    else
    {
      System.out.println("String is not Palindrome");
    }
  }
}
