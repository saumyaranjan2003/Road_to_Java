public class output8 {
    public static void func(int a) {
        int b = a;
        b = b + 10;
    }

    public static void main(String[] args) {
        int a = 10;
        func(a);
        System.out.println(a);
    }
}
/*Code will generate error as we are trying to print value of variable b in main and there 
isn't any variable b created or accessible in main. Variable b in the code is created inside 
function _func_ and is local to this function and not accessible outside it */