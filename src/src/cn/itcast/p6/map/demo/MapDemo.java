package cn.itcast.p6.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map<Integer,String> map = new HashMap<Integer,String>();
//		method(map);
		method_2(map);

	}
	
	public static void method_2(Map<Integer,String> map) {
		map.put(8, "wangwu");
		map.put(2, "zhaoliu");
//		map.put(7, "wangwu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		
		/*
		 * ͨ��Mapת��set�Ϳ��Ե�����
		 * �ҵ���һ��������entrySet
		 * �÷���������ֵ��ӳ���ϵ�����Set�����У������ӳ���ϵ�����;���Map.Entry���ͣ����֤����
		 */
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<Integer, String> me = it.next();
//			Integer key = me.getKey();
//			String value = me.getValue();
//			System.out.println(key+":::"+value);
//		}
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//ȡ��map�е�����Ԫ��
		//ԭ��ͨ��keyset������ȡmap�е����м������ڵ�set���ϣ�ͨ��set�ĵ�������ȡ��ÿһ������
		//�ڶ�ÿһ������ȡ��Ӧ��ֵ���ɡ�
		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		while(it.hasNext()) {
//			Integer key = it.next();
//			String value = map.get(key);
//			System.out.println(key+":"+value);
//		}
		
	}
	
	public static void method(Map<Integer,String> map) {//ѧ������
		//���Ԫ��
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xianqiang"));//wangcai ����ͬ����ֵ�Ḳ��
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");
		
		//ɾ��
//		System.out.println("remove:"+map.remove(2));
		
		//�ж�
//		System.out.println("containskey:"+map.containsKey(7));
		
		//��ȡ
//		System.out.println("get:"+map.get(6));
		
		System.out.println(map);
	}
	

}

