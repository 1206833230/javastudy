package cn.itcast.p1.otherapi.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ϰ��
 * "2018-3-17"��"2018-9-10"
 * �м��ж����죿
 * ˼·��
 * �������������Ŷ�ˡ�
 * զ���أ�
 * ����Ҫ���������Խ��м������������
 * �ܼ������Ǻ���ֵ����λ�ȡ����ֵ��ͨ��date����
 * ��λ�ȡdate�����أ�
 * ���Խ��ַ���ת��date����
 * 
 * 1.�����ڸ�ʽ���ַ���ת��Date����
 * 2.��Date����ת�ɺ���ֵ
 * 3.������ڱ������
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO �Զ����ɵķ������
		String str_date2 = "2018-9-9";
		String str_date1 = "2018-12-10";
		test(str_date1,str_date2);

	}

	public static void test(String str_date1,String str_date2) throws ParseException {
		// TODO �Զ����ɵķ������
		
		//1.�������ַ���ת�����ڶ���
		//�������ڸ�ʽ����
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		long time = Math.abs(time2-time1);
		
		int day = getDay(time);
		
		System.out.println(day);
		
	}

	private static int getDay(long time) {
		// TODO �Զ����ɵķ������
		int day = (int)(time/1000/60/60/24);
		return day;
	}

}
