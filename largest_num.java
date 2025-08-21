// find the largest number in the array



import java.util.*;
public class largest_num {

    // function of the largest
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){
    if(largest<arr[i]){
        largest = arr[i];
    }
}
return largest;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of the array ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("largest value is "+ largest(arr));
    }
}
