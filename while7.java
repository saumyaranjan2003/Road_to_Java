public class while7 {
    public static void main(String[] args) {
        int i=10;
    while((i=i-1)>0)
    {
        System.out.print(i);
        if(i%5==0)
            return;
    }
    }
}
/*The code executes for i=9,8,7,6,5 and prints 98765.
At i=5 the if statement is executed and the code terminates. */
