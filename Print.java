package KopoBank2;

public class Print {

	
	
	
	 public void Print(String moneyText, double exchangeRate, double exchange, int returnMoney, int returnWon )
	 {
		 System.out.printf("%s 을(를) 선택하셨습니다. \n", exchange);
		 System.out.printf("현재 환율은 1 %s 에 1 %f 원입니다.\n", moneyText, exchangeRate);
	 }
}
