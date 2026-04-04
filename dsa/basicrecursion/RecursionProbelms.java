package dsa.basicrecursion;

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
        System.out.print(current+",");
        printNumber(current+1, target);
    }

}
