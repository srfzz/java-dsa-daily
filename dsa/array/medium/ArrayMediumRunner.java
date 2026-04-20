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
  }



}
