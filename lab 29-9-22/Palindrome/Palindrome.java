public class Palindrome {

   public static boolean validPalindrome(String s) {

       StringBuffer buffer = new StringBuffer(s);
       buffer.reverse();
       String data = buffer.toString();

       if (s.equals(data)) {
           return true;
       }
       return false;
   }
   public static void main(String[] args) {
       String s1 = "level";
       String s2 = "cool";
       String s3 = "Madam";
       String s4 = "Now, sir, a war is won!";
       boolean b1 = validPalindrome(s1);
       boolean b2 = validPalindrome(s2);
       boolean b3 = validPalindrome(s3);
       boolean b4 = validPalindrome(s4);
       System.out.println("is " + s1 + " a palindrome? " + b1);
       System.out.println("is " + s2 + " a palindrome? " + b2);
       System.out.println("is " + s3 + " a palindrome? " + b3);
       System.out.println("is " + s4 + " a palindrome? " + b4);


   }
}