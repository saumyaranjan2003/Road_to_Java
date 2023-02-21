import java.util.Scanner;
public class part1{
    public static void main(String[] args) {
        int i =1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j=1;
            while(j<=num)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}

