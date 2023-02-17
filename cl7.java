public class cl7 {
    public static void main (String[] args) {
        int i=0;
        while(i<10)
        {
            i=i+1;
            System.out.print(i);
            i=i+1;
        }
     }
}

//The variable i =0. First time the loop executes,it increases the variable by 1 , print is and then again increases it by 1,
// making it 2. Now, second time, since the condition is true, the variable i would be incaresed to 1 , ie. i=3 and would be printed 
//and so on the loop will continue, till i=9. So the output would be all the odd numbers<10, which is : 13579
