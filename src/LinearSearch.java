import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = Integer.parseInt(scanner.nextLine());
        int[] new_array = new int[n];
        System.out.println("Enter the number elements");
        boolean found;
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter the number to be searched");
        int searchElement = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            if (new_array[i] == searchElement) {
                System.out.println(searchElement + " is found at " + new_array[i] + "rd location");
                return;
            }
        }
        System.out.println("The element is not found");
    }

}
