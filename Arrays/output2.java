public class output2 {
    public static void main(String[] args) {
        char chArray[] = new char[15];
System.out.println(chArray[15]);
    }
}
/*For an array of size n, indexes of the array range from 0 to (n - 1). So here for array of size 15, 
valid indices are from 0 to 14. This chArray[15] is trying to access an 
invalid index which gives ArrayIndexOutOfBoundsException. */