
//Total Salary
/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) 
and the grade (an uppercase character), 
and depending upon which the total salary is calculated as - totalSalary = basic + hra + da + allow – pf
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.

We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf. 
Now when we calculate each of the, it turns out to be:
hra =  20% of Rs. 4567 = Rs. 913.4
da = 50% od Rs. 4567 = Rs. 2283.5
pf = 11% of Rs. 4567 = Rs. 502.37

Since, the grade is 'B', we take allowance as Rs. 1500.
On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer.

*/
import java.util.Scanner;
public class while12{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int BS = sc.nextInt();
        String str = sc.next();
        char ch = str.charAt(0);
        int all;
        if(ch==65) //A ascii value 65
        {
            all=1700;
        }
        else if(ch==66) //B ascii value 66
        {
            all=1500;
        }
        else
        {
            all=1300;
        }
        double totalSalary = ((BS+(0.2*BS)+(0.50*BS)+all)-(0.11*BS));
        double p=Math.round(totalSalary);
        int h=(int)(p);
        System.out.println(h);
        sc.close();
    }

}
