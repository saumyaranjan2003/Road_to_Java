//Sum of Even Numbers till N Given a number N, print sum of all even numbers from 1 to N.
import java.util.Scanner;
public class whileloop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int num = sc.nextInt();
        while(i <= num)
        {
            if((i%2)==0)
            {
                System.out.println(i +" is Even");
                sum=sum+i;
                
            }
            i=i+1;
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
    
}
