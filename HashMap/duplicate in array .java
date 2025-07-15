import java.util.HashMap;

public class Main {
    public static int Anagram(int[] arr) {
        
        // if(str1.length()!= str2.length()){
        //     return false;
        // }
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        
        
        HashMap<Integer,Integer>map1 = new HashMap<>();
        // HashMap<Character,Integer>map2 = new HashMap<>();
        
        for(int ch1 : arr){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        
        for(int ch1 :arr){
           if(map1.get(ch1)== 2){
               return ch1;
           }
        }
        
        return  -1;
     
    }
         
         public static void main(String[]args){
             int []arr = {1,2,2,3,5};
            //  String str2 = "skeeg";
             
             
             System.out.print(Anagram(arr));
         }
    
}



