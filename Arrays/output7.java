public class output7 {
    public static void main(String args[]) {
        int arr[] = new int[5];
        arr[1] = 10;
        arr = new int[2];
        System.out.println(arr[0]);
    }
}
//arr initially refers to an array of size 5, line 2 assigns 10 to arr[1] but in line 3 arr is made to point to a new array of size 2.
//By default all elements of integer array are initialized to 0. Hence line 4 will print 0.