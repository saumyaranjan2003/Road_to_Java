/*Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12 */
import java.util.Scanner;
public class binarytodecimal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println( decimalNumber);
        sc.close();
	}
}




