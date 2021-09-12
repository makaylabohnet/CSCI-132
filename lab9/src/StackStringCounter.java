import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class StackStringCounter {


    String s;
    Scanner console = new Scanner(System.in);
    char array[] = new char[20];
    int index = 0;
    int counts = 0;

    public void beginFun() {
        String input = console.nextLine();
        System.out.println("Give a String ");
        do {
//            String input = console.nextLine();
//            System.out.println("Give a String ");

            for (int i = array.length; i > 0; i--) {
                if (array[i] == 1) {
                    counts++;
                    pop();
                }
                if(counts/2 == 0){
                    System.out.println("Accept String" + input);
                }
                else{
                    System.out.println("Reject String" + input);
                }

            }

        } while (input.equals("-1"));
    }

    private void pop() {
            int x = array[index--];
        }


    private void push() {
            int x = array[++index];
    }

    public void runMethod(){

    }

    public static void main(String[] args) {
        new StackStringCounter().beginFun();



    }


}