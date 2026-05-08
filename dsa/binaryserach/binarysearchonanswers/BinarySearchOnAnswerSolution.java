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

}
