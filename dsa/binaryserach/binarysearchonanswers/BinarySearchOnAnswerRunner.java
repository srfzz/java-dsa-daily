package dsa.binaryserach.binarysearchonanswers;

public class BinarySearchOnAnswerRunner {

    public static void main(String args[]){
        BinarySearchOnAnswerSolution sol=new BinarySearchOnAnswerSolution();

        /*

        Finding Sqrt of a number using Binary Search
        Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
        
        */
       sol.findSqrRoot(25);

       /*
       
       Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.
       */
        sol.NthRootOfANumber(3, 27);

    /**
     * 
     *  Problem Statement: A monkey Koko is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.

        Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

        Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
     * 
     * 
     * **/

        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Minimum speed k = " + sol.minEatingSpeed(piles1, h1));

    }


    /*** 
     * 
     * Problem Statement: You are given 'N’ roses and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day. You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet. Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.
     * 
     * 
     * 
     * ***/

}
