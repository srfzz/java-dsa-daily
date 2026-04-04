package dsa.math;

public class NumberProbelms {
/* Problem  Number one Count No of digits of given number n and return the total count */
public int totalDigitCount(int number)
{
    if(number == 0)
    {
        return 1;
    }
    
    int totalCount=0;
    while (number > 0)
    {
        number/=10;
        totalCount++;
    }
    return totalCount;
}

/* Solution to Reverse the  Number */
public int reverseNumber(int number)
{
     if(number == 0)
     {
        return 0;
     }
     int revNumber=0;
     while(number> 0)
     {
        int lastDigit=number %10;
        revNumber=revNumber*10 +lastDigit;
        number/=10;
     }
     return revNumber;
}

public String checkPlaindromeNumber(int number)
{
    if(number == 0)
    {
        return "Not Palindrome";
    }
    int revNum=0;
    int orignalNumber=number;
    while(number > 0)
    {
        int lastDigit=number%10;
        revNum=(revNum * 10) + lastDigit;
        number/=10; 
    }
    if(revNum == orignalNumber)
    {
        return "Palindrome";
    } else
    {
        return "Not Palindrome";
    }
}
public String chcekForArmstrsongNumber(int number)
{
    if(number == 0)
    {
        return "Not Armstrong Number";
    }
    int sum=0;
    int orignalNumber=number;
    while(number > 0)
    {
        int lasDigit=number%10;
        sum=sum+ (int)Math.pow(lasDigit, 3);
        number/=10;
    }
    if(sum== orignalNumber)
    {
        return "Armstrong Number";
    }else
    {
        return "Not Armstrong Number";
    }

}
/* Solution to rin all the Divsisors */
public void printAllTheDivisors(int num)
{
    if(num == 0)
    {
        System.out.print(num);
    }
    
    for(int i=1;i<=num;i++)
    {
        if(num%i==0)
        {
           System.out.print(i+",");
        } 
    }
    System.out.println();
    
}
/* find gcd of two numbers  */
public void findGcdOfTwoNumbers(int firstNumber,int secondNumber)
{
    int a =Math.abs(firstNumber);
    int b=Math.abs(secondNumber);
    while(a > 0 && b >0)
    {
        if(a>b)
        {
            a=a%b;
        }else
        {
            b=b%a;
        }
    }
    if(a==0)
    {
        System.out.println("Gcd is :"+b);
    }else
    {
        System.out.println("Gcd is :"+a);
    }    
}

/*soultion tgo chcvek if the number is prime nunmber or not */
public String checkPrime(int num)
{
    if(num < 2)
    {
        return "Not Prime";
    }
    for(int i=2;i<num; i++)
    {
        if(num%i ==0)
        {
            return "Not a prime Number";
        }
           
    }
    return "Prime Number";

}
}
