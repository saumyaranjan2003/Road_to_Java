import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = 2;
        boolean divided = false;
        while (d<num){
            if(num%d == 0) {
                divided = true;
                break;
            }
            d=d+1;
        }
        if(divided){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        sc.close();
    }
}
