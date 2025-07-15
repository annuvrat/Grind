import java.util.HashMap;

public class Main {
    public static boolean Anagram(String str1 , String str2) {
        
        if(str1.length()!= str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        
        for(char ch1 : str1.toCharArray()){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
            for(char ch2 :str2.toCharArray()){
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        
        return map1.equals(map2);
     
    }
         
         public static void main(String[]args){
             String str1 = "geeks";
             String str2 = "skeeg";
             
             
             System.out.print(Anagram(str1,str2));
         }
    
}
