package cn.itcast.p2.wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * �����������Ͱ�װ�ࣺ
		 * Ϊ�˷������������������ֵ�������װ���˶����ڶԶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ�����
		 * ���������ö�������Ϊ�����������Ͱ�װ�ࡣ
		 * byte    Byte
		 * short   Short
		 * int     Integer
		 * long    Long 
		 * float   Float
		 * double  Double
		 * char    Character
		 * boolean Boolean
		 * �ð�װ������Ҫ���ڻ������ͺ��ַ���֮���ת����
		 * �������ͣ�
		 * 1.����������ֵ+����
		 * 2.��string���еľ�̬����valueOf��������������ֵ����
		 * �ַ���----��������������
		 * 1. ʹ�ð�װ���еľ�̬����xxx parseXxx����xxx�����ַ�������
		 * int parseInt����intstring����
		 * long parseLong("longstring")
		 * boolean parseBoolean("booleanString����
		 * ֻ��characterû��parse����
		 * 2.��������ַ�����Integer���ж���ķ�װ
		 * ����ʹһ���Ǿ�̬������intValue������
		 * ��һ��Integer����ת��Ϊ������������ֵ��
		 */
//		int num ;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));//ȡ�����
//		Integer i = new Integer(5);
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123abc")+1);
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());
		/*
		 * �����߱���ͬ����ת�������֡�
		 * ʮ���� ---ת---�������ƣ�
		 * parse("string",���ƣ�
		 * ��������---ת---ʮ����
		 * 
		 */
		//
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toString(60,4));
		System.out.println(Integer.parseInt("110",10));
		System.out.println(Integer.parseInt("110",2));
		System.out.println(Integer.parseInt("110",16));
		Integer i = new Integer("3");
		Integer j = new Integer(3);
		System.out.println(i==j);
		System.out.println(i.equals(j));
		System.out.println(3>3);
		System.out.println(i.compareTo(j));

	}

}
