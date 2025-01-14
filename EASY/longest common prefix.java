class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

       
        for (int index = 0; index < strs[0].length(); index++) {
            char currentChar = strs[0].charAt(index);
           
            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
             
                if (index >= strs[stringIndex].length() || strs[stringIndex].charAt(index) != currentChar) {
                  
                    return strs[0].substring(0, index);
                }
            }
        }
       
        return strs[0];
    }
        
    }
