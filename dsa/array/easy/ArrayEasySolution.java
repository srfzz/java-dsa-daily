package dsa.array.easy;
import java.util.Arrays;
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

}
