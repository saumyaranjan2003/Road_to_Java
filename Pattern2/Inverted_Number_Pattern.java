import java.util.Scanner;
public class Inverted_Number_Pattern {
    public static void main(String[] args) {
        int i =1;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(i<=num){
			int j =1;
			while(j<=num-i+1){
				System.out.print(num-i+1);
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
4444
333
22
1
 */