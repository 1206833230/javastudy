package cn.itcast.p1.map.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * map集合再有映射关系时，可以优先考虑。
		 * 在查表法中应用较为多见。
		 */
		String week = getWeek(1);
		System.out.println(week);
		
		System.out.println(getWeekByMap(week));

	}
	public static String getWeekByMap(String week) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("星期一", "Mon");
		map.put("星期二", "Tus");
		map.put("星期三", "Wes");
		map.put("星期日", "Sun");
		map.put("星期天", "Sun");
		
		return map.get(week);
	}
	public static String getWeek(int week) {
		if(week<1 || week>7)
			throw new RuntimeException("没有对应的星期，请您重新输入");
		String[] weeks = {"","星期一","星期二"};
		return weeks[week];
	}

}
