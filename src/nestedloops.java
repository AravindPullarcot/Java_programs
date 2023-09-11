import java.util.Scanner;

public class nestedloops {

    //    1
//    2 3
    // 4 5 6
//    * * *
//    * * * *
    public static void main(String[] args) {


        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(count + ",");
                count++;
            }
        }
        System.out.println("----------------------");

        for (int i = 1; i <= n; i++) {//rows
            //System.out.print("");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");


            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


/*###*
##**
#***
*****/

//  *
// *  *
//*  *  *