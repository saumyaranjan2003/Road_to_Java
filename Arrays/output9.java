public class output9 {
    public static void change(int input[]){
        input = new int[5];
        input[0] = 15;
        }
    
        public static void main(String args[]){
            int arr[] = new int[5];
            change(arr);
            System.out.println(arr[0]);
        }
}
/*arr” is a reference to the array, which contains address of the array. 
Hence we have passed this address to function “change”. 
So input and arr will refer to same array initially, but in the first statement in function “change” 
input if made to refer to new integer array.
 So input[0] = 15, 
will change the first element of this newly formed array and the array created in main will remain unchanged. */