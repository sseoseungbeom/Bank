package KopoBank2;

import java.util.Scanner;

public class inputMoneyType {

	
	public double inputWon =0;
	public int type =0;
	
	
	public void inputMoney() {
		
		System.out.println("�ȳ��ϼ��� bami bank�Դϴ�. ");
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ա��� �ݾ��� �Է����ּ���. : ");
		
		inputWon = sc.nextDouble();
		System.out.println("ȯ���� ȭ�� ������ �������ּ���!");
		System.out.println("1. USD 2. EUR 3. JPY");
		
		type = sc.nextInt();
	}
	
}
