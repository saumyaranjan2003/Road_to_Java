public class frhtoceltable {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int step = 10;

        for (int i = start; i <= end; i += step) {
            int C = ((i - 32) * 5) / 9;
            System.out.println(i + "\t" + C);
        }
    }
}