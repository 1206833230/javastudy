package cn.itcast.p4.generic.define.demo;

public class GenericDemo5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		InterImpl in = new InterImpl();
		in.show("abc");
		
		InterImpl2<Integer> in2 = new InterImpl2<Integer>();
		in2.show(5);

	}

}
//���ͽӿڣ������Ͷ����ڽӿ���
interface Inter<T>{
	public void show(T t);
}

class InterImpl implements Inter<String>{
	public void show(String str) {
		System.out.println("show:"+str);
	}
}
class InterImpl2<Q> implements Inter<Q>{
	public void show(Q q) {
		System.out.println("show:"+q);
	}
}