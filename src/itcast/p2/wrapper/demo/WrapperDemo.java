package cn.itcast.p2.wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �����������Ͷ����װ�ࡣ
		 * Ϊ�˷�����������ֵ�������װ�ɶ����ڶ����ж��������Ժ���Ϊ�ḻ�����ݵĲ�����
		 * ����������������Ϊ�������ݶ����װ�ࡣ
		 * byte Byte
		 * short Short
		 * int Integer
		 * long Long
		 * float Float
		 * double Double
		 * char Character
		 * boolean Boolean
		 * 
		 * �ð�װ������Ҫ���ڻ����������͵��ַ���֮���װ����
		 * 
		 * ������������--���ַ���
		 *    1.����������ֵ+����
		 *    2.��String���еľ�̬����valueOf��������������)
		 * �ַ���--����������
		 * 1.
		 * 
		 */
//		int num;
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));
//		int num1 = 4;
//		Integer i = new Integer(5);
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123abc")+1);
//		Integer i = new Integer("123");
//		System.out.println(i.intValue(i));
		/*
		 * ����������ͬ�Ľ���
		 * ʮ���� ת �������� 
		 * �������� ת ʮ����
		 * parseInt("string",���ƣ�
		 * 
		 */
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.toString(60,16));
		System.out.println(Integer.parseInt("3c",16));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));

	}

}
