package dsa.array.medium;

public class ArrayMediumRunner {

   

  public static void main(String[] args){
     /*1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO. */
    int[] twoSum={2,6,5,8,11};
    ArrayMediumSolution sol=new ArrayMediumSolution();
    System.out.println(sol.sumEqualsTotarget(twoSum, 14));
  }



}
