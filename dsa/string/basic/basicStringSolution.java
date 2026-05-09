package dsa.string.basic;

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

}
