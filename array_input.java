/// write a program to take inpoout and output from the array 


import java.util.*;
public class array_input {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");

        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    int arr[]=  new int[n];

System.out.println("enter the elements of the array");
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
System.out.println("the input array is ");
for(int i=0;i<n;i++){
    System.out.println(arr[i]);
}
    }
}
