public class HelloJava 
{

	 public static void main(String[] args) {
	        
	        
		    
	        System.out.println("Last month Joe purchased some stock in Acme Software, Inc");
	        int shares = 1000;
	        System.out.println("The number of shares that Joe purchased : "+shares);
	        float perShare = 32.87f;
	        int stocksold=1000;
	        double sellprice=33.87;
	        int commperc=2;
	        double totalamount=32.87*1000;
	        System.out.println("the amount of money joe paid for stock " +totalamount );
	        double brokerper=totalamount*0.02;
	        System.out.println("the amount of money joe paid for his stock broker : "+brokerper);
	        double sell=1000*33.87;
	        System.out.println("the amount of money joe sold his stock : "+sell);
	        double aftersellbroker= sell*0.02;
	        System.out.println("the amount of money joe paid for his stock broker after sell : "+aftersellbroker);
	        double totalsell= (sell+aftersellbroker)-(totalamount+brokerper);
	        
	        System.out.println("profit or loss to joe is :  " +totalsell);

	
	 

	    }

	 

	}

