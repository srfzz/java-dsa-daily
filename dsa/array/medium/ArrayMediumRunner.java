package dsa.array.medium;

public class ArrayMediumRunner {

   

  public static void main(String[] args){
     /*1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO. */
    int[] twoSum={2,6,5,8,11};
    ArrayMediumSolution sol=new ArrayMediumSolution();
    System.out.println(sol.sumEqualsTotarget(twoSum, 14));


    /*
    Sort an array of 0's 1's and 2's
    Input: nums = [1, 0, 2, 1, 0]
    Output: [0, 0, 1, 1, 2]
    Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

    */

    int[] nums={1, 0, 2, 1, 0};
    sol.sortArrayInAscWithoutCreatingNewArray(nums);

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
   int[] mnums={7, 0, 0, 1, 7, 7, 2, 7, 7}; 
   sol.majorityElement(mnums);
    int[] mnumsOptimal={7, 0, 0, 1, 7, 7, 2, 7, 7}; 
    sol.majorityElementOptimal(mnumsOptimal);


    /*
    Kadane's Algorithm : Maximum Subarray Sum in an Array


    36

Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

A subarray is a contiguous non-empty sequence of elements within an array.
    */
   int[] maxSubArray={2, 3, 5, -2, 7, -4};
   sol.maximumSubArraySum(maxSubArray);

   /*
        Print subarray with maximum subarray sum (extended version of above problem)

   */
    int[] printMaxSubArray={2, 3, 5, -2, 7, -4};
    sol.printMaximumSubArraySum(printMaxSubArray);

    /* Stock Buy and Sell */
    int[] stockPrices={10, 7, 5, 8, 11, 9};
    sol.maxProfit(stockPrices);


    /* WAP to  Rearrange array elements by sign  */
    int[] reArrangeBrute={1,2,-3,-1,-2,-3};
    sol.reArragneElemetsBySignBrute(reArrangeBrute);
     int[] reArrangeOptimal={1,2,3,-1,-2,-3};
     sol.reArragneElemetsBySignOptimal(reArrangeOptimal);

     /* Leaders in an Array */
     int[] bruteleaderInArray={10, 22, 12, 3, 0, 6};
     sol.leaderinArrayBrute(bruteleaderInArray);
    int[] optimalLeaderInArray={10, 22, 12, 3, 0, 6};
    sol.leaderinArrayOptimal(optimalLeaderInArray);

    /*Longest Consecutive Sequence in an Array */
    /*
      Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
      nums = [100, 4, 200, 1, 3, 2]  
     */
    int[] longestSequenceBetter={100, 4, 200, 1, 3, 2};
    sol.longestConsequeticArrayBetter(longestSequenceBetter);
    int[] longestSequenceOptimal={100, 4, 200, 1, 3, 2};
    sol.longestSequenceArrayOptimal(longestSequenceOptimal);

  }



}
