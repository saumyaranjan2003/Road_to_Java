/*Write a program to print all the factors of a number other than 1 and the number itself. */
import java.util.Scanner;
public class while14 {
    public static void main(String[] args) {
        int num;
        int i=2;
        Scanner sc =  new Scanner(System.in);
        num = sc.nextInt();
        while(num>i){
            if(num%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
