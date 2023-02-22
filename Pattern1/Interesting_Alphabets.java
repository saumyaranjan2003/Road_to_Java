import java.util.Scanner;

public class Interesting_Alphabets {
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
                System.out.print((char)('A'+num-i+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}

/*
 * 8
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
 */
//num-j+1