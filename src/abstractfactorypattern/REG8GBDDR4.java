package abstractfactorypattern;

public class REG8GBDDR4 implements Memory{
	static int price = 800;
	public void modelShow() {
		System.out.println("电脑内存型号：三星REG 8GB DDR4 2133 1R*4");
	}
	public void moneyShow() {
		System.out.println("三星REG 8GB DDR4 2133 1R*4: 800");
	}

}
