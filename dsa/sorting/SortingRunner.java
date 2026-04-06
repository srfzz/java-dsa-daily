package dsa.sorting;

import java.util.Random;

public class SortingRunner {
    public static void main(String[] args)
    {
        SortingSolution sol=new SortingSolution();
        Random rnm=new Random();
        int[] arr= new int[100];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rnm.nextInt(156);
        }

        /*
        Selection Sort

        */
       sol.selectionSortTech(arr);
    }

}
