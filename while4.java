import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        int n;
        int sum =0;
        int i=1; //the no which is going to be add
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i<=n){
            sum = sum+i;
            i+=1;
        }
        System.out.println(sum);

    }
}
