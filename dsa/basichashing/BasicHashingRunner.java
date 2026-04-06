package dsa.basichashing;

public class BasicHashingRunner {

    public static void main(String[] args)
    {
        BasicHashingSolution sol=new BasicHashingSolution();

        /* wap to Counting Frequencies of Array Elements */
        int[] nums={1,3,4,7,5,4,2,3,4,1,7,8,4,2,3,1,3,1,5};
        sol.countArrayElemenetdBruteMethod(nums);
        sol.countArrayHashMethod(nums);


        /*Highest Occurring Element in an Array */

        System.out.println("*******Highest occuring Element*****");;
        sol.highestOccuringElementBruteMethod(nums);
        sol.highestoccuringElementhashMethod(nums);
    }

}
