package abstractfactorypattern;

public class PRIMEB250MPLUS implements MotherBoard{
	static int price = 650;
	public void modelShow() {
		System.out.println(" 电脑主板型号：华硕（ASUS）PRIME B250M-PLUS 主板（Intel B250/LGA 1151）");
	}
	public void moneyShow() {
		System.out.println("华硕（ASUS）PRIME B250M-PLUS 主板（Intel B250/LGA 1151）：650");	
	}

}
