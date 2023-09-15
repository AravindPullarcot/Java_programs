import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = Integer.parseInt(scanner.nextLine());
        int length = 0;
        while (user_input!=0){
            user_input=user_input/10;
            length++;
        }
        //System.out.println(length);
        System.out.println(length);
        int user_input2 = user_input;
        int result = 0;
        while (user_input != 0) {
            int n = user_input % 10;
            result = (int) Math.pow(n, length);
            sum = sum + result;
            user_input = (user_input / 10);
        }
        System.out.println(sum);
        System.out.print(user_input);
        if (sum == user_input2)
            System.out.print("the number is armstrong");
        else
            System.out.print("The number is not armstrong");


    }
}

    /*private static int countDigits(int userInput) {
        int count=0;
        while(userInput!=0){
            userInput=userInput/10;
            count++;
        }
        return count;
    }
}
*/
// 153 => 153 % 10 = 3
// 153 / 10
