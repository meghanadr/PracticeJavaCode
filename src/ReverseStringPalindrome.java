import static java.util.Collections.reverse;

public class ReverseStringPalindrome {
    public static void main(String[] args){
        String str= "malam";
        System.out.println(" Original String: " +str);
      StringBuilder stringBuilder=new StringBuilder(str);
     String reverseaa= String.valueOf(stringBuilder.reverse());
      System.out.println(" Reverse String: " +reverseaa);
      if(str == str) {
          System.out.println("its Palindrome");
      }
          else{
          System.out.println("its not Palindrome");
          }
      }

    }

