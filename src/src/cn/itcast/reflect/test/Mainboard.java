package cn.itcast.reflect.test;

public class Mainboard {
	
	public void run() {
		
		System.out.println("My board run!");
		
	}
	public void usePCI(PCI p) {
		if(p != null) {
			p.open();
		    p.close();
		}
		
	}
}
