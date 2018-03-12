package cn.itcast.p6.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		 * 通过Map转成set就可以迭代。
		 * 找到另一个方法。entrySet
		 * 该方法将键和值的映射关系储存袋Set集合中，而这个映射关系的类型就是Map.Entry类型（结婚证）。
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
		//取出map中的所有元素
		//原理，通过keyset方法获取map中的所有键的所在的set集合，通过set的迭代器获取到每一个键。
		//在对每一个键获取相应的值即可。
		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		while(it.hasNext()) {
//			Integer key = it.next();
//			String value = map.get(key);
//			System.out.println(key+":"+value);
//		}
		
	}
	
	public static void method(Map<Integer,String> map) {//学号姓名
		//添加元素
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xianqiang"));//wangcai 存相同键，值会覆盖
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");
		
		//删除
//		System.out.println("remove:"+map.remove(2));
		
		//判断
//		System.out.println("containskey:"+map.containsKey(7));
		
		//获取
//		System.out.println("get:"+map.get(6));
		
		System.out.println(map);
	}
	

}

