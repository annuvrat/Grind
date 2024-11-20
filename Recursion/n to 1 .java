
public class Main
{
    public static void recursion(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
            System.out.print(n+" ");
            recursion(n-1);
    }
	public static void main(String[] args) {
		int n= 10;
		recursion(n);
	}
}








