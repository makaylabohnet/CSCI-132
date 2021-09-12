import java.util.Scanner;



public class Palindrome {
    private String m;

    public static boolean isPalindrome(String m){
        if (m.length() == 1 || m.length() == 0)
            return true;
        if (m.charAt(0) == m.charAt(m.length()-1)){
            return isPalindrome(m.substring(1, m.length()-1));
        }
        return false;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Word");
        String userString =  myObj.nextLine();

        if (isPalindrome(userString)) {
            System.out.println(userString + " is a palindrome ");
        }
        else
            System.out.println(userString + " is not a palindrome");
    }

}

