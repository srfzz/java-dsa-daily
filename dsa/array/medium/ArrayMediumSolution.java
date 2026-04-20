package dsa.array.medium;

import java.util.Arrays;

public class ArrayMediumSolution {
public String sumEqualsTotarget(int[] arr,int target){
    Arrays.sort(arr);
    int start=0,end=arr.length-1;
    while(start < end){
        int sum=arr[start]+arr[end];
        if(sum ==target){
            return "yes"+arr[start]+"-"+arr[end];
        }
        if(sum < target){
            start++;
        }else
        {
            end--;
        }
    }
    return "no";
}

   
    /*Two Sum : Check if a pair with given sum exists in Array */
    /*1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO. */


    
    /*
    Sort an array of 0's 1's and 2's
    Input: nums = [1, 0, 2, 1, 0]
    Output: [0, 0, 1, 1, 2]
    Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

    */

    public void sortArrayInAscWithoutCreatingNewArray(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;

            }
            if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
