package KopoBank2;
import java.util.Scanner;


public class BamiBank {
	public static void main(String[] args) {
		
		ExchangeSystem exchangeSystem = new ExchangeSystem();
		inputMoneyType inputMoney = new inputMoneyType();
		Print exchangePrint = new Print();
		ReturnMoney exchangeReturnMoney = new ReturnMoney();
		Change exchangeChange = new Change();
		
		
		
		
		while(true) {
		
		inputMoney.inputMoney();  //ȯ���� ��ȭ �� �ٲ� ȭ������ ���� �޼���
		if(inputMoney.type ==0) {
			break;
		}
		exchangeSystem.exchangeSystem(  inputMoney.inputWon, inputMoney.type);

		exchangePrint.Print( exchangeSystem.moneyText,exchangeSystem.exchangeRate, exchangeSystem.exchange, 
				exchangeSystem.returnMoney, exchangeSystem.returnWon);
		
		exchangeReturnMoney.returnMoney(  (int) exchangeSystem.exchangeRate , exchangeSystem.returnMoney, exchangeSystem.moneyText);
		
		exchangeChange.change(exchangeSystem.returnWon);
		
		
		
		
	break;
		}
		
		
		
		
		
	} //main end
}
