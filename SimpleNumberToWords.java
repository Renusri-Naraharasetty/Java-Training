import java.util.Scanner;

public class SimpleNumberToWords{
    static String[] units = {
        "zero", "one", "two", "three", "four", "five", 
        "six", "seven", "eight", "nine", "ten", 
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
        "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", 
        "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int num) {
        if (num < 20) {
            return units[num];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
        } else if (num < 1000) {
            return units[num / 100] + " hundred" + 
                   (num % 100 != 0 ? " and " + convert(num % 100) : "");
        } else if (num < 10000) {
            return units[num / 1000] + " thousand" + 
                   (num % 1000 != 0 ? " " + convert(num % 1000) : "");
        } else {
            return "Number too big!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 9999): ");
        int number = scanner.nextInt();

        System.out.println("In words: " + convert(number));
        scanner.close();
    }
}
