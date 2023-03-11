import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        // take input from user to take the size of array
        System.out.println("Enter The Size of array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the value of array");
        // take user value for every index of size
        for (int i = 0; i < size; i++) {
            System.out.print("Index value of " + i + " is ");
            input[i] = sc.nextInt();
        }
        // print all value that have enterd by user
        for (int i = 0; i <= size; i++) {

            System.out.print(input[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}