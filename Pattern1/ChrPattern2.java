import java.util.Scanner;
public class ChrPattern2 {
    public static void main(String[] args) {
        int i = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            int j = 1;
            char t = (char)('A' + i -1);
            while(j<=num)
            {
                System.out.print(t);
                t = (char)(t+1);
                j++;
            }
            System.out.println();
            i++;

        }
        sc.close();
    }
}
/*5
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI */