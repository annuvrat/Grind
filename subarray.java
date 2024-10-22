

public class Main
{
    
    
    public static void array(int num[]){
        
        for(int i=0;i<num.length;i++){
            
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    
		int num[]= {2,3,4,5,6,8,9};
		array(num);
	}
}
