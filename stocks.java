
public class Main
{  public static int stocks(int prices[]){
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    
    for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit = prices[i]- buyprice;
            
        
            maxprofit= Math.max(maxprofit,profit);
           } else{
                buyprice = prices[i];
            }
        
    }
    return maxprofit;
    
}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int prices[]={7,3,5,7,8,4,7,999};
		System.out.print(stocks(prices));
	}
}
