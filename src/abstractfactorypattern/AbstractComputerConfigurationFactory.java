package abstractfactorypattern;

import java.util.Scanner;

/**
 * 抽象工厂模式
 * 使用抽象工厂模式实现“电脑配置商店”，要求如下：
 * 1.电脑由CPU、主板、显卡、内存、硬盘等配件组合而成。现电脑配置有两种配置方案。
 * 2.根据配置方案可以显示具体配置信息。
 * 根据配置方案可以显示价格。
 * @author Jun Li
 * 2017年11月21日
 * 下午7:58:05
 */
public class AbstractComputerConfigurationFactory {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("-------请选择适合您的配置！-----");
		System.out.println("1-高端配置  2-普通配置");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choose = scan.nextLine();
		if(choose.equals("1")){
			System.out.println("......这是高端配置的参数......");
			HighConfigurationactory  HighConfiguration = new HighConfigurationactory();
			HighConfiguration.getCPU("1");
			HighConfiguration.getCPU("1").moneyShow();
			HighConfiguration.getGraphicsCard("1").modelShow();
			HighConfiguration.getGraphicsCard("1").moneyShow();
			HighConfiguration.getHardDisk("1").modelShow();
			HighConfiguration.getHardDisk("1").moneyShow();
			HighConfiguration.getMotherBoard("1").modelShow();
			HighConfiguration.getMotherBoard("1").moneyShow();
			HighConfiguration.getMemory("1").modelShow();
			HighConfiguration.getMemory("1").moneyShow();
			System.out.println("总价： "+(Inteli9.price+GeForceGTX1060GAMER.price+M9T2TB.price+PRIMEB250PRO.price+REG16GBDDR42133.price));
		}
		else if(choose.equals("2")){
			System.out.println("......这是普通配置的参数......");
			LowConfigurationFactory lowConfiguration = new LowConfigurationFactory();
			lowConfiguration.getCPU("1");
			lowConfiguration.getCPU("1").moneyShow();
			lowConfiguration.getGraphicsCard("1").modelShow();
			lowConfiguration.getGraphicsCard("1").moneyShow();
			lowConfiguration.getHardDisk("1").modelShow();
			lowConfiguration.getHardDisk("1").moneyShow();
			lowConfiguration.getMotherBoard("1").modelShow();
			lowConfiguration.getMotherBoard("1").moneyShow();
			lowConfiguration.getMemory("1").modelShow();
			lowConfiguration.getMemory("1").moneyShow();
			System.out.println("总价： "+(Inteli7.price+iGame1050Ti.price+SpinpointM8.price+PRIMEB250MPLUS.price+REG8GBDDR4.price));
			
			
		}

	}

}
