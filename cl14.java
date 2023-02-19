public class cl14 {
    public static void main(String[] args) {
        int a = 10;
        if(a > 5) {
            int b = 10;
        }
        System.out.println(b);
    }
}
//Since int b is declared within the if block, it will not be accessible beyond it.
// We can see that the statement to print b is written outside the if block, hence it would generate error.