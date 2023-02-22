import java.util.Scanner;

public class traingular_part2 {
    public static void main(String[] args) {
        int i =1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            int t =i; //starting num
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
