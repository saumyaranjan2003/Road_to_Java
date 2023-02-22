import java.util.Scanner;

public class Alpha_Pattern {
    public static void main(String[] args) {
        int i =1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j = 1;
            while(j<=i)
            {
                System.out.print((char)('A'+i-1));
                j++;
            }
            System.out.println();
            i++;

        }
        sc.close();
        
    }
}
/*
 * 5
A
BB
CCC
DDDD
EEEEE
*/