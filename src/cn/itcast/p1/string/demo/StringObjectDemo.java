package cn.itcast.p1.string.demo;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		String s1 = "abc";
//		String s2 = "abc";
		//intern();���ַ����ؽ��в�����
		String s1 = new String("abc");//����һ��������String����
		String s2 = s1.intern();//��ȡ���еĶ���
		
		System.out.print(s1==s2);
	}

}
