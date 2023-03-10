/*Number Star pattern 1

Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321 */
import java.util.Scanner;
public class numberstar {
	public static void main(String[] args) {
		int i, j, lines;
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		for (i = 1; i <= lines; i++) {
			for (j = lines; j >= 1; j--) {
				if (j != i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}
