/*Multiplication Table*/

import java.util.Scanner;
public class while10 {
    public static void main(String[] args) {
        int i = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        while(i <= 10)
        {
            System.out.println(n*i);
            i=i+1;

        }
        sc.close();
    }
}
