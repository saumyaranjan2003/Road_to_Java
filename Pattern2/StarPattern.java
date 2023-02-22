import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =1;
        while(i<=num)
        {
            int space =1;
            while(space<=num-i)
            {
                System.out.print(" ");
                space++;
            }
            int j =1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            j = 1;
            while(j<=i-1)
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
   *
  ***
 *****
*******
 */
