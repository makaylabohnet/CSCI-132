import java.util.Scanner;
public class GCD {
    private int num1;
    private int num2;

    public static int findGCD(int num1, int num2){
        if( num2 != 0 )
        {
            return findGCD(num2 , num1 % num2 );

        }
        else
            return num1;



    }
    public static void main(String[] args){
        Scanner firstInput = new Scanner(System.in);
        System.out.println("Input Bigger Number:");
        int num1 = firstInput.nextInt();

        Scanner secondInput = new Scanner(System.in);
        System.out.println("Input Smaller Number:");
        int num2 = secondInput.nextInt();

        int gcd =  findGCD(num1, num2);
        System.out.println( "Finding GCD for "+ num2 + " and " + num1);
        System.out.println( num1 + "/" + num2 + " = " + (num1/num2));
        System.out.println("Remainder "+(num1%num2));
        int remainder = num1%num2;

        if (remainder != 0 ){
            System.out.println("Remainder is not yet zero, so we will now divide "+ num2 + "/"+ remainder);
            System.out.println( num2 + "/" + remainder + " = " + (num2/remainder));
            System.out.println("Remainder "+(num2%remainder));
            int remainder2 = num2%remainder;
            System.out.println("Remainder is not yet zero, so we will now divide "+ remainder + "/"+ remainder2);
            System.out.println( remainder + "/" + remainder2 + " = " + (remainder/remainder2));
            System.out.println("Remainder "+(remainder%remainder2));
        }

            System.out.printf("G.C.D of %d and %d is %d.", num1, num2, gcd);


        }

    }
