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

        //suppose key 4

        int j=i-1;
        //supose j=0 is 5
        while(j >=0 && arr[j] > key)
        {

            arr[j+1]=arr[j];

            //see now j+1 is 5
            j=j-1;
        }
        arr[j+1]=key;
       }

       System.out.println("****** Insertion Sort ******");
       for (int number : arr) {
         System.out.println(number);
       }

    }



    /* Solution to merge Sort */
    public void mergeSortExample(int[] arr,int left,int right)
    {
        if(left < right)
        {

            //we will first find the middle point
            int mid=left +(right-left)/2;

            //we will sorrt fist and second halves 
            mergeSortExample(arr, left, mid);
            mergeSortExample(arr, mid +1, right);


            //we will merge the sprted arrays
            merge(arr,left,mid,right);
        }
    }
private void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays (The O(n) space cost)
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into the original arr[left...right]
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
