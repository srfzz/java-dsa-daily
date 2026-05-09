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
    }

}
