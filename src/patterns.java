public class patterns {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();

        }
        System.out.println("-----");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("x");
            }
            System.out.println("");

        }
        System.out.println("-----");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println("");

        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("X");
            }
            System.out.println("");


        }
        System.out.println("-------------");
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;

            }
        }
        System.out.println("-------------");
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){//for spaces
                System.out.print(" ");
            }
            for(int k=1;k<=4-i;k++){
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println("-------------");
            for (int i = 0; i <= 4; i++) {
                for (int j = 4; j < i; j++) {
                    System.out.print("");
                }
                System.out.print("X");
            }

        }
    }
