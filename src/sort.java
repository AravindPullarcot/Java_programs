import java.util.Scanner;
public class sort {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = Integer.parseInt(scanner.nextLine());
        int[] new_array = new int[n];
        System.out.println("Enter the number elements");
        boolean found;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            new_array[i] = Integer.parseInt(scanner.nextLine());
        }
        bubblesort(n,new_array);
    }

    public static void bubblesort(int n,int[] new_array){
        int temp=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <(n - i)-1; j++) {
                if (new_array[j] > new_array[j + 1]) {
                  swap(new_array,j);
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(new_array[i] + " ");
        }
    }
    public static void swap(int [] new_array,int j){
        int temp=0;
        temp = new_array[j];
        new_array[j] = new_array[j + 1];
        new_array[j + 1] = temp;

    }
}
