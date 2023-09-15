import java.util.Scanner;

public class stringoperationinarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n= Integer.parseInt(scanner.nextLine());
        int[] new_array = new int[n];
        int sum = 0;
        System.out.println("Enter the number elements");
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + new_array[i];
        }
        System.out.println(sum);

    }

}
