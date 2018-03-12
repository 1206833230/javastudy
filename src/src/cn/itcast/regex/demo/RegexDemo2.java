package cn.itcast.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*
		 * ������ʽ���ַ����ĳ���������
		 * 1.ƥ�䡣
		 *    ��ʵʹ�õľ���String���е�matches������
		 * 2.�и
		 *     ��ʵ�����ַ���split������
		 * 3.�滻��
		 *     ��ʵʹ�õľ���String���е�replaceAll������
		 * 4.��ȡ��
		 */
		functionDemo_4();

	}
	/*
	 * ��ȡ��
	 * //�����������ж���ķ�װ��
	 * Pattern p = Pattern.compile("a*b");
	 * //ͨ����������matcher�����ַ������������ȡҪ���ַ���������ƥ�����Matcher��
	 * Matcher m = p.matcher("aaaac");
	 *  //ͨ��Matcherƥ��������ķ������ַ���������
	 *  boolean b = m.matchers();
	 */
	public static void functionDemo_4() {
		// TODO �Զ����ɵķ������
		
		String str = "da jia hao,ming tian bu fang jia!";
		
		String regex = "\\b[a-z]{3}\\b";
		
		//1.�������װ�ɶ���
		Pattern p = Pattern.compile(regex);
		
		//2.ͨ����������ȡƥ��������
		Matcher m = p.matcher(str);
		
		//ʹ��Matcher����ķ������ַ������в�����
		//��ȻҪ��ȡ������ĸ��ɵĵ��ʡ�
		//���ҡ�find();
		System.out.println(str);
		while(m.find()) {
			System.out.println(m.group());
			
			System.out.println(m.start()+"::"+m.end());
		}
		
		
	}
	public static void functionDemo_3() {
		// TODO �Զ����ɵķ������
//		String str = "zhangsantttttxiaoqingnnnnnnzhaoliu";
//		
//		str = str.replaceAll("(.)\\1+", "$1");
//		
//		System.out.println(str);
//		
		String tel = "15846541111";//158******1111
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		
		System.out.println(tel);
	}
	/*
	 * �и
	 * �飺����A����B��C������
	 */
	public static void functionDemo_2() {
		// TODO �Զ����ɵķ������
		String str = "zhangsantttttxiaoqingnnnnnnzhaoliu";
		String[] names = str.split("(.)\\1+");//str.split(" +");
		for(String name : names){
			System.out.println(name);
			
		}
	}
	/*
	 * ��ʾƥ��
	 */

	public static void functionDemo_1() {
		//ƥ���ֻ����Ƿ���ȷ��
		String tel = "15096675243";
		
		String regex = "1[358]\\d{9}";
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":"+b);
	}
}
