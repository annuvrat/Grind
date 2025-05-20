
class Solution {
    public static String removeConsecutiveCharacter(String input) {
               
      
       if(input== null|| input.length()==0){
           return input;
       }
       
       
      StringBuilder result = new StringBuilder();
      char prev = input.charAt(0);
      
      result.append(prev);
      
      for(int i=1;i<input.length();i++){
         char currchar = input.charAt(i);
         
         if(currchar != prev ){
             result.append(currchar);
              prev=currchar;
         }
          
      }
      return result.toString();
     
    }
}
