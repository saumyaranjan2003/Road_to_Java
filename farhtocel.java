import java.util.Scanner;

public class farhtocel {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int fr = s.nextInt();
        //int cel = (5/9)*(fr - 32);
        //1 way
        int cel = (5*(fr - 32)/9);
        //2nd way
        int cel1 = (int)((5.0/9)*(fr - 32));
        System.out.println(cel);
        
        System.out.println(cel1);
    }
    
}
