public class cl16 {
    public static void main(String[] args) {
        int a = 10;
        if(a > 5) {
            int a = 100;
        }
        System.out.println(a);
    }
}

//Java does not allow us to declare a same variable twice. We can see that int a was declared in the main() 
//and then again it was declared  inside the if block, which is not permitted. So, the code will throw the error.