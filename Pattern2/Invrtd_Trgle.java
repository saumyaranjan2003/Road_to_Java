import java.util.Scanner;
public class Invrtd_Trgle {
    public static void main(String[] args) {
        int i =1;
        int num;
        Scanner sc = new Scanner(System.in);
        num  = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            while(j<= num - i + 1)
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
/*
 * 4
****
***
**
*
 */