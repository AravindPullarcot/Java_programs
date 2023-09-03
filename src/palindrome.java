import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1) to check if the number is a pallindrome or 2) to check if the string is a palindrome");
        int n1= Integer.parseInt(scanner.nextLine());
        switch (n1) {
            case 1:

                System.out.println("Enter the number");
                int user_input = Integer.parseInt(scanner.nextLine());
                int user_input2 = user_input;
                int reverse = 0;
                while (user_input2 != 0) {
                    int n = user_input2 % 10;
                    user_input2 = user_input2 / 10;
                    reverse = (reverse * 10) + n;

                }
                System.out.print(reverse + "");
                if (reverse == user_input)
                    System.out.print("The number is pallindrome");
                else
                    System.out.print("The number is not pallindrome");
                break;

            case 2:
                System.out.print("Enter the string");
                String usr = scanner.nextLine();
                String reversed="";
                int l=usr.length();
                char[] ar = new char[l];
                for (int i=l-1;i>=0;i--){
                    ar[l-1-i]=usr.charAt(i);
                }
                System.out.print(ar);

        }


    }
}


        //1234 => 4
// 123 => 43
// 12 => 432
