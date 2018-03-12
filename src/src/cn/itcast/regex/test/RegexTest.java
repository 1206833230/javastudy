package cn.itcast.regex.test;

import java.util.TreeSet;

public class RegexTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		/*
		 * ���ƿڳԣ� �����ҡ����������ҡ��������ҡ��������ҡ��������ҡ������ҡ���
		 * Ҫ������ҪҪ����ҪҪҪ������ҪҪҪҪ����ѧѧѧѧ����ѧѧѧ����ѧѧ����
		 * �����ࡣ��������ࡣ������
		 * �̡̳̳̳������̡̳̳̳����̡̳̳����̡̳̳��������̡̳�
		 */
		text_3();
	}

	public static void text_3() {
		// TODO �Զ����ɵķ������
		
		String mail = "abb@sina.com";
		
		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3})+";
		
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
		
		boolean b = mail.matches(regex);
		
		System.out.println(mail+"::"+b);
	}

	/*
	 * ip��������
	 * 
	 * 192.168.10.34
	 * 127.0.0.1
	 * 3.3.3.3
	 * 105.70.11.55
	 */
	public static void text_2() {
		// TODO �Զ����ɵķ������
		String ip_str = "192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55";
		
		//1.Ϊ����IP���԰����ַ���˳��Ƚϣ�ֻҪ��ip��ÿһ�ε�λ����ͬ��
		//���ԣ����㣬����ÿһ���������λ����0���䡣ÿһ�ζ�������0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
		
		System.out.println(ip_str);
		
		//ÿһ�α�������3λ��
		ip_str = ip_str.replaceAll("0*(\\d{3})","$1");
		System.out.println(ip_str);
		
		//1.��ip��ַ�г���
		String[] ips = ip_str.split(" +");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String ip: ips) {
			ts.add(ip);
		}
		
		for(String ip : ts) {
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
	}

	public static void text_1() {
		// TODO �Զ����ɵķ������
		String str = "�����ҡ����������ҡ��������ҡ��������ҡ��������ҡ������ҡ���Ҫ������ҪҪ����ҪҪҪ������ҪҪҪҪ����ѧѧѧѧ����ѧѧѧ����ѧѧ�����̡̳̳̳��������ࡣ������ࡣ������ࡣ���̡̳̳̳̳����̡̳̳����̡̳̳��������̡̳�";
		
		//1.���ַ�����ȥ�������滻��
		str = str.replaceAll("��", "");
		System.out.println(str);
		
		
		//2.�滻����
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
		
	}

}
