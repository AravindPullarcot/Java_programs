import java.util.Scanner;
public class fibonacci_series
{
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = Integer.parseInt(scanner.nextLine());
        //System.out.println(fibonacci(user_input));
        System.out.print("0,1,1");
        fibonacci2(user_input);
    }

    //To print the series
    private static void fibonacci2(int userInput)
    {
        int first=1;
        int second=1;
        int third =0;
        for(int i=0; i<=userInput;i++)
        {
            third=first+second;
            System.out.print(third+",");
            first=second;
            second=third;
        }
    }
// to print the number
    private static long fibonacci(int userInput)
    {
        if(userInput<=1)
            return userInput;
        return (fibonacci(userInput - 1) + fibonacci(userInput - 2));
    }
}
