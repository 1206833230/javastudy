package cn.itcast.p1.otherapi.system;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		
		
		int year = 2019;
		
		showDays(year);
		
		

	}

	/**
	 * @param c
	 */
	public static void showDays(int year) {
		Calendar c = Calendar.getInstance();
		
		c.set(year, 2, 1);
		
		c.add(Calendar.DAY_OF_MONTH, -1);//ʱ��ƫ��
		
		showDate(c);
	}

	/**
	 * @param c
	 */
	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"��"+month+"��"+day+"��"+getWeek(week));
	}

	public static String getWeek(int i) {
		// TODO �Զ����ɵķ������
		
		String[] weeks = {"","������","����һ","���ڶ�","������","������","������","������"};
		
		
		return weeks[i];
	}

}
