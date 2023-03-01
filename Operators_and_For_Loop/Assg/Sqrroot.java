/*Given a number N, find its square root. 
You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4. 
*/

import java.util.Scanner;
public class Sqrroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int squareRoot = (int) Math.sqrt(N);
        System.out.println(squareRoot);
    }
}

