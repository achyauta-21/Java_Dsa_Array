//  wap to print the maximum sum of the array

import java.util.*;
public class max_subarray_sum {

public static void maxsum (int arr[]){

int maxSum= Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){
    int start = i;
    for(int j=i;j<arr.length;j++){
        int end= j;
        int currSum= 0;
        for(int k=start;k<=end;k++){
            currSum += arr[k];
        }
        System.out.println(currSum);
        if(maxSum < currSum){
            maxSum=  currSum;
        }
    }
}
System.out.println("max Sum "+ maxSum);
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("enter the size of the array");
         int n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("enter the elements of the array");
         for(int i = 0;i<arr.length;i++){
            arr[i] =sc.nextInt();
         }
maxsum(arr);
    }
}
