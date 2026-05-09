package dsa.string.basic;

import java.util.Arrays;

public class basicStringSolution {


     /*Remove Outermost Parentheses */

     public void removeOuterParentheses(String s){
         
      System.out.println(s.replaceAll("\\((.*)\\)", "$1"));
     StringBuilder result=new StringBuilder();
     int opened=0;
     for(char c:s.toCharArray()){
        if(c=='('){
            if(opened>0){
                result.append(c);
            }
            opened++;
        }else{
            opened--;
            if(opened>0){
                result.append(c);
            }
        }
        
     }
     System.out.println(result.toString());
    }

    /*Reverse words in a given string / Palindrome Check */
    public void ReverseWords(String s){
        StringBuilder result=new StringBuilder();
        String[] words=s.split(" ");
        int low=0,high=words.length-1;
        while(low<=high){
            result.append(words[high--]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
     
 /**Largest Odd Number in a String */
 public void largestOddNumber(String s){
 int right=-1;
 for(int i=s.length()-1;i>=0;i--){
         int digit=s.charAt(i)-'0';
        if(digit%2 !=0){
            right=i;
            break;
        }

    }
    if(right==-1){
        System.out.println("");
        return;
    }
    int left=0;
    while(left <right && s.charAt(left) =='0')
    {
        left++;
    }
    System.out.println(s.substring(left,right+1));
 }
 /*	
Longest Common Prefix */
    public String longestCommonPrefixString(String[] strs){
        if(strs== null || strs.length == 0) return "";
        for(int i=0;i< strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i) !=c){
                    return strs[0].substring(0,i);
                }
            }
        }
    return strs[0];
    }

    /** Isomorphic String */
    public boolean isIsomorphic(String s, String t){
       if(s.length() !=t.length()) return false;
       int[] mapS=new int[256];
       int[] mapT =new int[256];
       System.out.println("Length of s: " + Arrays.toString(mapS) + ", \nLength of t: " + Arrays.toString(mapT));
       for(int i=0;i<s.length();i++){
        char charS=s.charAt(i);
        char charT=t.charAt(i);
        if(mapS[charS] != mapT[charT]){
            return false;
        }
        mapS[charS]=i+1;
        mapT[charT]=i+1;
       }
        System.out.println("\nLength of s: " + Arrays.toString(mapS) + ", \nLength of t: " + Arrays.toString(mapT));
        return true;
    }
     /*Check if one string is rotation of another*/
    public boolean isRotation(String s,String goal){
       if(s.length() !=goal.length()) return false;
      String Combined=s+s;
      return Combined.contains(goal);
    }
    


    /* valid anagram */
    public void validAnagram(String s,String t){
        if(s.length() != t.length()) {
            System.out.println("Not anagrams");
            return;
        }
        int[] charCount=new int[256];
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }
        for(int count : charCount){
            if(count != 0){
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
        
}
