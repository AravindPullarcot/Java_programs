import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        System.out.print("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = 0;
        System.out.println("Enter the operation");
        char n = scanner.next().charAt(0);
        switch (n) {


            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;

            default:  System.out.println("Invalid input");
                break;



        }
    }
}
