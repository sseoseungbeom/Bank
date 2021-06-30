package KopoBank2;

import java.util.Scanner;

public class TotalCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countrymoney = 0;
		double n;  //환전할 금액
		double resultMoney;
		int resultExtra;
		float result2;
		int result3;
		float usd = (float) 1136.8;  // 상수 EXCHANGE_RATE_USD 대문자로 / 변수앞에 final 을 써서 고정해놓을 수도 있다.
		float eur = (float) 1349.16;
		float jpy = (float) 10.26;
		double exchangeRate = 0;
		String selectedMoney = null;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("안녕하십니까 kopo은행입니다. \n");
		
		
		
		while(true) {
		
		System.out.printf("환전하실 종류를 선택해주세요.  \n 1. USD 2. EUR 3. JPY  4.종료: %d \n",countrymoney);
		countrymoney =myInput.nextInt();
		
	

		if(countrymoney == 4) {
			break;
		}
		System.out.print("환전하실 금액을 입력하세요. : ");
		n =myInput.nextDouble();
		
		switch(countrymoney) {
		case 1 :
			selectedMoney = "USD";
			exchangeRate = usd;
			break;
		case 2:
			selectedMoney = "eur";
			exchangeRate = eur;
		case 3:
			selectedMoney = "jpy";
			exchangeRate = jpy;
		
				
} //

		resultMoney = n/exchangeRate;
		
		System.out.printf("환전할 화폐는 %s입니다. \n ", selectedMoney);
		System.out.printf("*****1 %s 에 %f원입니다.****\n", selectedMoney, resultMoney );
		
		resultExtra = (int) resultMoney;
		System.out.printf("받으실 금액은 %d 달러입니다. \n", resultExtra);
		System.out.println("********거스름돈 계산중***********\n");
		result2 =  (float) ((n/exchangeRate)-resultExtra) ;
		System.out.printf("환전된 금액은 %f 원입니다. \n", exchangeRate*result2);
		result3= (int) (exchangeRate*result2)/10*10;  //*1원없애줌
		System.out.println("****************************\n");
		System.out.printf("%d 원입니다. 감사합니다. \n", result3);
		System.out.println("****************************");
		
		switch(countrymoney) {
		case 1:
			System.out.println("\n$100 지폐 " + (int) resultExtra / 100 + " 장");
			System.out.println("$50 지폐 " + (int) resultExtra % 100 / 50 + " 장");
			System.out.println("$20 지폐 " + (int) resultExtra % 100 % 50 / 20 + " 장");
			System.out.println("$10 지폐 " + (int) resultExtra % 100 % 50 % 20 / 10 + " 장");
			System.out.println("$5 지폐 " + (int) resultExtra % 100 % 50 % 20 % 10 / 5 + " 장");
			System.out.println("$1 지폐 " + (int) resultExtra % 100 % 50 % 20 % 10 % 5 / 1 + " 장");			
		break;
		case 2:
			System.out.println("\n200유로권 " + (int) resultExtra / 200 + " 장");
			System.out.println("100유로권 " + (int) resultExtra % 200 / 100 + " 장");
			System.out.println("50유로권 " + (int) resultExtra % 200 % 100 / 50 + " 장");
			System.out.println("20유로권 " + (int) resultExtra % 200 % 100 % 50 / 20 + " 장");
			System.out.println("10유로권 " + (int) resultExtra % 200 % 100 % 50 % 20 / 10 + " 장");
			System.out.println("5유로권 " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 / 5 + " 장");
			System.out.println("2유로동전 " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
			System.out.println("1유로동전 " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " 개");
		break;
		case 3:
			System.out.println("\n10000엔권 " + (int)resultExtra / 10000 + " 장");
			System.out.println("5000엔권 " + (int) resultExtra % 10000 / 5000 + " 장");
			System.out.println("2000엔권 " + (int) resultExtra % 10000 % 5000 / 2000 + " 장");
			System.out.println("1000엔권 " + (int) resultExtra % 10000 % 5000 % 2000 / 1000 + " 장");
			System.out.println("500엔동전 " + (int) resultExtra % 10000 % 5000 % 2000 % 1000 / 500 + " 개");
			System.out.println("100엔동전 " + (int) resultExtra % 10000 % 5000 % 2000 % 500 / 100 + " 개");
			System.out.println("50엔동전 " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 / 50 + " 개");
			System.out.println("10엔동전 " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " 개");
			System.out.println("1엔동전 " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " 개");	
			break;
		}
		int resultwon1000;
		int resultwon500;
		int resultwon100;
		int resultwon50;
		int resultwon10;
		
		resultwon1000 = result3 / 1000;
		result3 = result3 - resultwon1000 * 1000;
		resultwon500 = result3 / 500;
		result3 = result3 - resultwon500 * 500;		
		resultwon100 = result3 / 100;
		result3 = result3 - resultwon100 * 100;	
		resultwon50 = result3 / 50;
		result3 = result3 - resultwon50 * 50;
		resultwon10 = result3 / 10;
		result3 = result3 - resultwon10 * 10;
			
		System.out.printf("****거슬러진 잔돈 %s %d 의 지폐내역입니다.***\n", selectedMoney, result3);
		System.out.printf("1000won :%d장\n", resultwon1000);
		System.out.printf("500won :%d장\n", resultwon500);
		System.out.printf("100won :%d장\n", resultwon100);
		System.out.printf("50won :%d장\n", resultwon50);
		System.out.printf("10won :%d장\n", resultwon10);
	}
}

}
