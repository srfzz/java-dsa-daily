package dsa.sorting;

import java.util.Random;

public class SortingRunner {
    public static void main(String[] args)
    {
        SortingSolution sol=new SortingSolution();
        Random rnm=new Random();
        int[] arr= new int[20];
        int[] bnum=new int[20];
        int[] insnum=new int[20];
        int[] mersnum=new int[20];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rnm.nextInt(29);
            bnum[i]=rnm.nextInt(30);
            insnum[i]=rnm.nextInt(28);
            mersnum[i]=rnm.nextInt(23);
        }

        /*
        Selection Sort

        */
       sol.selectionSortTech(arr);

       /*
       Bubble Sort
       */
      sol.bubbleSortExample(bnum);



      /* insertion sort */
     sol.insertionSortExample(insnum);




     /* Merge Sort using recursion */

    }

}
