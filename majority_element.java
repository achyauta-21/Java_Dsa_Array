
import java.util.Arrays;

// 169. Majority Element
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2









public class majority_element {


// method to calulate the majority element
public static int majority(int nums[]){
    Arrays.sort(nums);  // sort the array
    int count =1;        // take a count variable to count the number of occurrence.
    int ans = nums[0];   // initially the vale at index 0 will be the ans.

    for(int i = 1;i<nums.length;i++){
        if(nums[i] == nums[i-1]){
            count++;
        }
        else{
            count = 1;
            ans = nums[i];
        }
        if(count > nums.length/2){
            return ans;
        }
    }
    return ans;
}


    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
       System.out.println( majority(nums));
    }
}
