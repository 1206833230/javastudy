package cn.itcast.p1.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String����ص㣺
		 * �ַ�������һ������ʼ���Ͳ��ᱻ�ı䡣
		 * 
		 */
//		stringDemo1();
		stringDemo2();
	}
	public static void stringDemo2() {
		String s = "abc";//����һ���ַ����ڳ������С�
		String s1 = new String("abc");//������������һ��newһ���ַ��������ڶ��ڴ��С�
		System.out.println(s==s1);
		System.out.println(s.equals(s1));//false
		//string���е�equals��д��Object�е�equals����string���Լ��ж��ַ��������Ƿ���ͬ������
		//��ʵ���ǱȽ��ַ�������
	}
	/*
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ���������
	 */
	public static void stringDemo1() {
		String s = "abc";//"abc"�������ַ����������С�
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true?true
		System.out.println(s.equals(s1));
//		System.out.println("s="+s);

	}

}
