
/*Yet another Pattern
Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?
Example : Pattern for N = 4

****
***     
**
*
Input Format:
The first line of input contains an integer ‘T,’ denoting the number of test cases. The test cases follow.

The first line of each test case contains a single integer ‘N’.
Output Format:
For each test case, print 'N' strings corresponding to every row in a new line (row elements not separated by space)

Print the output of each test case in a separate line.
Note:
You are not required to print the expected output; it has already been taken care of. Just implement the function.
Constraints:
1 <= T <= 50
1 <= N <= 300

*/
import java.util.*;

public class anotherpattern {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            ninjaPuzzle(n);
        }
    }

    public static void ninjaPuzzle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
