import java.util.Scanner;
import java.util.Random;
public class guessnumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int randomvalue=random.nextInt(100);
        System.out.println(randomvalue);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number");
            System.out.println(i+"st chance enter your guess");
            int user_input = Integer.parseInt(scanner.nextLine());
            if (user_input == randomvalue) {
                System.out.println("Your guess is correct");
                break;
            } else {
                System.out.println("Wrong guess \n TRY AGAIN");
            }
        }
    }
}
