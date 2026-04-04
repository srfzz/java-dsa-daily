package dsa.math;

public class MathRunner {
    public static void main(String[] args)
    {

        /*problme one to count digit in agiven number */
        NumberProbelms numberProbelms=new NumberProbelms();
        int numberToCount=12345671;
        System.out.print("Total digits:"+numberProbelms.totalDigitCount(numberToCount));
        /* problem 2.reverse the given number  */
        int numberToReverse=238787;
        System.out.println("\nReverse of the"+numberToReverse+" is :"+numberProbelms.reverseNumber(numberToReverse));
        /*Progarm to find a given number is palindrome */
        int numberToCheckForPlaindrome=1221;
        System.out.println(numberToCheckForPlaindrome+" is :"+numberProbelms.checkPlaindromeNumber(numberToCheckForPlaindrome));



    }

}
