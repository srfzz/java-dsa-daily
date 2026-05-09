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
        System.out.println(result.toString());
     }
     

}
