import java.util.Scanner;

public class clearspacesstring {
    public static void main(String[] args) {
        System.out.println("Give the strings");
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        char[] array=user_input.toCharArray();
        StringBuilder new_array=new StringBuilder();
       /* String user_input2=user_input.replace(" ","");
        System.out.println(user_input2);*/ //using predefined function
        for(int i=0;i<array.length;i++){
            if(array[i]!=' '){
                new_array.append(array[i]);
                //new_array[i]=array[i];

            }
        }
        System.out.println(new_array);

    }
}
