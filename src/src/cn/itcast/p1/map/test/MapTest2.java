package cn.itcast.p1.map.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * map��������ӳ���ϵʱ���������ȿ��ǡ�
		 * �ڲ����Ӧ�ý�Ϊ�����
		 */
		String week = getWeek(1);
		System.out.println(week);
		
		System.out.println(getWeekByMap(week));

	}
	public static String getWeekByMap(String week) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("����һ", "Mon");
		map.put("���ڶ�", "Tus");
		map.put("������", "Wes");
		map.put("������", "Sun");
		map.put("������", "Sun");
		
		return map.get(week);
	}
	public static String getWeek(int week) {
		if(week<1 || week>7)
			throw new RuntimeException("û�ж�Ӧ�����ڣ�������������");
		String[] weeks = {"","����һ","���ڶ�"};
		return weeks[week];
	}

}
