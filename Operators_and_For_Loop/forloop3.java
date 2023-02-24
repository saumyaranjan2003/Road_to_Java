//SUM OF N
import java.util.Scanner;
public class forloop3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<=num;i=i+1){
            sum=sum+i;
            System.out.println(sum);
        }
        sc.close();
    }
    
}
