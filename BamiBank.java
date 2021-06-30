package KopoBank;
import java.util.Scanner;


public class BamiBank {
	public static void main(String[] args) {
		
		int selectChangeMoney = 0;
		
		ChangeUsd usd = new ChangeUsd();
		ChangeEur eur = new ChangeEur();
		ChangeJpy jpy = new ChangeJpy();
		Intro intro = new Intro();
		
		
		System.out.print("안녕하십니까 kopo은행입니다. \n");
		System.out.printf("환전하실 종류를 선택해주세요.  \n 1. USD 2. EUR 3. JPY  4.종료: %d \n",selectChangeMoney);
		
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
