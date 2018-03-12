package cn.itcast.p1.otherapi.system;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
		
		int year = 2019;
		
		showDays(year);
		
		

	}

	/**
	 * @param c
	 */
	public static void showDays(int year) {
		Calendar c = Calendar.getInstance();
		
		c.set(year, 2, 1);
		
		c.add(Calendar.DAY_OF_MONTH, -1);//时间偏移
		
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
		
		System.out.println(year+"年"+month+"月"+day+"日"+getWeek(week));
	}

	public static String getWeek(int i) {
		// TODO 自动生成的方法存根
		
		String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		
		return weeks[i];
	}

}
