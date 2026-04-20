package dsa.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

            }else 
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
        /* Majority Element-I */

         /* 
    Example 1:
    Input:
    nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
    Output:
    7  
    Explanation:
    The number 7 appears 5 times in the 9-sized array, making it the most frequent element.
    
    */

    public void majorityElement(int[] nums){
        int n=nums.length;
        System.out.println(n+"-"+n/2);
        Map<Integer,Integer> mNums=new HashMap<>();
        for(int num:nums){
            mNums.put(num,mNums.getOrDefault(num, 0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:mNums.entrySet())
        {
            System.out.println(entry.getKey() +"-"+entry.getValue());
            if(entry.getValue() > n/2 ){
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println(-1);
    }
    public void majorityElementOptimal(int[] nums){
        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count == 0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }else
            {
                count--;
            }
        }

    System.out.println("majority Element is :"+candidate);
    }


    /*Kadane's Algorithm : Maximum Subarray Sum in an Array */
    public void maximumSubArraySum(int[] nums){
        int maxvalue=Integer.MIN_VALUE;
        int currSum=0;
        for(int num:nums){
            currSum+=num;
            if(currSum > maxvalue){
                maxvalue=currSum;
            }
            if(currSum < 0){
                currSum=0;
            }
        }
        System.out.println("Maximumuim Sum of Sub Array:"+maxvalue);
    }

    /* 
        Print subarray with maximum subarray sum (extended version of above problem)

   */ 
  public void printMaximumSubArraySum(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int start=0;
        int end=0;
        int tempStart = 0;
            for(int i=0;i<nums.length;i++){
                currSum+=nums[i];
                if(currSum > maxSum){
                    maxSum=currSum;
                    start=tempStart;
                    end=i;
                }
                if(currSum < 0){
                    currSum=0;
                    tempStart=i+1;
                }

            }
            System.out.println("Maximum Sum Of of an Array"+maxSum);
            for(int i=start;i<=end;i++)
            {
                System.out.print(i+",");
            }
        }


        /*Stock Buy and Sell */
        public void maxProfit(int[] prices){
            System.out.println("Stock Buy and Sell:");
            if(prices == null || prices.length < 2)
            {
                System.out.println("Invalid Array");
            }
            int minPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i] < minPrice){
                    minPrice=prices[i];
                }
                int potentailProfit=prices[i]-minPrice;
                if(potentailProfit > maxProfit){
                    maxProfit=potentailProfit;
                }
            }
            System.out.print(maxProfit);
        }
    
  }
