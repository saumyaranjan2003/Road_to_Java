import java.util.Scanner;
public class Sum_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, num;
    	for(i=1; i<=n; i++)
    	{
        	num=1;
        	int sum=0;
        	for(j=1; j<=i; j++)
        	{
            	System.out.print(num+ "");
                sum=sum+num;
            	if (num<i) 
                {
                	System.out.print("+");
                }
                
            	num++;
        	}
            System.out.print("="+sum);
            System.out.println();
        }
        
	}
}

/*4
1=1
1+2=3
1+2+3=6
1+2+3+4=10 */