import java.util.HashMap;

public class Main {
    public static char Anagram(String str1) {
        
        // if(str1.length()!= str2.length()){
        //     return false;
        // }
        str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        
        
        HashMap<Character,Integer>map1 = new HashMap<>();
        // HashMap<Character,Integer>map2 = new HashMap<>();
        
        for(char ch1 : str1.toCharArray()){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        
        for(char ch1 : str1.toCharArray()){
           if(map1.get(ch1)== 1){
               return ch1;
           }
        }
        
        return  '-';
     
    }
         
         public static void main(String[]args){
             String str1 = "ggeeskks";
            //  String str2 = "skeeg";
             
             
             System.out.print(Anagram(str1));
         }
    
}

