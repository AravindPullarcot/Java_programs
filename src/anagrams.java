import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        System.out.println("Give the strings");
        Scanner scanner = new Scanner(System.in);
        String user_input1 = scanner.nextLine();
        String user_input2 = scanner.nextLine();

        if (checkcondition(user_input1, user_input2)) {
            System.out.print("They are anagrams");
        } else {
            System.out.println("They are not");
        }
    }

    private static boolean checkcondition(String user_input1, String user_input2) {
        char[] array1 = user_input1.toCharArray();
        char[] array2 = user_input2.toCharArray();
        if (array1.length!= array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }

        return true;
    }
}

