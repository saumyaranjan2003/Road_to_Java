public class cl5 {
    public static void main(String args[])
    {
        int var1 = 5; 
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else 
            System.out.print(var2 + 1);
    }    
}
//Inside if condition, we are actually assigning 1 to var2 and then comparing 
//it with var1. So, after assignment, var2 becomes equal to 1 and then we are comparing it with var1 whose value is 5. 
//Both are not equal, hence else part will be executed. 
//So the output will be 2, as var2 was updated to value 1 in the if condition.
