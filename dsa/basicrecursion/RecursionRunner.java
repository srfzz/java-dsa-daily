package dsa.basicrecursion;

import java.util.Arrays;

public class RecursionRunner {
    public static void main(String[] args)
    {
        RecursionProbelms rec=new RecursionProbelms();
        /*Print name N times using recursion */
        String myName="Sarfaraj";
        int times=5;
        rec.printName(myName,times);

        /* Print 1 to N using Recursion */
        rec.printOneToN(56);

        /*weap to print n ot 1 using recursion whwre n is the number  */
        rec.nToOne(10);

        /* Sum of First N Numbers */
        System.out.println("Sum of first n number:"+rec.sumOfFisrtnNumbers(5));

        /* Factorial of a given number */

        System.out.printf("factorial of the number is :%d \n",rec.factorialOfNumber(10));

        /*Reverse an array */
       int[] numbers={1,34,87,22,78,07};
       rec.reverseArray(numbers, 0, numbers.length-1);
       System.out.println(Arrays.toString(numbers));


       /*Check if String is Palindrome or Not */
        String name ="abbta";
        char[] nameArray=name.toCharArray();
        System.out.println(rec.isStringPalindrome(nameArray, 0, nameArray.length-1));


        /* Fibonacci Number */
        int fibLimit=10;
        rec.fibonaccaiSeriesUptoN(fibLimit);

    }

}
