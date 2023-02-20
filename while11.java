//Sum of even & odd
/*Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5. */
import java.util.Scanner;
public class while11 {
  public static void main(String[] args) {
    int n;
    int sumveven = 0;
    int sumodd = 0;
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    while(n != 0){
        int digits = n%10;
        if((digits%2)==0){
            sumveven=sumveven+digits;
            
        }
        else{
            sumodd=sumodd+digits;   
        }
        n/=10;
    }
    sc.close();
    System.out.println("Sum_of_Even_Digits "+sumveven);
    System.out.println("Sum_of_Odd_Digits "+sumodd);
  }  
}

