package KopoBank;

import java.util.Scanner;

public class ChangeEur {

	
	static float eur = (float) 1349.16;
	int myMoney;
	
	
	
	int resultExtra;
	float result2;
	int result3;
	double exchangeRate = 0;
	double paybackEurMoney;


	
	public void ChangeEur() {
		
		System.out.println("환전하실 돈은 유로화입니다.");
		System.out.println("환전하실 돈을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		myMoney = sc.nextInt();
		System.out.printf("환전하실 돈은 %d원 입니다. \n", myMoney);
		
		System.out.printf("*****현재 환율은 1유로화에 %s입니다.****\n", eur);
		paybackEurMoney = myMoney/eur;
		resultExtra = (int) paybackEurMoney;
		System.out.printf("받으실 금액은 %d 유로화입니다. \n", resultExtra);
		System.out.println("********거스름돈 계산중***********\n");
		result2 =  (float) ((myMoney/eur)-resultExtra) ;
		System.out.printf("환전된 금액은 %f 원입니다. \n",  eur*result2);
		result3= (int) (eur*result2)/10*10;  //*1원없애줌
		System.out.println("****************************\n");
		System.out.printf("%d 원입니다. 감사합니다. \n", result3);
		System.out.println("****************************");
		
	}
	
	
	
}
