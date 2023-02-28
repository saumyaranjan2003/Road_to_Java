public class break8 {
    public static void main(String[] args) {
        /*for(int i=1;;i++)
    {   if(i==5)
            break;
        System.out.print(i);
    }*/
    /*for(int i=1;;i++)
    {   if(i<5)
            System.out.print(i);
        else 
            break;
    }*/
    for(int i=1;;i++)
    {   if(i>5)
        {
            break;
            System.out.print("break statement reached");
        }
        System.out.print(i);
    }
    }
}
/*3 no is error 
 * the statement after break is never executed hence it gives an error.
 * 
 * code fix 
 *  for(int i=1;;i++)
    {   if(i>5)
        {
            break;
        }
        System.out.print(i);
    }
 */