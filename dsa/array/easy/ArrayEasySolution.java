package dsa.array.easy;
import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
    public int removeDublicateOptimalMethod(int[] nums){
        if(nums == null || nums.length ==0){
            return -1;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
                if(nums[j]!=nums[i])
                {
                    i++;
                    nums[i]=nums[j];
                }
        }
        return i+1;
            
    }


    public void rotateArrayByOneSol(int[] nums){
        System.out.println("Before Rotation by One :"+Arrays.toString(nums));
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        System.out.println("Before After Rotation by One :"+Arrays.toString(nums));
    }
    public void rotateAnArrayByKplaces(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k+1, n-1);
        reverse(arr, 0, n-1);
System.out.println(Arrays.toString(arr));
    }
    private void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public void moveZeroesToEndBrute(int[] nums){
        //int[] zeroNums={0,1,0,2,3,0,5,7,0}; Example of an array
         int size =nums.length;
       List<Integer> temp=new ArrayList<>();
       for(int i=0;i<size;i++)
       {
        if(nums[i] !=0)
        {
            temp.add(nums[i]);
        }
       }
       int nonZeroSize=temp.size();
       for(int i=0;i<nonZeroSize;i++)
        {
            nums[i]=temp.get(i);
        }
        for(int i=nonZeroSize;i<size;i++)
        {
            nums[i]=0;
        }
        System.out.println("Output of  move zertoes to the end ");
        System.out.println(Arrays.toString(nums));
       

    }
    public void moveZeroToEndOptimal(int[] nums){
        int size=nums.length;
        int j=-1;
        for(int i=0;i<size;i++)
            {
                if(nums[i]==0){
                    j=i;
                    break;
                }
            }   
       
        for(int i=j+1;i<size;i++)
        {
            if(nums[i] !=0){
                int tempValue=nums[i];
                nums[i]=nums[j];
                nums[j]=tempValue;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    /*Liner serrach brute */
    public void linearSearchBrute(int[] nums,int k){
        System.out.println(Arrays.toString(nums));
        int size=nums.length;
        int i=0;
        boolean found=false;
        for(i=0;i<size;i++){
            if(nums[i]==k){
                found=true;
            break;
        }
        }
        if(found){
            System.out.println("Found");
        }else
        {
            System.out.println("Not Found");
        }
    }
    public void binarySearch(int[] nums,int k){
        Arrays.sort(nums);
        int low=0,high=nums.length;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(nums[mid] ==k){
                System.out.println("Found");
                return;
            }
            if(nums[mid] < k){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        System.out.print("Not Found");

    }
    /* Union of two sorted arrays */
    public void unionOfTwoSortedArray(int[] arrOne,int[] arrTwo){
        List<Integer> unionArr =new ArrayList<>();
        int i=0,j=0;
        int m=arrOne.length;
        int n=arrTwo.length;
        while(i < n && j <m){
            if(arrOne[i] < arrTwo[j])
            {
                if(unionArr.isEmpty() || unionArr.get(unionArr.size()- 1) != arrOne[i]){
                unionArr.add(arrOne[i]);
                
                }
                i++;
            }else if(arrTwo[j] < arrOne[i]){
                 if(unionArr.isEmpty() || unionArr.get(unionArr.size()- 1) != arrTwo[j]){
                unionArr.add(arrTwo[j]);
              
                 }
                   j++;
            }else
            {
            if(unionArr.isEmpty() || unionArr.get(unionArr.size()- 1) != arrOne[i]){
                unionArr.add(arrOne[i]);
               
                 }
                  i++;
                j++;
            }
          
        }
         while (i < m) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arrOne[i])
                unionArr.add(arrOne[i]);
            i++;
        }
        while (j < n) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arrTwo[j])
                unionArr.add(arrTwo[j]);
            j++;
        }
        for (Integer number : unionArr) {
            System.out.print(number);
        }
    }
    /*Find missing number brute Method  */
    public void findMissingNumber(int[] nums){
        
        int size=nums.length;
        System.out.println(" \nMissing Number is :");
        for(int i=1;i<=nums.length+1;i++){
            boolean found=false;
            for(int j=0; j<size; j++){
                   if(nums[j]==i){
                    found=true;
                    break;
                   }
            }
            if(!found){
                System.out.println(i);
                return;
            }
        }
    }
    public void findMissingNumberOptimalmethod(int[] nums){
        int n=nums.length+1;
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        System.out.printf("\n Missing Number Is : %d", expectedSum-actualSum);
    }
    /*ount Maximum Consecutive One's in the array */

    public void countMaximumConsequtiveOneInAnArray(int[] nums){
        int size=nums.length;

        int count=0,maxCount=0;
        for(int i=0;i<size;i++){
            if(nums[i] == 1){
                count++;
            }else{
                count=0;
            }
            System.out.println(maxCount);
            maxCount=Math.max(maxCount,count);
        }
        System.out.println("\nConseutice Ones :");
        System.out.println(maxCount+"\n");
        

    }


    public void findNumberThatappearOnceBrute(int[] nums){
        int size=nums.length;
        for(int i=0;i<size;i++){
            int num=nums[i];
            int count=0;
            for(int j=0;j<size;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Number with one Count is "+num);
            }
        }
    }

    public void findNumberThatappearOnceBetterApproch(int[] nums){
        Map<Integer,Integer> countValues=new HashMap<>();
        for(int num:nums){
            countValues.put(num, countValues.getOrDefault(num, 0)+1);
        }
        for( Map.Entry<Integer,Integer> entry :countValues.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                return;
        }
      }
    
    }
     public void findNumberThatappearOnceOptimalApproach(int[] nums){
       int xxor=0;
       for(int num:nums){
        xxor^=num;
       }
       System.out.print(xxor);
      
    
    }


}
