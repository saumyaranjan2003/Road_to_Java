import java.util.Scanner;
public class break2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean divided;
        for(int d = 2; d<num;d++)
        {
            if(num%d==0){
                divided = true;
                break;
            }
        }
        if(divided){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        int d = 2;
        divided  = false;
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
