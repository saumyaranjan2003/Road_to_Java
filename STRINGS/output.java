public class output {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcda";
        System.out.println(a.compareTo(b));
    }
}
/*The compareTo function returns the difference of length of strings when they are not equal.In case if the lengths are equal, 
then it returns the non-zero 
difference in ASCII values starting from 0th index to (n-1)st index and if all the indices of string are same, it returns 0.  */