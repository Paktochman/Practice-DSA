import java.util.Scanner;

public class testing {
    public static boolean comp(int[] arr){

    
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        
        }
        return true;


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i = 0; i < size; i++) {
            arr [i] = sc.nextInt();
           // System.out.println(arr[i]);
        }
        System.out.println("The array is strictly increasing: " + comp(arr));
        
        
    }


}