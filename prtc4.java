import java.util.Scanner;
public class prtc4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int average = (m1 + m2 + m2)/3;
		System.out.println(c);
		System.out.println(average);
	}

}
