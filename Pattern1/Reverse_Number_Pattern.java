import java.util.Scanner;

public class Reverse_Number_Pattern {
    public static void main(String[] args) {
        int i = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            while(j<=i)
            {
                System.out.print(num-j+1);
                j++;
            }
            i++;
            System.out.println();
        }
        sc.close(); 
    }
}
