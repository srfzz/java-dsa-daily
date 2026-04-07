package dsa.sorting;

public class SortingSolution {
    /*
    Selection Sort
    */

    public void selectionSortTech(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {

            int minIdx=i;
            for(int j=i+1;j< n;j++)
            {
                if(arr[j] < arr[minIdx]){
                    minIdx=j;
                }
            }
            if(minIdx !=i)
            {
                int temp=arr[minIdx];
                    arr[minIdx]=arr[i];
                    arr[i]=temp;
            }
        }
        for (int i : arr) {
             System.out.print(" "+i+","); 
        }
     
    }
     /*Bubble Sort */

    public void bubbleSortExample(int[] arr){
       int n =arr.length;
       for(int i=0;i<n-1;i++)
       {
         boolean swapped =false;
         for(int j=0;j<n-1-i;j++)
         {
            if(arr[j] > arr[j+1])
            {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swapped=true;
            }
         }
         if(!swapped) break;
       }


       System.out.println("\n ****** Bubble Sort ****");
       for (int num : arr) {
        System.out.println(num);
        
       }
       
    }


    /*Insertion Sort */

    public void insertionSortExample(int[] arr){

       int n=arr.length;
       for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j >=0 && arr[j] > key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
       }

       System.out.println("****** Insertion Sort ******");
       for (int number : arr) {
         System.out.println(number);
       }

    }


}
