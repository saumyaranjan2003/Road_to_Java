/*You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X.
 Write a function to search this element in the given input array/list using 'Binary Search'. 
 Return the index of the element in the input array/list. If the element is not present in the array/list, 
then return -1. */
/*Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of X to be searched for in the array/list.
Output Format :
Print the index at which X is present for each test case, -1 otherwise. */
public class CodeBinarySearch{
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                start = mid + 1;

            } else {

                end = mid - 1;

            }
        }
        return -1;
    }

} 
