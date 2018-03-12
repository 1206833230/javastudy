package abstractfactorypattern;

public class Inteli7 implements CPU{
	static int price = 7500;
	public void modelShow() {
		System.out.println("CPU型号：Inteli7");
	}
	public void moneyShow() {
		System.out.println("Intel 酷睿i7 6900K 价格：7500元");
	}

}
