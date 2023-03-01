package AssignmentForLoop;
import java.util.Scanner;
public class TermsofAP {
    public static void main(String[] args) {
        int x,num=1,sum,i=1;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		while(num<=x && num<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				num=num+1;
			}
			i=i+1;
		}sc.close();
    }
}
