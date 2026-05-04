package dsa.binaryserach.bsonOneDarray;

public class BinarySercahOnOneArrayRunner {
public static void main(String[] args){
    BinarySearchOnOneArraySolution sol=new BinarySearchOnOneArraySolution();
    /*Search X in sorted array */

     int[]  arryToFindTwoPointer = {3, 4, 6, 7, 9, 12, 16, 17}; 
        int target = 6; 
        sol.findElementInSortedArray(arryToFindTwoPointer, target);
        sol.findElementusingRecurion(arryToFindTwoPointer, 0, arryToFindTwoPointer.length-1, target);
    




}

}
