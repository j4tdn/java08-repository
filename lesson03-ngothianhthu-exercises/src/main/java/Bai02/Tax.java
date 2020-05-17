package Bai02;


public class Tax {
	public static final double SALE_RATE_PRICE_LESS_100 = 0.01;
	public static final double SALE_RATE_PRICE_FROM_100_TO_200 = 0.03;
	public static final double SALE_RATE_PRICE_GREAT_200 = 0.05;
	public static final double XYLANH_1=100;
	public static final double XYLANH_2=200;
	
	

	public static void export(Vehicle ...veh)
	{
		double money=0;
		for(int i=0;i<veh.length;i++) {
			double xylanh=veh[i].getXyLanh();
			double price=veh[i].getPrices();
		if(xylanh  < XYLANH_1)
		{
			
			money+=price*SALE_RATE_PRICE_LESS_100;
		}
		else if(XYLANH_1 < xylanh && xylanh<XYLANH_2) {
			money+=price*SALE_RATE_PRICE_FROM_100_TO_200;
		}
		else
		{
			money+=price*SALE_RATE_PRICE_GREAT_200;
		}
		}
		System.out.println(money);
	}




	

}
