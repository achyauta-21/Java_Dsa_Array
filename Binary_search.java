//   write  a program  to implement the  BIINARY SEARCH


import java.util.*;
public class Binary_search {

//  function for binary search

public static int binarySearch(int arr[], int key){
int start = 0,end = arr.length-1;

while(start<=end){
    int mid = (start + end )/2;

    // comparisons
    if(arr[mid]== key){
        return mid;
    }
    if(arr[mid]<key){
        start = mid+1;
    }
    else{
        end = mid+1;
    }
}
return -1;
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
int key = 10;
        //  array declaration
        int arr[] = new int[n];

        //  elements of the array

        System.out.println("enter the elements of the array ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the element is found at index "+binarySearch(arr,key));

    }
    
}
