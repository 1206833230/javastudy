/**
 * 
 */
package cn.itcast.p1.string.demo;

/**
 * @author Jun Li
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * String����ص㣺
		 * �ַ��ܶ���һ������ʼ���Ͳ��ᱻ�ı䡣
		 * ����о�ֱ�ӻ�ȡ��ַ��û�вŴ���
		 */
		stringdemo1();
		stringdemo2();
		
	}

	private static void stringdemo2() {
		// TODO �Զ����ɵķ������
		String s = "abc";//�ַ��������ش���һ���ַ���
		String s1 = new String("abc");//����������������һ��newһ���ַ����ڶ��ڴ�
		System.out.println(s1==s);//false
		System.out.println(s.equals(s1));//string���е�equals�Ǹ�д ��Object�е�equals������string���Լ��ж��ַ��������Ƿ���ͬ�����ݡ�
		//equals�Ƚϵ����ַ��������ݲ��ǵ�ַ
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		
	}

	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ��������ص��ص㡣
	 */
	private static void stringdemo1() {
		String s = "abc";//"abc"�洢���ַ�����������
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true?
//		System.out.println("s="+s);
	}

}
