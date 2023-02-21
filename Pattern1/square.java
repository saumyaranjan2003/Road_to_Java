import java.util.Scanner;
public class square {
	public static void main(String[] args) {
		int i = 1;
		int userinput;
		Scanner sc = new Scanner(System.in);
		userinput = sc.nextInt();
		while(i<=userinput)
		{
			int j =1;
			while(j<=userinput)
			{
				System.out.print(userinput); //1st row is printed
				j++;
			}
			System.out.println(); //then 2nd row will be printed
			i++;
		}
		sc.close();
		
	}
}

