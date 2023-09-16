import java.util.Scanner;

public class stringsdemo {
    public static void main(String[] args) {
        //System.out.println("Give the strings");
        Scanner scanner = new Scanner(System.in);
        Integer user_input=scanner.nextInt();
        //System.out.println(user_input.compareTo(7));
        System.out.println("Enter the strings");
        //String user_input1=scanner.nextLine();
        //String user_input2=scanner.nextLine();
        String user_input1="aravind";
        String user_input2="aravind";
        StringBuffer sb=new StringBuffer(user_input2);

        System.out.println(user_input1.equals(user_input2));
        System.out.println(user_input1.equalsIgnoreCase(user_input2));
    }
}
