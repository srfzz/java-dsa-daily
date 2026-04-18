package dsa.array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayEasyRunner {

    public static void main(String[] args){
        ArrayEasySolution sol=new ArrayEasySolution();
        System.out.println("Array Easy Solution");
        /* 	
           Largest Element 
           */
            Random rn=new Random();

          int[] nums = new int[30];
          int[] slarg = new int[30];
          int[] dubsortarr = new int[30];
          int[] leftRotate = new int[30];
          int[] leftRotatebyK = new int[30];
          int[] lnSer=new int[30];
          int[] arrOne=new int[30];
          int[] arrTwo=new int[30];

          for(int i=0;i<nums.length;i++)
          {
            nums[i]=rn.nextInt(33);
            slarg[i]=rn.nextInt(33);
            dubsortarr[i]=rn.nextInt(33);
            leftRotate[i]=rn.nextInt(77);
            leftRotatebyK[i]=rn.nextInt(77);
            lnSer[i]=rn.nextInt(100);
            arrOne[i]=rn.nextInt(30);
            arrTwo[i]=rn.nextInt(30);

          }
          System.out.println("largest elemet array to search from**\n"+Arrays.toString(nums));
          sol.largestElementBruteSol(nums);
          System.out.println();
          sol.largestElementUsingSorting(nums);
          System.out.println();
          sol.largestElementUsingStream(nums);


        /*Proram to finc Second largset Element */
        System.out.println("second largest element ** \n"+Arrays.toString(slarg));
        sol.secondLargestElementBrute(slarg);
        System.out.println();
        sol.secondLargestUsingTwoPointer(nums);

        int[] numsToSort={1,2,3,4,5};

        /*  check if an array is sorted  */

        sol.chcekIfSortedBrute(numsToSort);

         int[] numsToSortRemDub={1,1,2,2,3,3,3,3,3,4,5,8};
         int[] numsToSortRemDubOptimal={1,1,2,2,3,3,3,3,3,4,5,8};
        /*	Remove duplicates from Sorted array */

        System.out.println("after removeing dublicate on the sorted Array");
        sol.removeDublicateBruteMethod(numsToSortRemDub);
        int size=sol.removeDublicateOptimalMethod(numsToSortRemDubOptimal);
        for(int i=0;i<size;i++){
          System.out.println(numsToSortRemDubOptimal[i]+"");
        }
        /*Left Rotate Array by One */
        sol.rotateArrayByOneSol(leftRotate);
        /*Left Rotate Array by K Places */
        sol.rotateAnArrayByKplaces(leftRotate, 10);
      /*Move Zeros to End */
      int[] zeroNumsBrute={0,1,0,2,3,0,5,7};
      sol.moveZeroesToEndBrute(zeroNumsBrute);
      int[] zeroNumsOptimal={0,1,0,2,3,0,5,7};
      sol.moveZeroToEndOptimal(zeroNumsOptimal);
      /* Linear Search */
      sol.linearSearchBrute(lnSer,77 );
      sol.binarySearch(lnSer, 43);
      /*	Union of two sorted arrays */
      int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
      sol.unionOfTwoSortedArray(arr1, arr2);

      /*  Find missing number */
      int[] arrToCheckMissingNumber={8, 2, 4, 5, 3, 7, 1};
      sol.findMissingNumber(arrToCheckMissingNumber);
      sol.findMissingNumberOptimalmethod(arrToCheckMissingNumber);
      

      /* Maximum Consecutive Ones */
      /*Example 1:
        Input: prices = {1, 1, 0, 1, 1, 1}
        Output: 3
        Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
      */
     int[] prices={1, 1, 0, 1, 1, 1,1,12,2,1,1,1,1,1,1,1,1,1,1,1};
     sol.countMaximumConsequtiveOneInAnArray(prices);
    



    }

}
