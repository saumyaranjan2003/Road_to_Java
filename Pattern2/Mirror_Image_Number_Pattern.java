import java.util.Scanner;

public class Mirror_Image_Number_Pattern {
    public static void main(String[] args) {
        int i =1;
        int num;
        Scanner sc =  new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j =1;
            while(j<=num-i)
            {
                System.out.print(" ");
                j++;
            }
            j =1;
            int t = i;
            while(j<=i)
            {
                System.out.print(t-i+1);
                t++;
                j++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
/*
 * 4
   1
  12
 123
1234
 */