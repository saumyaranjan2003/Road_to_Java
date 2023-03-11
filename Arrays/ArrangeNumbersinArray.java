/*You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
Note:
You need not print the array. You only need to populate it. */
public class ArrangeNumbersinArray {
    public static void arrange(int[] arr, int n) {
        int val=1, nVal=0;
     if(n!=0){
            if(n%2==0)
            nVal=n;
            else
            nVal=n-1;
         for(int j=0;j<=(n-1)/2;j++){
               arr[j]=val;
                val+=2;            
            }     
        for(int j=(((n-1)/2)+1);j<n;j++){
            arr[j]=nVal;
            nVal-=2;
        }
     }
    }
}
