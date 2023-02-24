public class prtc2 {
    public static void main (String[] args) {
        int a=10,b=20;
        System.out.println(a+++--b);//line 1
        System.out.println(a--+++b);//line 2
        System.out.println(a++-++b);//line 3
        System.out.println(a+++++b);//line 4
    }
}
/*As + operator and ++ operator have equal precedence.
Similarly - and -- have equal precedence.
So in line 2 +++b and in line 4 +++b gives an error.
To solve this error we can use +(++b). */