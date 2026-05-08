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

}
