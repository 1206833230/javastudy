package cn.itcast.p1.string.demo;

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intern();���ַ����ؽ��в���
		String s1 =  new String("abc");
		String s2 = s1.intern();
		System.out.println(s1==s2);

	}

}
