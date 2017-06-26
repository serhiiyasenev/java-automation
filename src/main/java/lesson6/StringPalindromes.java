package lesson6;


public class StringPalindromes {
    public static void main(String[] args) {

        String palindrome = "искать такси";
        char charArray[] = palindrome.replace(" ", "").toCharArray();
        boolean isPalindrome = true;
        for (int i=0; i<charArray.length/2; i++){
            isPalindrome = isPalindrome && (charArray[i] == charArray[charArray.length-i-1]); }

        if (isPalindrome) System.out.println
                ("This is the Palindrome");
        else
            System.out.println("Not palindrome");

        System.out.println("-------- " + "Variant 2" + " --------");

        String palindrome1 = "искать такси";
        char charArray1[] = palindrome1.replace(" ", "").toCharArray();
        for (int i = 0; i< charArray1.length-1; i++)
        {
           int n = (charArray1.length-1) - i;
           charArray1[n] = charArray1[i];
        }
       String palindrome2 = String.copyValueOf(charArray1);

        System.out.println(palindrome2);
        if (palindrome1.replace(" ", "").equalsIgnoreCase(palindrome2))
        {System.out.println("This is the Palindrome");}

    }
}