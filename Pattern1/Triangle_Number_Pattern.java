import java.util.Scanner;
public class Triangle_Number_Pattern {
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
				System.out.print(i);
				j++;
			}
			i++;
			System.out.println();
		}
		sc.close();
    }
}
