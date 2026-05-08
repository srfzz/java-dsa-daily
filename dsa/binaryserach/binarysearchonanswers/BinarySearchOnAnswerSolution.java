package dsa.binaryserach.binarysearchonanswers;

public class BinarySearchOnAnswerSolution {


    public void findSqrRoot(int n){
      if(n<2){
        System.out.println(n);
        return;
      }
      int low=1;
      int high=n/2;
      int ans=0;
      while(low<=high){
        long mid=low+(high-low)/2;
        long square=mid*mid;
        if(square <=n){
            ans=(int)mid;
            low=(int)mid+1;
        }else{
            high=(int)mid-1;
        }

      }
      System.out.println(ans);

    }
/*
giveen two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.
*/
    public void NthRootOfANumber(int n,int m){

        int low=1;
        int high=n;
        int ans=-1;
        while (low <= high) {
            int mid=low+(high-low)/2;
            int midPower= midPowFunc(mid,n,m);
            if(midPower==1){
                ans=mid;
                
                break;
            }else if(midPower ==0)
            {
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        System.out.println(ans);

    }
    private int midPowFunc(int mid,int n,int m){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans > m){
                return 2;
            }
        }
        if(ans ==m) return 1;
        return 0;
    }

    /**
     * 
     *  Problem Statement: A monkey Koko is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.

        Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

        Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
     * 
     * 
     * **/
        public int minEatingSpeed(int[] piles,int h){
            int low=1;
            int high=findMaxNum(piles);
            int ans=high;
            while(low<=high){

                int mid=low+(high-low)/2;
                long totalhours=calcaulateTotalHours(piles,mid);
                if(totalhours <=h){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return ans;

        }
        private long calcaulateTotalHours(int[] piles,int k){
            long totalH=0;
            for(int p:piles){
                totalH +=(p + k-1)/k;//to caluaclye ceil
            }
            return totalH;
        }
        private int findMaxNum(int[] piles){
            int max=0;
            for(int p:piles){
                max=Math.max(max, p);
            }
            return max;
        }
        
    /*** 
     * 
     * Problem Statement: You are given 'N’ roses and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day. You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet. Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.
     * 
     *
     * ***/

    public int minDaysRoseFlower(int[] bloomDay,int m,int k){
        if((long) m*k > bloomDay.length){
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(day, low);
            high=Math.max(day, high)
        }
        int result=high;
        while(low <=high){
            int mid=low+(high-low)/2;
            if (canMakeBouquets(bloomDay, mid, m, k)) {
                result = mid;      
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        return result;
    }
    private boolean canMakeBouquets(int[] bloomDays,int day,int m,int k){
        int totalBouquets=0;
        int count=0;
        for(int roseDay:bloomDays){
            if(roseDay <=day){
                count++;
                if(count == k){
                    totalBouquets++;
                    count=0;
                }
            }else
            {
                count=0;
            }
        }
        return totalBouquets >=m;
    }




}
