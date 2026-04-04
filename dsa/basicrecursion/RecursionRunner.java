package dsa.basicrecursion;

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

    }

}
