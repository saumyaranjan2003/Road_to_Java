import java.util.Scanner;

//largest of 3
public class cl9 {
    public static void main(String args[]) {
        int num1,num2,num3;
        System.out.println("Enter 3 NUM");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUM1");
        num1 = sc.nextInt();
        System.out.println("Enter NUM2");
        num2 = sc.nextInt();
        System.out.println("Enter NUM3");
        num3 = sc.nextInt();

        //if a is largest
        if(num1>=num2 && num1>=num3){
            System.out.println("Num1 IS Greater ");
        }
        //if a is not largrest so we will check for b and c
        //if b is largest
        else{
            if(num2>=num3 && num2>=num1){
                System.out.println("NUM2 IS Greater");
            }
            //if b is not greater
            //if c is greater
            else{
                System.out.println("NUM3 IS GREATER");

            }
        }
        
        sc.close();

        



        
    }
}
