package cn.itcast.p1.otherapi.system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO �Զ����ɵķ������
		
		methodDemo_3();

	}
	 /* 
	  * �����ڸ�ʽ���ַ���-->���ڶ���
	  * ʹ��DateFormat���е�
	  */
	public static void methodDemo_3() throws ParseException {
		// TODO �Զ����ɵķ������
		
//		String str_date = "2018-1-19";
//		String str_date = "2018��1��19��";
		String str_date = "2018---1---19";
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
		
		
	}
	/**
	 * �����ڶ�����и�ʽ��
	 * �����ڶ���-->���ڸ�ʽ���ַ���
	 * ʹ�õ���DateFormat���е�format������
	 * 
	 */

	@SuppressWarnings("unused")
	private static void methodDemo_2() {
		// TODO �Զ����ɵķ������
		Date date = new Date();
		
		
		//��ȡ���ڸ�ʽ���󣬾�����Ĭ�ϵķ��FULL LONG�ȿ���ָ�����
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//		System.out.println(dateFormat);
		
		//������ȡ�Զ����ʱ���ʽ
		
		dateFormat = new SimpleDateFormat("yyyy--MM--dd");
		
		String str_date = dateFormat.format(date);
		
		System.out.println(str_date);
	}


}
