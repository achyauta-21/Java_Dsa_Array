//  print subarrays 
// subarrays is a continuous part of array = n(n+1)/2
import java.util.*;
public class subarrays {

// function to print subarrays

public static void subarrays(int arr[]){
    for(int i=0;i<arr.length;i++){
        int start = i;
        for(int j=i;j<arr.length;j++){
            int end = j;

            for(int k = start;k<=end;k++ ){
                System.out.println(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
subarrays(arr);

    }
}
