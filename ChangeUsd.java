package KopoBank;

import java.util.Scanner;

public class ChangeUsd {

	static float usd = (float) 1136.8; 
	int myMoney;
	
	
	
	int resultExtra;
	float result2;
	int result3;
	double exchangeRate = 0;
	double paybackUsdMoney;


	
	public void ChangeUsd() {
		
		System.out.println("환전하실 돈은 달러입니다.");
		System.out.println("환전하실 돈을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		myMoney = sc.nextInt();
		System.out.printf("환전하실 돈은 %d원 입니다. \n", myMoney);
		
		System.out.printf("*****현재 환율은 1달러에 %s입니다.****\n", usd);
		paybackUsdMoney = myMoney/usd;
		resultExtra = (int) paybackUsdMoney;
		System.out.printf("받으실 금액은 %d 달러입니다. \n", resultExtra);
		System.out.println("********거스름돈 계산중***********\n");
		result2 =  (float) ((myMoney/usd)-resultExtra) ;
		System.out.printf("환전된 금액은 %f 원입니다. \n",  usd*result2);
		result3= (int) (usd*result2)/10*10;  //*1원없애줌
		System.out.println("****************************\n");
		System.out.printf("%d 원입니다. 감사합니다. \n", result3);
		System.out.println("****************************");
		
	}
	
	
}
