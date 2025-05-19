class Solution {
    public boolean isValid(String s) {
         
while(s.contains("[]")||s.contains("{}")||s.contains("()")){
   s=  s.replace("[]","")
      .replace("{}","")
       .replace("()","");

    if(s.isEmpty()){
        return true;
    }
}
         return false;
    }
}
