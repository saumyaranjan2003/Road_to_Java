public class output11 {
    public static int func(int a){
        a += 10;
        return a;
    }
    
    public static void main(String[] args) {
        int a = 5;
        func(a);
        System.out.println(a);
    }
    
}
