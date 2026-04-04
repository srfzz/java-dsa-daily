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

}
