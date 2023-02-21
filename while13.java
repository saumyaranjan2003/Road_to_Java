/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.
3 integers - S, E and W respectively  
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. 
The Fahrenheit value and its corresponding Celsius value should be separate by single space.
Start calculating the Celsius values for each Fahrenheit Value which starts from 20.
So starting from 20, we need to compute its corresponding Celsius value which computes to -6. 
We print this information as <Fahrenheit Value> <a single space> <Celsius Value> on each line. 
Now add 13 to Fahrenheit Value at each step until you reach 119 in this case. 
You may or may not exactly land on the end value depending on the steps you are taking.
*/
import java.util.Scanner;
public class while13 {
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int S=s.nextInt();
    int E=s.nextInt();
    int W=s.nextInt();
	int fah;
        while(S<=E)
        {
            fah=((5*(S-32))/9);
             System.out.println(S+" "+fah);
            S+=W;
        }
        s.close();
	}

}
