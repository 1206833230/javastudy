package cn.itcast.reflect.test;

public class NetCard implements PCI {

	@Override
	public void open() {
		// TODO �Զ����ɵķ������
		System.out.println("netCard run...");
	}

	@Override
	public void close() {
		// TODO �Զ����ɵķ������
		System.out.println("netCard close...");
	}

	
}
