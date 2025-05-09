import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {
        
        System.out.println("Enter the number ");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("Exiting..");
        int choice = 0;
        while(choice<=5)
        {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Sum is "+add());
                break;

                case 2:
                System.out.println("multiplication is "+multiplication());
                break;

                case 3:
                System.out.println("subtraction is "+subtraction());
                break;

                case 4:
                System.out.println("division is "+division());
                break;

                case 5:
                System.out.println("Exiting...... :)  ");
                break;
                
                default:
                	System.out.println("Enter a valid input");
                	break;
            }
        }
    
    }
    
    public static int add()
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = t.nextInt();
        int b = t.nextInt();
        return a + b;
    }

    public static int multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a * b;
    }

    public static int subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a - b;
    }

    public static int division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a / b;
    }

}