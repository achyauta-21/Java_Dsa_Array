 // kadanes algo to find the max subarray sum



public class kadanes_algo {
    
public static void kadanes(int arr[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0;i<arr.length;i++){
        cs= cs+arr[i];
        // if(cs>ms){
        //     ms = cs;
        // }

        // OR

if(cs<ms){
    cs = 0;
}

        ms= Math.max(cs, ms);
    }
    System.out.println("the max sum is "+ ms);
}


    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,78};
kadanes(arr);
    }
}
