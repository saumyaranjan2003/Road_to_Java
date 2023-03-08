public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 8;
        if (FibonacciNumber.checkMember(n)) {
            System.out.println(n + " is a Fibonacci number");
        } else {
            System.out.println(n + " is not a Fibonacci number");
        }
    }

    private static boolean checkMember(int n) {
        return false;
    }
}

