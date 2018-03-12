package abstractfactorypattern;

public class SpinpointM8 implements  HardDisk{
	static int price = 350;
	public void modelShow() {
		System.out.println("电脑硬盘型号:三星Spinpoint M8（HN-M750MBB）");
	}
	public void moneyShow() {
		System.out.println("三星Spinpoint M8（HN-M750MBB）: 350");
	}

}
