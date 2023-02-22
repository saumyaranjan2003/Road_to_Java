import java.util.Scanner;

public class Isosceles_Triangle {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i=1;
        while(i<=num)
        {
            int space = 1;
            while(space<=num-i)
            {
              System.out.print(" ");
              space++;  
            }
            int j =1;
            int p =1;
            while(j<=i)
            {
                System.out.print(p);
                p++;
                j++;
            }
            p = i-1;
            j = 1;
            while(j<=i-1)
            {
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;  
        }
        sc.close();      
    }
}
