package KopoBank;
import java.util.Scanner;


public class BamiBank {
	public static void main(String[] args) {
		
		int selectChangeMoney = 0;
		
		ChangeUsd usd = new ChangeUsd();
		ChangeEur eur = new ChangeEur();
		ChangeJpy jpy = new ChangeJpy();
		Intro intro = new Intro();
		
		
		System.out.print("�ȳ��Ͻʴϱ� kopo�����Դϴ�. \n");
		System.out.printf("ȯ���Ͻ� ������ �������ּ���.  \n 1. USD 2. EUR 3. JPY  4.����: %d \n",selectChangeMoney);
		
		Scanner sc = new Scanner(System.in);
		selectChangeMoney = sc.nextInt();
	
		
		
		if(selectChangeMoney==1) {
			usd.ChangeUsd();
		}//if end
		if(selectChangeMoney==2) {
			eur.ChangeEur();
		}if(selectChangeMoney==3) {
			jpy.ChangeJpy();
		}
		
		
		
		
		
	} //main end
}
