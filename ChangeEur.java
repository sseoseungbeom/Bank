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
		
		System.out.println("ȯ���Ͻ� ���� ����ȭ�Դϴ�.");
		System.out.println("ȯ���Ͻ� ���� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		myMoney = sc.nextInt();
		System.out.printf("ȯ���Ͻ� ���� %d�� �Դϴ�. \n", myMoney);
		
		System.out.printf("*****���� ȯ���� 1����ȭ�� %s�Դϴ�.****\n", eur);
		paybackEurMoney = myMoney/eur;
		resultExtra = (int) paybackEurMoney;
		System.out.printf("������ �ݾ��� %d ����ȭ�Դϴ�. \n", resultExtra);
		System.out.println("********�Ž����� �����***********\n");
		result2 =  (float) ((myMoney/eur)-resultExtra) ;
		System.out.printf("ȯ���� �ݾ��� %f ���Դϴ�. \n",  eur*result2);
		result3= (int) (eur*result2)/10*10;  //*1��������
		System.out.println("****************************\n");
		System.out.printf("%d ���Դϴ�. �����մϴ�. \n", result3);
		System.out.println("****************************");
		
	}
	
	
	
}
