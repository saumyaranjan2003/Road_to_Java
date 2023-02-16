import java.util.Scanner;

public class operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(9/5);
        System.out.println(9.0/5);

        System.out.println("Arthmatic Optr");
        //Add
        System.out.println("Add "+9+5);
        //Sub
        System.out.println(9-5);
        //Multiply
        System.out.println("Multi " +9*5);
        //Divd
        System.out.println("Divd " + 9/5);
        //Modulus
        System.out.println("Modulus "+ 9%5);
        System.out.println();
        System.out.println();

        System.out.println("Relational Optr");
        int i = sc.nextInt();
        int j = sc.nextInt();

        boolean isEq = (i==j);
        boolean noteq = (i!=j);
        boolean issmal = (i<j);
        boolean issmaleq = (i<=j);
        boolean isgtr = (i>j);
        boolean isgtreq = (i>=j);
        System.out.println(isEq);
        System.out.println(noteq);
        System.out.println(issmal);
        System.out.println(issmaleq);
        System.out.println(isgtr);
        System.out.println(isgtreq);


        System.out.println("Logical Optr");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean islargrest = (a>=b) && (a>=c);
       System.out.println(islargrest);
        System.out.println(((a>=b) || (a>=c)));
        System.err.println(!(a>=b));



    }
    
}
