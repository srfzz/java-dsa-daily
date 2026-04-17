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

          for(int i=0;i<nums.length;i++)
          {
            nums[i]=rn.nextInt(33);
            slarg[i]=rn.nextInt(33);
            dubsortarr[i]=rn.nextInt(33);
            leftRotate[i]=rn.nextInt(77);
            leftRotatebyK[i]=rn.nextInt(77);

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
      int[] zeroNums={0,1,0,2,3,0,5,7,0};


    }

}
