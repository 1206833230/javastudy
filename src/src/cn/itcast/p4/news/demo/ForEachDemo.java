package cn.itcast.p4.news.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * foreach��䣺
		 * ��ʽ��
		 * for������ ���� ��Collection����|���飩{
		 * 
		 * }
		 * 
		 * ��ͳfor�͸߼�for������
		 * ��ͳfor������ɶ����ִ�кܶ�Σ���Ϊ���Զ������ѭ������ɾ��������
		 * 
		 * �߼�for��һ�ּ���ʽ��
		 * �������б����Ķ��󣬸�Ŀ��Ҫô�����飬Ҫô��Collection�������ϡ�
		 * 
		 * ������ı������������ȡ�������е�Ԫ�أ�����ʹ�ø߼�for��
		 * 
		 * ���Ҫ������Ǳ꽫���в�������ʹ�ô�ͳfor��
		 * 
		 * 
		 */
		List<String> list = new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		//ֻ���ڱ��� ����д
		for(String s: list) {
			System.out.println(s);
		}
		
		int[] arr = {3,1,5,7,4};
		for(int i : arr) {
			System.out.println(i);
		}
		
		//����ʹ�ø߼�for����map���ϣ�����ֱ��ʹ�ã����ǿ��Խ�mapת�ɵ�����Set���ȿ���ʹ����
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3, "zhangsna");
		map.put(1,"wangyi");
		map.put(7, "wangwu");
		map.put(4, "zhaosi");
		
		for(Integer key:map.keySet()) {
			String value = map.get(key);
			System.out.println(key+"::"+value);
		}
		for(Map.Entry<Integer,String> me: map.entrySet()) {
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::"+value);
		}
		
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		

	}

}
