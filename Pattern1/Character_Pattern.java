import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        int i =1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j = 1;
            int t =i; //staring point
            while(j<=i)
            {
                System.out.print((char)('A'+t-1));
                t++;
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
BC
CDE
DEFG
EFGHI
 */