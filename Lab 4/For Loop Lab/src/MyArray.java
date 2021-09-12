import java.util.Random;
import java.util.ArrayList;
public class MyArray {
    //feilds
    int[] array = new int[10]; //instance
    private int numReverse;

    //contructors
    //In the MyArray class write the code to initialize an integer array of 10 elements
//Use the Random number generator java.util.Random needs to be imported and initialize
// the elements of the array (I would stick to int numbers between 1 and 10)
//Random ran = new Random();
//int x = ran.nextInt(10) + 1;
    public boolean Random() {
        ArrayList<Integer> num = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            int upperbound = 10;
            int intRandom = rand.nextInt(10) + 1;
        }
    }

    //Part 2
//Write a method to print the array in reverse order use a for loop.
// There is no reverse like in Python, you need to initialize your counter variable to the end of the array
// and then decrement instead of increment until your counter is less than 0.
    public int reverseRandom() {
        for (int i = 10) {
            numReverse = array.get(i);
            System.out.println(numReverse);
        }

    }

    //Part 3
//Write a method to print out the second largest element in the array use a for loop
// and condition statements.  Use if statements and a other variables to find the second
// largest.  Think about it.
    public int secondLarge() {
        if (array[0] > array[1:10]){

        }
    }

    //Part 4
//Write a method to print the average of the array. (see if you can see a pattern....
// all of these  questions need a for loop.......maybe two later)
    public int average() {
        int newArray[] = {};
        for (int i = 0; i < array.length; i++) {
            return (i ^ (array.length)) / array.length;
    }

    //Part 5
//Write a method to search the array for an integer the user gives you. Search has a
// time complexity of O(n) for an unsorted array.
    public int sortArray() {
            return 0;
        }

    }
}
//Part 6
//Create a histogram according to your array data
//If you array looks like this 1,2,3,1,2,3,3,2,1,1


//Part 7
//Write a method to print the frequency of each integer in the array:
//e.g.: If you array has the elements 2,3,2,4,2,4,2,5,4,5
//You would print out:

//Hint  you don't have to sort the array, use a second array. Get as much
// as you can done on 2/15/2021 and turn in to the Dropbox on D2L by 11pm.

