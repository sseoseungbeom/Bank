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
		
		System.out.println("ȯ���Ͻ� ���� �޷��Դϴ�.");
		System.out.println("ȯ���Ͻ� ���� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		myMoney = sc.nextInt();
		System.out.printf("ȯ���Ͻ� ���� %d�� �Դϴ�. \n", myMoney);
		
		System.out.printf("*****���� ȯ���� 1�޷��� %s�Դϴ�.****\n", usd);
		paybackUsdMoney = myMoney/usd;
		resultExtra = (int) paybackUsdMoney;
		System.out.printf("������ �ݾ��� %d �޷��Դϴ�. \n", resultExtra);
		System.out.println("********�Ž����� �����***********\n");
		result2 =  (float) ((myMoney/usd)-resultExtra) ;
		System.out.printf("ȯ���� �ݾ��� %f ���Դϴ�. \n",  usd*result2);
		result3= (int) (usd*result2)/10*10;  //*1��������
		System.out.println("****************************\n");
		System.out.printf("%d ���Դϴ�. �����մϴ�. \n", result3);
		System.out.println("****************************");
		
	}
	
	
}
