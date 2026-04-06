package dsa.basichashing;

import java.util.HashMap;
import java.util.Map;

public class BasicHashingSolution {


    /* Counting Frequencies of Array Elements */
    public void countArrayElemenetdBruteMethod(int[] nums){
      int n=nums.length;
      boolean[] visited=new boolean[n];
      for(int i=0;i<n ;i++){
        if(visited[i]) continue;
        int count =1;
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j])
            {
                visited[j]=true;
                count ++;
            }
        }
        System.out.printf("%d count is %d \n",nums[i],count);
      }
    }


    /* counte frewiqndy of an arry using hashing method  */
    public void  countArrayHashMethod(int[] nums){
        Map<Integer,Integer> map =new HashMap<>();
        for(int x:nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.printf("%d Appers %d times \n", entry.getKey(),entry.getValue());
        }
    }

}
