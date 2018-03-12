package abstractfactorypattern;

public class M9T2TB implements HardDisk{
	static int price = 700;
	
	public void modelShow() {
		System.out.println("电脑硬盘型号:三星M9T 2TB （HN-M201RAD）");
	}
	public void moneyShow() {
		System.out.println("三星M9T 2TB （HN-M201RAD）: 700");
	}

}
