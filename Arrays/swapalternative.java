
/* You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the elements of the resulting array in a single row separated by a single space.

Output for every test case will be printed in a separate line.

*/
import java.util.Scanner;

public class swapalternative {
    public static void swapAlternate(int[] input) {
        for (int i = 0; i < input.length; i += 2) {
            if (i == input.length - 1 && i % 2 == 0) {
                break;
            }
            int temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;

        }

    }
}
