public class break3 {
    public static void main(String[] args) {
        int num = 4;
        int i =1;
        while(i<=num){
            int j =1;
            while(j<=num)
            {
                System.out.print(j+" ");
                j++;
                if(j>i)
                {
                    break;
                }
            }
            System.out.println();
            i++;
        }
    }
}
