package KopoBank2;

import java.util.Scanner;

public class TotalCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countrymoney = 0;
		double n;  //ȯ���� �ݾ�
		double resultMoney;
		int resultExtra;
		float result2;
		int result3;
		float usd = (float) 1136.8;  // ��� EXCHANGE_RATE_USD �빮�ڷ� / �����տ� final �� �Ἥ �����س��� ���� �ִ�.
		float eur = (float) 1349.16;
		float jpy = (float) 10.26;
		double exchangeRate = 0;
		String selectedMoney = null;
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("�ȳ��Ͻʴϱ� kopo�����Դϴ�. \n");
		
		
		
		while(true) {
		
		System.out.printf("ȯ���Ͻ� ������ �������ּ���.  \n 1. USD 2. EUR 3. JPY  4.����: %d \n",countrymoney);
		countrymoney =myInput.nextInt();
		
	

		if(countrymoney == 4) {
			break;
		}
		System.out.print("ȯ���Ͻ� �ݾ��� �Է��ϼ���. : ");
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
		
		System.out.printf("ȯ���� ȭ��� %s�Դϴ�. \n ", selectedMoney);
		System.out.printf("*****1 %s �� %f���Դϴ�.****\n", selectedMoney, resultMoney );
		
		resultExtra = (int) resultMoney;
		System.out.printf("������ �ݾ��� %d �޷��Դϴ�. \n", resultExtra);
		System.out.println("********�Ž����� �����***********\n");
		result2 =  (float) ((n/exchangeRate)-resultExtra) ;
		System.out.printf("ȯ���� �ݾ��� %f ���Դϴ�. \n", exchangeRate*result2);
		result3= (int) (exchangeRate*result2)/10*10;  //*1��������
		System.out.println("****************************\n");
		System.out.printf("%d ���Դϴ�. �����մϴ�. \n", result3);
		System.out.println("****************************");
		
		switch(countrymoney) {
		case 1:
			System.out.println("\n$100 ���� " + (int) resultExtra / 100 + " ��");
			System.out.println("$50 ���� " + (int) resultExtra % 100 / 50 + " ��");
			System.out.println("$20 ���� " + (int) resultExtra % 100 % 50 / 20 + " ��");
			System.out.println("$10 ���� " + (int) resultExtra % 100 % 50 % 20 / 10 + " ��");
			System.out.println("$5 ���� " + (int) resultExtra % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("$1 ���� " + (int) resultExtra % 100 % 50 % 20 % 10 % 5 / 1 + " ��");			
		break;
		case 2:
			System.out.println("\n200���α� " + (int) resultExtra / 200 + " ��");
			System.out.println("100���α� " + (int) resultExtra % 200 / 100 + " ��");
			System.out.println("50���α� " + (int) resultExtra % 200 % 100 / 50 + " ��");
			System.out.println("20���α� " + (int) resultExtra % 200 % 100 % 50 / 20 + " ��");
			System.out.println("10���α� " + (int) resultExtra % 200 % 100 % 50 % 20 / 10 + " ��");
			System.out.println("5���α� " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("2���ε��� " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
			System.out.println("1���ε��� " + (int) resultExtra % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " ��");
		break;
		case 3:
			System.out.println("\n10000���� " + (int)resultExtra / 10000 + " ��");
			System.out.println("5000���� " + (int) resultExtra % 10000 / 5000 + " ��");
			System.out.println("2000���� " + (int) resultExtra % 10000 % 5000 / 2000 + " ��");
			System.out.println("1000���� " + (int) resultExtra % 10000 % 5000 % 2000 / 1000 + " ��");
			System.out.println("500������ " + (int) resultExtra % 10000 % 5000 % 2000 % 1000 / 500 + " ��");
			System.out.println("100������ " + (int) resultExtra % 10000 % 5000 % 2000 % 500 / 100 + " ��");
			System.out.println("50������ " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 / 50 + " ��");
			System.out.println("10������ " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " ��");
			System.out.println("1������ " + (int) resultExtra % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " ��");	
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
			
		System.out.printf("****�Ž����� �ܵ� %s %d �� ���󳻿��Դϴ�.***\n", selectedMoney, result3);
		System.out.printf("1000won :%d��\n", resultwon1000);
		System.out.printf("500won :%d��\n", resultwon500);
		System.out.printf("100won :%d��\n", resultwon100);
		System.out.printf("50won :%d��\n", resultwon50);
		System.out.printf("10won :%d��\n", resultwon10);
	}
}

}
