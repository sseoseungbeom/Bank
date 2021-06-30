package KopoBank2;

import java.util.Scanner;

public class inputMoneyType {

	
	public double inputWon =0;
	public int type =0;
	
	
	public void inputMoney() {
		
		System.out.println("안녕하세요 bami bank입니다. ");
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력해주세요. : ");
		
		inputWon = sc.nextDouble();
		System.out.println("환전할 화폐 종류를 선택해주세요!");
		System.out.println("1. USD 2. EUR 3. JPY");
		
		type = sc.nextInt();
	}
	
}
