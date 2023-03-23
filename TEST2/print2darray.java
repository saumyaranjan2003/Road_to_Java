public class print2darray {
    public static void print2DArray(int input[][]) {
        int rc = input.length;
        int cc = input[0].length;
        for (int i = 0; i < rc; i++) {
            int n = rc - i;
            while (n != 0) {
                for (int j = 0; j < cc; j++) {
                    System.out.print(input[i][j] + " ");
                }
                n--;
                System.out.println("");
            }
        }
    }
}
