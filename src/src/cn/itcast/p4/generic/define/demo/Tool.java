package cn.itcast.p4.generic.define.demo;


//public class Tool {
//	
//	private Object object;
//
//	public Object getObject() {
//		return object;
//	}
//
//	public void setObject(Object object) {
//		this.object = object;
//	}
//
//}
/*
 * ��jdk1.5��ʹ�÷�������������Ҫ������������������
 * �����ࡣ�Զ��巺���ࡣʲôʱ���ã�������Ҫ���������ò�ȷ����ʱ�򡣾����÷����ࡣ
 */
public class Tool<QQ>{
	private QQ q;

	public QQ getObject() {
		return q;
	}

	public void setObject(QQ Object) {
		this.q = Object;
	}
	/*
	 * �����Ͷ����ڷ�����
	 */

	public <w> void show(w str) {
		System.out.println("show:"+str.toString());
	}
	public void print(QQ str) {
		System.out.println("print:"+str);
	}
	/*
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��͡�
	 * ֻ�ܽ����Ͷ����ڷ����ϡ�
	 */
	public static <Y> void method(Y obj) {
		System.out.println("method"+obj);
	}
}