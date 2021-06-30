package KopoBank2;

public class ExchangeSystem {
	
	public final double usd = 1131.8;
	public final double eur = 1346.23;
	public final double jpy = 10.25;
	public double exchangeRate =0;
	public double exchange =0;
	public int returnMoney =0;
	public int returnWon =0;
	public String moneyText = null;
	
	public void exchangeSystem(double inputMoney, int type) {
		
		if(type==1) {
			moneyText="USD";
			exchangeRate = usd;
		}else if(type==2) {
			moneyText="EUR";
			exchangeRate =eur;
		}else {
			moneyText="JPY";
			exchangeRate= jpy;
		}
		
		exchange = inputMoney / exchangeRate;
		returnMoney = (int)exchange;
		exchange = exchange - returnMoney;
		returnWon = (int)(exchange* exchangeRate);
		returnWon = returnWon / 10*10;
		
		
	}
	
	
	
	
}
