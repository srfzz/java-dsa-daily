package dsa.basicrecursion;

import java.math.BigInteger;

public class RecursionProbelms {
  static int count=0;;
    /*Solution Print name N times using recursion */
    public void printName(String name,int times)
    {
        if(times <=0)
        {
            return ;
        }
        System.out.println(name);
        
        printName(name,times-1);
    }
    public void printOneToN(int num)
    {
        printNumber(1,num);
    }
    private void printNumber(int current,int target)
    {
        if(current == target)
        {
            return ;
        }
        System.out.println(current+",");
        printNumber(current+1, target);
    }



    public void nToOne(int number)
    {
        if(number ==0)
        {
            return ;
        }
        System.out.println("\n"+number);
       nToOne(number-1);
    }
   public int sumOfFisrtnNumbers(int number)
   {
        
        if(number <=0)
        {
            return 0;
        }
        return number + sumOfFisrtnNumbers(number-1);

   }

   public BigInteger factorialOfNumber(int number)
   {
    if( number <=1 )
    {
        return BigInteger.ONE;
    }
    return BigInteger.valueOf(number).multiply( factorialOfNumber(number-1));
   }

   //* solution to reverse an array */

   public void reverseArray(int[] number,int begin,int end)
   {
    if(begin >=end)
    {
        return ;
    }
    int temp=number[begin];
    number[begin]=number[end];
    number[end]=temp;
    reverseArray(number, begin+1, end-1);
   }

   public boolean isStringPalindrome(char[] arr,int begin,int end)
   {
    if(begin >= end)
    {
        return true;
    }
    if(arr[begin]!=arr[end])
    {
             return false;
    }
     return  isStringPalindrome(arr, begin+1, end-1);
   }
   /*solution for fibonncai number using recusrsion */
   public void fibonaccaiSeriesUptoN(int num)
   {
      generatefibonaccaiSeries(num,0,1);
   }
   private void generatefibonaccaiSeries(int num,int f1,int f2)
   {
    if(num <=0)
    {
        return ;
    }
    System.out.print(f1+",");
    generatefibonaccaiSeries(num-1, f2, f1+f2);
   }
}
