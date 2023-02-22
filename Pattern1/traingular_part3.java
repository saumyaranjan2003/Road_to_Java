import java.util.Scanner;

public class traingular_part3 {
    public static void main(String[] args) {
        int i=1;
        int t = 1; //starting Num
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            while(j<=i)
            {
                System.out.print(t);
                t++;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
