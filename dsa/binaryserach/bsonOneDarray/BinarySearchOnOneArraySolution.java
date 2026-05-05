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

        /*sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal */
        public void findFloorAndCeil(int[] nums,int x){
            System.out.println("Progarm to fin index of ceiling and floor");
            findCeiling(nums, x);
            findFloor(nums, x);
           

        }
        private  void findFloor(int nums[] ,int x){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low <=high){
                int mid=low +(high-low)/2;
                if(nums[mid] <= x){
                    ans=mid;
                    low=mid+1;
                }else
                {
                    high=mid-1;
                }
            }
            if (ans != -1) System.out.println("Floor is: " + nums[ans]);
    else System.out.println("Floor does not exist");

        }
         private  void findCeiling(int nums[] ,int x){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low <=high){
                int mid=low +(high-low)/2;
                if(nums[mid] >= x){
                    ans=mid;
                    high=mid-1;
                }else
                {
                    low=mid+1;
                }
            }
        if (ans != -1) System.out.println("Ceiling is: " + nums[ans]);
    else System.out.println("Ceiling does not exist");
            
        }
    public void findFirstAndLastOccuranceOfanElement(int[] nums,int target){
      int first=findBound(nums, target, true);
      if(first ==-1)
      {
        System.out.printf("first[%d]and second[%d]\n",-1,-1);
        return;
      }
      int last=findBound(nums, target, false);
      System.out.printf("first[%d]and second[%d]\n",first,last);
      System.out.println("Total Occurance is"+(last-first+1));
    }
    private int findBound(int nums[],int target,boolean isFirst){
        int low=0;
        int high=nums.length-1,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isFirst){
                    high=mid-1;
                }else
                {
                    low=mid+1;
                }
            }else if(target > nums[mid])
            {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;

    }
        /* Search in rotated sorted array-I
         
         Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.
         */
        public void findIndexOfElementRotatedSortedArrayBrute(int[] nums,int target){
            System.out.println("brute");
            int size=nums.length-1;
            int elementIndex=-1;
            int i=0;
            while(i<=size){
                if(nums[i]==target){
                    elementIndex=i;
                    break;
                }else
                {
                    elementIndex=-1;
                }
                i++;
            }
            System.out.println("Element index is :"+elementIndex);
        }
         public void findIndexOfElementRotatedSortedArrayOptimal(int[] nums,int target){
            int low=0,high=nums.length-1;
            int elementIndex=-1;
            while(low<=high){
                int mid = low +(high-low)/2;
                if(nums[mid]==target){
                    elementIndex=mid;
                    break;
                }
                if(nums[low] <= nums[mid]){
                    if(target >=nums[low] && target < nums[mid])
                    {
                        high=mid-1;
                    }else
                    {
                        low=mid+1;
                    }
                }else{
                    if (target > nums[mid] && target <= nums[high]) {
                     low = mid + 1;  
                    } else {
                        high = mid - 1; 
                    }
                }
            }
            System.out.println("Element Index Is :"+elementIndex);
        }


}
