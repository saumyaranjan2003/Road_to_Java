import java.util.Scanner;;
public class whloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println(i);
            i=i+1;
        }
        sc.close();
    }
}
