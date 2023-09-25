import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the  main string");
        String string1=scanner.nextLine();
        System.out.println("Give the substring");
        String string2= scanner.nextLine();
        char[] mainstring=string1.toCharArray();
        char[] substring=string2.toCharArray();
        for(int i=0;i<substring.length;i++){
            for(int j=0;j<mainstring.length;j++){
                if(substring[j]==mainstring[i]){
                    i++;
                    continue;
                }
            }


        }



    }//my nwe name is aravind ame
    //name
}