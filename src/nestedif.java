import java.util.Scanner;
public class nestedif {
    public static void main( String[] args) {
        System.out.print("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println(a + "is the lowest number");
            } else {
                System.out.println(c + "is the lowest");
            }
        } else {
            if (b < c) {
                System.out.println(b + "is the lowest");

            } else {
                System.out.println(c + "is the lowest");
            }

        }
    }
}
