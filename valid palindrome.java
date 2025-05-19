class Solution {
    public boolean isPalindrome(String s) {
        
  s= s.toLowerCase();
     
  String result = s.replaceAll("[^A-Za-z0-9]", "");
  int n = result.length();

     for(int i=0;i<n/2;i++){
        if(result.charAt(i)!= result.charAt(n-i-1)){
            return false;
        }
     }
     return true;
}
}
