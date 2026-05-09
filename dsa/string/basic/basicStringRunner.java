package dsa.string.basic;

public class basicStringRunner {
    public static void main(String[] args){
        basicStringSolution sol=new basicStringSolution();
        /*Remove Outermost Parentheses */

        String s = "((()))";
        sol.removeOuterParentheses(s);

        /*Reverse words in a given string / Palindrome Check */
        String reserveWords="welcome to the jungle";
        sol.ReverseWords(reserveWords);


        /**Largest Odd Number in a String */
        sol.largestOddNumber("000987663454765347");
        /*	
Longest Common Prefix */
        String[] LongestCommonPrefixInput = {"interview", "internet", "internal", "interval"};
        System.out.println(sol.longestCommonPrefixString(LongestCommonPrefixInput));

        /** Isomorphic String */
        String[][] testCases = {
            {"egg", "add", "true"},
            {"foo", "bar", "false"},
            {"paper", "title", "true"},
            {"badc", "baba", "false"},
            {"a", "a", "true"},
            {"ab", "ca", "true"}
        };
        for (String[] testCase : testCases) {
            String ss = testCase[0];
            String tt = testCase[1];
            boolean expected = Boolean.parseBoolean(testCase[2]);
            boolean result = sol.isIsomorphic(ss, tt);
            System.out.println("Input: " + ss + ", " + tt + " | Expected: " + expected + " | Result: " + result);
        }
    }

    
    

}
