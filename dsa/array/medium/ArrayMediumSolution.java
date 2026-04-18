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

}
