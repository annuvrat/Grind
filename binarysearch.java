
public class Main
{
    
    public static int binary(int num[],int key){
        int start=0, end= num.length-1 ;
        
        while(start<=end){
            int mid = (start + end)/2;
            
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end =mid-1;
            }    
            
        }
        return -1;
    }
	public static void main(String[] args) {
	    
	    int num[]= {2,3,4,5,7,8,9};
	    int key = 3;
	    System.out.println("index is " + binary(num,key));
		
	}
}
