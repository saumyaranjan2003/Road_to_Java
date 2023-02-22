import java.util.Scanner;

public class Mirror_Img_Pttrn {
    public static void main(String[] args) {
        int num;
        int i =1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            while(j<=num-i)
            {
                //for space
                System.out.print(" ");
                j++;

            }
            j=1;
            while(j<=i)
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
  **
 ***
****
 */
