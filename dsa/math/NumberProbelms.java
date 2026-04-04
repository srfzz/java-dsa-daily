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

}
