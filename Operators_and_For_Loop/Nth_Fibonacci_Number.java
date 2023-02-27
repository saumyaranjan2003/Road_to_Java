
/*Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1 */
import java.util.Scanner;

public class Nth_Fibonacci_Number {

    static int fib(int num) {
        if (num <= 1)
            return num;
        return fib(num - 1) + fib(num - 2);
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));
        sc.close();

    }

}
