import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        System.out.println("Input your strings");
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        char[] array = user_input.toCharArray();
        char[] reversed = new char[20];
        System.out.println(array);
        int length = 0;
        int j = 0;
        boolean ispalindrome = true;
        for (int i = array.length - 1; i >= 0; i--, j++) {//j is for reversed string to start input of elements in the 1st position
            reversed[j] = array[i];

        }
        System.out.println("Reversed string: ");
        for (int k = 0; k < j; k++) {
            System.out.print(reversed[k]);
        }
        for (int k = 0; k < array.length; k++) {
            if (reversed[k] != array[k]) {
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome) {
            System.out.println("The strings is palindrome");
        } else {
            System.out.println("The strings are different");
        }
    }

    //System.out.println(reversed);
       /* while(user_input.charAt(length)!='\0'){
            length++;
        }
        for(int i=0;user_input.charAt(i)!='\0';i++){
            length++;

        }
        System.out.println(length);*/

}





