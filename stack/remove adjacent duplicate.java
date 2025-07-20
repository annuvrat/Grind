class Solution {
    public String removeDuplicates(String s) {

     Stack<Character> stack = new Stack<>();

     for(char ch:s.toCharArray()){
       if(!stack.isEmpty() && stack.peek()==ch){
        stack.pop();
       }
       else{
        stack.push(ch);
       }
            
        
     }   
     StringBuilder str =  new StringBuilder();
     for(char c: stack){
        str.append(c);
       
     }
     return str.toString();
    }
}
