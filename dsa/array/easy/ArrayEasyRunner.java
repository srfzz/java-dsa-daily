package dsa.array.easy;

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
          for(int i=0;i<nums.length;i++)
          {
            nums[i]=rn.nextInt(33);
          }
          System.out.println("largest elemet array to search from**\n"+Arrays.toString(nums));
          sol.largestElementBruteSol(nums);
          System.out.println();
          sol.largestElementUsingSorting(nums);
          System.out.println();
          sol.largestElementUsingStream(nums);

    }

}
