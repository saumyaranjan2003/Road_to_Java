import java.util.Scanner;
public class while6 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        boolean isprime=true;
        if(n%2==0)
            isprime=false;
        int i=3;
        while(isprime&&i<n)
        {
            isprime=!(n%i==0);
            i+=2;
        }
        if(isprime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Composite");
        }
        s.close();
    }

}

//The code fails for n=2. Otherwise the code runs fine for every other positive integer