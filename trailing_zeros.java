public class trailing_zeros {

    public static int countTrailingZeros(int n) {
    	int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7777; // You can change this value
        System.out.println("Number of trailing zeros in " + n + "! is: " + countTrailingZeros(n));
    }
}
