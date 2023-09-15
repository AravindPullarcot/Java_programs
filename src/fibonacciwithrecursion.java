import java.util.Scanner;

public class fibonacciwithrecursion {
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner scanner = new Scanner(System.in);
        int user_input = Integer.parseInt(scanner.nextLine());
       // System.out.println(user_input);
        for (int i=0;i<=user_input;i++){
            System.out.print(fibonnaci1(i)+",");
        }

    }

    public static int fibonnaci1(int user_input) {
        if (user_input<=1){
            return 1;
        }
        /*if (user_input == 1) {
            return 1;
        }else if (user_input==0){
            return 0;
        }*/
        else{
            return fibonnaci1(user_input-1)+fibonnaci1(user_input-2);

        }
    }
}
