package dsa.array.easy;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class ArrayEasySolution {
    /* larget element Brute force  */
    public void largestElementBruteSol(int[] arr)
    {
       int size=arr.length;
       int maxElement=Integer.MIN_VALUE;
       for(int i=0;i<size;i++)
       {
        if(arr[i] > maxElement)
        {
            maxElement=arr[i];
        }
       }
       System.out.println(maxElement);

    }
    public void largestElementUsingSorting(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    public void largestElementUsingStream(int[] arr){
        int maxElement=Arrays.stream(arr).max().getAsInt();
        System.out.println(maxElement);
    }



    /*Program to find Secomd largest Element */
    public void secondLargestElementBrute(int[] nums)
    {
            Arrays.sort(nums); 

    int n = nums.length;
    int largest = nums[n - 1];
    int secondLargest = -1; 
    for (int i = n - 2; i >= 0; i--) {
        if (nums[i] != largest) {
            secondLargest = nums[i];
            break;
        }
    }

    if (secondLargest == -1) {
        System.out.println("No distinct second largest element");
    } else {
        System.out.println("Second Largest: " + secondLargest);
    }

    }
    public void secondLargestUsingTwoPointer(int[] nums){
        if(nums == null || nums.length < 2)
        {
            System.out.println(-1);
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }else if(nums[i] >secondLargest && nums[i] != largest)
            {
                secondLargest=nums[i];
            }
        }
        System.out.println(secondLargest);

    } 
    /*Check if the Array is Sorted II */
public void chcekIfSortedBrute(int[] nums)
{
    int size=nums.length;
    for(int i=0;i<size-1;i++)
    {
        if(nums[i] < nums[i+1] || nums[i]== nums[i+1])
        {
            continue;
        }else
        {
            System.out.println("Array is not Sorted ");
            break;
        }
    }
    System.out.print("The Array is Sorted ");
}

     public void removeDublicateBruteMethod(int[] nums)
     {
         Collection<Integer> set= new TreeSet<>();
         for(int num:nums){
            set.add(num);
         }
        int j=0;
        for(int uniqueNum:set){
            nums[j++]=uniqueNum;
        }
        for(int i=0;i<j;i++)
        {
            System.out.println(nums[i]+"");
        }
     }

}
