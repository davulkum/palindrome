import java.util.*;

public class Palindrome
{
   public static void main(String args[])
   {
          try{
      String userInput, reverseInput="";

      userInput = args[0];
      int length = userInput.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverseInput = reverseInput + userInput.charAt(i);

      if (userInput.equals(reverseInput))
         System.out.println("True");
      else
         System.out.println("False");
          }catch(Exception e){
                  System.out.println("Please enter any valid input");
          }
   }
}