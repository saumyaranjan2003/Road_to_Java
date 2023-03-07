Q)What is the return type of a method that does not returns any value ?
ANS :-The functions which doesn't return any value, their return type is "void


Q)Let’s say the problem is - You will be given two numbers(both integers) and you need to return their sum.
For this problem, what should be the return type of function -
ANS:-We need to return the sum of two integers, which is again an integer. So the sum that we want to return is of type "int". Hence return type should be "int" for this function.


Q)What should be return type of the following function:
public static ____ division(int a,int b)
{
    float c=a/b;
    return c;
}

ANS:-As we need to return a decimal value we can use float or double.


Q) Would the following code generate an error:
public static double add(int a,int b)
{
    float c=a+b;
    return c;
}
public static void main (String[] args) {
    System.out.print(add(10,3));
}


ANS :-There is no problem in converting float to double