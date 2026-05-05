package dsa.binaryserach.bsonOneDarray;

public class BinarySercahOnOneArrayRunner {
public static void main(String[] args){
    BinarySearchOnOneArraySolution sol=new BinarySearchOnOneArraySolution();
    /*Search X in sorted array */

     int[]  arryToFindTwoPointer = {3, 4, 6, 7, 9, 12, 16, 17}; 
        int target = 6; 
        sol.findElementInSortedArray(arryToFindTwoPointer, target);
        sol.findElementusingRecurion(arryToFindTwoPointer, 0, arryToFindTwoPointer.length-1, target);

        /*Given a sorted array of N integers and an integer x, write a program to find the lower bound of x. */
        int[] lowerBoundArrayFinderarr = {3, 5, 8, 15, 19};  
        int x = 9;                    
        sol.lowerBound(lowerBoundArrayFinderarr, x);

        int[] upperBoundArray = {3, 5, 8, 9, 15, 19}; 
        int upperBoundSearchNum = 9;
        sol.upperBound(upperBoundArray, upperBoundSearchNum);

        /*problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target
       
        int x = 6; value in the array. */
         int[] ElementIndexInsertarr = {1, 2, 4, 7};
         int numTosearchAndinsert=5;
         sol.BinarySearchInsertElement(ElementIndexInsertarr, numTosearchAndinsert);

         /*sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal */
         int[] floorAndCeil ={3, 4, 4, 7, 8, 10};
         int numforFloorAndCeil=5;
         sol.findFloorAndCeil(floorAndCeil, numforFloorAndCeil);
    




}

}
