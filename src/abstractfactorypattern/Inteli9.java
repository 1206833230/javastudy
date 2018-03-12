package abstractfactorypattern;

public class Inteli9 implements CPU{
	static int price = 16000;
	public void modelShow() {
		System.out.println("CPU型号：Inteli9");
	}
	public void moneyShow() {
		System.out.println("Intel 酷睿i9 7980XE 价格：16000元");
	}

}
