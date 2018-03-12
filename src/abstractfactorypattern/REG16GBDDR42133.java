package abstractfactorypattern;

public class REG16GBDDR42133 implements Memory{
	static int price = 1400;
	public void modelShow() {
		System.out.println("电脑内存型号：三星REG 16GB DDR4 2133 2R*4");
	}
	public void moneyShow() {
		System.out.println("三星REG 16GB DDR4 2133 2R*4: 1400");
	}

}
