import java.util.Scanner;

public class binarysearch {
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
        sort.bubblesort(n,new_array);
        // System.out.println("The sorted array is");

        System.out.println("\nEnter the element to be searched");
        int searchElement = Integer.parseInt(scanner.nextLine());
        int high = n - 1;
        int low = 0;
        int middle = (high + low) / 2;
        binarysearchfunction(high,low,middle,searchElement,new_array);
    }

    public static void binarysearchfunction(int high,int low,int middle, int searchElement,int[] new_array){

        while (low <=high) {
            if (new_array[middle] < searchElement) {
                low = middle + 1;//element is in second half of array
            } else if (new_array[middle] == searchElement) {
                System.out.println("The element is found at " + middle + "th index");
                return;
            } else if(new_array[middle]>searchElement){
                high = middle - 1;//element is in lower half of array
            }else {
                System.out.println("The element is not in the array");
            }
            middle = (high + low) / 2;
        }
        System.out.println("The element is not found in the array");
    }
}





