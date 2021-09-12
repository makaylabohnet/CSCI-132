import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a String");
        String userString = myObj.nextLine();
        //myObj.close();

        String_API m = new String_API(userString);
        System.out.println("Press 1 to count the occurrence of a particular letter.");
        System.out.println("Press 2 to count the total words in your input sentence.");
        System.out.println("Press 3 to print string with no spaces.");
        System.out.println("Press 4 to input new string.");
        System.out.println("Press 5 to Exit");
        System.out.println("What do you want to do?");

        //Menu
        Scanner userChoice = new Scanner(System.in);
        int n = userChoice.nextInt();
        do {
                //System.out.println("Press 1 to count the occurrence of a particular letter.");
                if (n == 1) {
                    Scanner charChoice = new Scanner(System.in);
                    System.out.println(" Enter Character to Count: ");
                    String c = charChoice.nextLine();
                    int count = m.countChar(c);
                    System.out.println("The Letter" + c + "was found" + count + "times.");
                }
                //System.out.println("Press 2 to count the total words in your input sentence.");
                else if (n == 2) {
                    int words = m.countWords();
                    System.out.println(words);
                }
                //System.out.println("Press 3 to print string with no spaces.");
                else if (n == 3) {
                    System.out.println(m.noSpaces());


                }
                //System.out.println("Press 4 to input new string.");
                else if (n == 4) {
                    String string2 = myObj.nextLine();
                    m.reset(string2);


                }
                //System.out.println("Press 5 to Exit");
                else if (n == 5) {
                    System.out.println("All done!");
                }

                //System.out.println("What do you want to do?");
                userChoice.close();
        }while (n < 5);

    }
}