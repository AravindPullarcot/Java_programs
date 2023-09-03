
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        Random rand= new Random();
        System.out.print(rand.nextInt(5));
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input=Integer.parseInt(scanner.nextLine());
        System.out.println(user_input);
        for(int i=1;i<user_input;i++)
        {
            if(user_input%i==0)
            {
                count++;
            }

        }
        if (count == 1) {

            System.out.println("The number you have entered "+user_input+ " is prime");
        } else {
            System.out.println("The number you have entered "+user_input+" is not prime");
        }
        System.out.println(count);
    }

}
class student{

}


