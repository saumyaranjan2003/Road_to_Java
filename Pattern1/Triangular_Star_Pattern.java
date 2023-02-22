import java.util.Scanner;
public class Triangular_Star_Pattern {
    public static void main(String[] args) {
        int num;
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		int i =1;
		while(i<=num)
		{
			int j =1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
		sc.close();
    }
}
