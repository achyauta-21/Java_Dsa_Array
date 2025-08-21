// Linear Search = findex the index of element in a given array

import java.util.*;
public class linear_search {

    // function for linear search
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== key){
                System.out.println("the element is found at index "+ i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

         int key =10;  // the value you hace to search

         // calling the linear search function
         linearSearch(arr, key);

    }

}
