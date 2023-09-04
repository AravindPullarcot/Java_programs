import java.util.Scanner;

public class petersonnumber {
    public static int user_input;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        user_input = Integer.parseInt(scanner.nextLine());
        int check=peterson(user_input);
        if(check == user_input)
            System.out.println("Number is peterson");
        else
            System.out.println("Number is not peterson");
    }

    public static int peterson(int num) {
        int sum=0;
        while (num != 0) {
            int n = num % 10;
            sum = sum + (n * n * n);
            num=num/10;
        }
        System.out.println(sum);
        return sum;

    }

}