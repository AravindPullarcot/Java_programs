import java.util.Scanner;

public class sumofprime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= user_input; i++) {
            if (user_input % i == 0) {
                //count++;
            }
        }

    }
}
