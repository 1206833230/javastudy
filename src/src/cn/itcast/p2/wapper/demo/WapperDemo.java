package cn.itcast.p2.wapper.demo;
/**
 * 
 * @author Jun Li
 * 2018��1��4��
 * ����9:55:30
 */
public class WapperDemo {

	/*
	 * @param agrs
	 */
	public static void main(String[] args) {
		/*
		 * �����������Ͷ����װ�ࡣ
		 * Ϊ�˷����������������������ֵ�������װ���˶����ڶ����������Ժ���Ϊ�ḻ�˸����ݵĲ�����
		 * ���������ö������ͳ�Ϊ�����������Ͱ�װ�ࡣ
		 * 
		 * �ð�װ�����ڻ������ͺ��ַ���֮���ת����
		 * 
		 * ������������-->�ַ���
		 * 1.������������ֵ+����
		 * int long = parseLong("longstring")
		 * 2.��String���еľ�̬����ValueOf(������������)
		 * 3.��Integr�ľ�̬����valueOf(������������)
		 * 2.����ַ�����Integer���ж����װ��
		 *   ����ʹ����һ���Ǿ�̬������intValue������
		 *   ��һ��Integer����ת�ɻ�����������ֵ��
		 * 
		 */
//		int num;
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(-6));
//		int num1 = 4;//������ֵ
//		Integer i = new Integer(num1);//�����ݷ�װ�ɶ���
//		System.out.print(Integer.parseInt("123"+1));
		Integer i = new Integer("123");
		System.out.println(i.intValue());//������ת��Ϊ������������ֵ
		/*
		 * �����߱���ͬ����
		 * 
		 * ʮ����ת-->��������
		 * toBinaryString
		 * toOctalString
		 * toHexString
		 * toString
		 * ��������-->תʮ����
		 * parseInt
		 */
		//ʮ����ת-->��������
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.toString(60,16));
		//��������-->תʮ����
		System.out.println(Integer.parseInt("110",2));
		
		Integer a = new Integer("3");
		Integer b = new Integer(3);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
//		System.out.println(3>3);
		System.out.println(a.compareTo(b));
	}
}

