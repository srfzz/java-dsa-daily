package dsa.string.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String frequencySort(String s){
       if(s == null || s.length() ==0) return s;
       Map<Character,Integer> frequesntMap=new  HashMap<>();
       for(char c : s.toCharArray()){
        frequesntMap.put(c,frequesntMap.getOrDefault(c,0)+1);
       }
     List<Character>[] buckets=new List[s.length()+1];
     for(char c : frequesntMap.keySet()){
        int freq=frequesntMap.get(c);
        if(buckets[freq] == null){
            buckets[freq]=new java.util.ArrayList<>();
        }
        buckets[freq].add(c);
     }
     StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

    return sb.toString();
    }

    public int maxNestingDepth(String s){
        if(s == null || s.length() == 0) return 0;
        int maxDepth=0;
        int currentDepth=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            if(c=='('){
              
                currentDepth++;
                if(currentDepth > maxDepth) {
                maxDepth = currentDepth;
                  System.out.println("currntDepth: " + currentDepth + ", maxDepth: " + maxDepth);
            }
            }else if(c==')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
        
}
