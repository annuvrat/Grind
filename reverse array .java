
public class Main
{
    
    public static void reverse(int num[]){
        int first=0, end= num.length-1 ;
        
         while(first<end){
             
            int   temp = num[end];
             num[first] = num[end];
             temp = num[first];
               first++;
            end--;
             
         }
          
        
        
    }
	public static void main(String[] args) {
	    
	    int num[]= {2,3,4,5,7,8,9};
	    
	    reverse(num);
	   for(int i=0;i<num.length;i++){
	   System.out.print(num[i]+" ");
	        }
	        
	    
	    System.out.println();
	  
		
	}
}
