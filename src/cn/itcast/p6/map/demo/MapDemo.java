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
	public static void method_2(Map<Integer,String>map) {
		map.put(8, "wangwu");
		map.put(2, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6,"wangcai");
		
		Collection<String>  values = map.values();
		
		Iterator<String> it_1 = values.iterator();
		while(it_1.hasNext()) {
			System.out.println(it_1.next());
		}
		
		
		/**
		 * ͨ��Mapת��Set�Ϳ��Ե�����
		 * �ҵ���һ��������entrySet��
		 * �÷���������ֵ��ӳ���ϵ��Ϊ���󴢴浽Set�����У������ӳ���ϵ�����;���Map.entrySet();
		 * 
		 */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			Integer key  = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::::"+value);
			
		}
		//ȡ��map�е�����Ԫ�ء�
		//ԭ��ͨ��keySet������ȡ���еļ����ڵ�Set���ϣ�ͨ��Set�ĵ�����ȡ��ÿһ������
		//�� ��ÿһ������ȡ��Ӧ��֮���ɡ�
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		while(it.hasNext()) {
//			Integer key = it.next();
//			String value = map.get(key);
//			System.out.println(key+":"+value);
//		}
	}
	public static void method (Map<Integer,String>map) {//ѧ��������
		//���Ԫ��
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xiaoqiang"));//wangcai ����ͬ����ֵ�Ḳ��
		map.put(2, "zhangsan");
		map.put(7,"zhaoliu");
		System.out.println(map);
		//ɾ��
		System.out.println("remove:"+map.remove(2));
		//�ж�
		System.out.println("contains:"+map.containsKey(7));
		//��ȡ
		System.out.println("get:"+map.get(8));
		System.out.println(map);
		Outer.Inner.show();
	}
}
interface MyMap{
	interface MyEntry{//�ڲ��ӿ�
		void get();
	}
}
class MyDemo implements MyMap.MyEntry{
	public void get() {}
}
class Outer{
	static class Inner{
		 static void show() {
			System.out.println("haha");
		}
	}
}
