
/*Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So take the answer as long.
Input format :

Integer N

Output format :

Corresponding Binary number (long)

Sample Input 1 :

12

Sample Output 1 :

1100

Sample Input 2 :

7

Sample Output 2 :

111
*/
import java.util.Scanner;

public class dectobin {
    public void Binary(int num) {
        if (num == 0) {
            System.out.print("0");
            return;
        }
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        dectobin obj = new dectobin();
        int n = sc.nextInt();
        obj.Binary(n);

        sc.close();
    }
}
