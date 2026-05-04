package dsa.binaryserach.bsonOneDarray;

public class BinarySearchOnOneArraySolution {

    /*Search X in sorted array */
     public void findElementInSortedArray(int[] nums,int target){
        System.out.println("Finding element using bInary serach and two pointer");
        if(nums== null || nums.length ==0){
            System.out.println("INvalid Array Pleae give proper Array Data");
        }
        int low=0;
        int high=nums.length-1;
        while(low <= high){
             int mid = low + (high-low)/2;
            if(nums[mid] == target){
                System.out.printf("The Elemenet %d Exist and it eixts of %d index \n", target,nums[mid]);
                return;
            }
            if(target < nums[mid]){
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        System.out.println("target Not Found");
     }
     public void findElementusingRecurion(int nums[] ,int low,int high,int target){
        if(nums == null || nums.length == 0){
            System.out.println("Invalid rray plese Prve a valid  Array");
        }
       if(low > high){
        System.out.println("Element Not found");
        return;
       }
       int mid = low + (high-low)/2;
       if(nums[mid] == target){
        System.out.println("\n Element exits on index"+mid);
        return;
       }
       if(target < nums[mid]){
        findElementusingRecurion(nums, low, mid-1, target);
       }else{
        findElementusingRecurion(nums, mid+1, high, target);
       }
     }

     /*Given a sorted array of N integers and an integer x, write a program to find the lower bound of x. */ 
     public void lowerBound(int[] nums,int x){
            int low =0,high=nums.length-1;
            int ans=nums.length;
            while(low<=high){
                int mid=low + (high-low)/2;
                if(nums[mid] >=x){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }
            System.out.println(ans);
    }
    public void  upperBound(int[] nums,int x){
        int low =0,high=nums.length-1;
        int ans=nums.length;
        while(low <=high){
            int mid = low + (high - low)/2;
            if(nums[mid] > x){
                ans=mid;
                high=mid-1;
            }else
            {
                low =mid+1;
            }

        }
        System.out.println(ans);
    }
    
        /*roblem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array. */
        public void BinarySearchInsertElement(int[] nums,int x){
            int low=0;
            int high=nums.length-1;
            int ans=nums.length;
            while(low <=high){
                int mid =low+(high-low)/2;
                if(nums[mid] >= x){
                    ans=mid;
                    high=mid-1;
                }else
                {
                    low=mid+1;
                }
            }
            System.out.printf("Elemnent where it need tio be insted is :%d",ans);
        }

}
