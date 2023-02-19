import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d =2;
        while(d <=num-1){
            if(num%2==0){
                System.out.println("Not Prime");
                return;
            }
            d= d+1;
        }
        System.out.println("prime");
        //sc.close();
    } 
}
