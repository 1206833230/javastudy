package abstractfactorypattern;

import java.util.Scanner;

/**
 * ���󹤳�ģʽ
 * ʹ�ó��󹤳�ģʽʵ�֡����������̵ꡱ��Ҫ�����£�
 * 1.������CPU�����塢�Կ����ڴ桢Ӳ�̵������϶��ɡ��ֵ����������������÷�����
 * 2.�������÷���������ʾ����������Ϣ��
 * �������÷���������ʾ�۸�
 * @author Jun Li
 * 2017��11��21��
 * ����7:58:05
 */
public class AbstractComputerConfigurationFactory {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("-------��ѡ���ʺ��������ã�-----");
		System.out.println("1-�߶�����  2-��ͨ����");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choose = scan.nextLine();
		if(choose.equals("1")){
			System.out.println("......���Ǹ߶����õĲ���......");
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
			System.out.println("�ܼۣ� "+(Inteli9.price+GeForceGTX1060GAMER.price+M9T2TB.price+PRIMEB250PRO.price+REG16GBDDR42133.price));
		}
		else if(choose.equals("2")){
			System.out.println("......������ͨ���õĲ���......");
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
			System.out.println("�ܼۣ� "+(Inteli7.price+iGame1050Ti.price+SpinpointM8.price+PRIMEB250MPLUS.price+REG8GBDDR4.price));
			
			
		}

	}

}
