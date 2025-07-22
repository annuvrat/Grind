class Solution {
    public int maxDepth(String s) {
        
        Stack<Character>stack = new Stack<>();
         int maxx=0;
       for(char c: s.toCharArray()){
           if(c == '('){
            stack.push(c);
           }
           else if(c == ')'){
            stack.pop();
           }

      maxx = Math.max(maxx,stack.size());
       }
        
        return maxx;
    }
}
