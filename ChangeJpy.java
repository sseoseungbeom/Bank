package KopoBank;

import java.util.Scanner;

public class ChangeJpy {

	float jpy = (float) 10.26;
	int myMoney;
	
	
	
	int resultExtra;
	float result2;
	int result3;
	double exchangeRate = 0;
	double paybackJpyMoney;


	
	public void ChangeJpy() {
		
		System.out.println("ȯ���Ͻ� ���� ����ȭ�Դϴ�.");
		System.out.println("ȯ���Ͻ� ���� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		myMoney = sc.nextInt();
		System.out.printf("ȯ���Ͻ� ���� %d�� �Դϴ�. \n", myMoney);
		
		System.out.printf("*****���� ȯ���� 1����ȭ�� %s�Դϴ�.****\n", jpy);
		paybackJpyMoney = myMoney/jpy;
		resultExtra = (int) paybackJpyMoney;
		System.out.printf("������ �ݾ��� %d ����ȭ�Դϴ�. \n", resultExtra);
		System.out.println("********�Ž����� �����***********\n");
		result2 =  (float) ((myMoney/jpy)-resultExtra) ;
		System.out.printf("ȯ���� �ݾ��� %f ���Դϴ�. \n",  jpy*result2);
		result3= (int) (jpy*result2)/10*10;  //*1��������
		System.out.println("****************************\n");
		System.out.printf("%d ���Դϴ�. �����մϴ�. \n", result3);
		System.out.println("****************************");
		
	}
	
	
	
}
