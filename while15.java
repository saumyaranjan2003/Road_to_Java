
/*Find power of a number
* Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1
*/
import java.util.Scanner;
class while15 {
    public static void main(String[] args) {
    int base;
    int exponent;
    Scanner sc=new Scanner(System.in);
    base = sc.nextInt();
    exponent = sc.nextInt();
    long result = 1;
      while (exponent != 0) {
        result *= base;
        --exponent;
      }
      System.out.println(result);
      sc.close();
    }

  }