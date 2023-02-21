import java.util.Scanner;
public class square4 {
    public static void main(String[] args) {
        int i=1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j = 1;
            while(j<=num)
            {
                System.out.print(num-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
