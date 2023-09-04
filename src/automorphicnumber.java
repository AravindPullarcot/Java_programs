import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= Integer.parseInt(scanner.nextLine());
        boolean isautomorphic=automorphic(num);
        if(isautomorphic==true)
            System.out.print("Number is automorphic");
        else
            System.out.print("Number is not automorphic");



    }
    public static boolean automorphic(int v){
        int square = v * v;
        while (v > 0) {
            if (v % 10 != square % 10){
                return false;
            }
            v = v / 10;
            square = square / 10;
        }
        return true;

        }
}
