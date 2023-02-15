import java.util.Scanner;
public class multipleInput{
public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(str);
    int i = sc.nextInt();
    int j = sc.nextInt();
    int sum = i+j;
    System.out.println(sum);
    //input mismatch (it will show error)

    
}
}