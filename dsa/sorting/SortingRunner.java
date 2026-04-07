package dsa.sorting;

import java.util.Random;

public class SortingRunner {
    public static void main(String[] args)
    {
        SortingSolution sol=new SortingSolution();
        Random rnm=new Random();
        int[] arr= new int[20];
        int[] bnum=new int[20];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rnm.nextInt(29);
            bnum[i]=rnm.nextInt(30);
        }

        /*
        Selection Sort

        */
       sol.selectionSortTech(arr);

       /*
       Bubble Sort
       */
      sol.bubbleSortExample(bnum);
    }

}
