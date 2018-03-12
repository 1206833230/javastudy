package cn.itcast.p2.toolclass.collection.demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import cn.itcast.p2.comparator.ComparatorByLength;


public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * Collections:是集合框架下的工具类。
		 * 里面的方法都是静态的。
		 * 
		 */
//		demo_1();
//		demo_2();
		demo_5();

	}
	private static void demo_5() {
		// TODO 自动生成的方法存根
List<String> list = new ArrayList<String>();
		
		list.add("ancbd");
		list.add("hjkh");
		list.add("jkjhbd");
		list.add("abd");
		list.add("adsbd");
		list.add("sad");
		list.add("xiaoqiang");
	
		
		System.out.println(list);
//		Collections.fill(list,"NBA");
		Collections.shuffle(list);//随机
		System.out.println(list);
	}
	private static void demo_4() {
		// TODO 自动生成的方法存根
		List<String> list = new ArrayList<String>();
		
		list.add("ancbd");
		list.add("hjkh");
		list.add("jkjhbd");
		list.add("abd");
		list.add("adsbd");
		list.add("sad");
		
		System.out.println(list);
		Collections.replaceAll(list,"abd","NBA");//set(indexOf("abd","NBA")
		System.out.println(list);
		
	}
	public static void demo_1() {
		List<String> list = new ArrayList<String>();
		
		list.add("ancbd");
		list.add("hjkh");
		list.add("jkjhbd");
		list.add("abd");
		list.add("adsbd");
		list.add("sad");
		System.out.println(list);
		
		//对list集合进行指定顺序的排序
//		Collections.sort(list);
//		mySort(list);
//		mySort_2(list,new ComparatorByLength());
		Collections.sort(list,new ComparatorByLength());
		System.out.println(list);
	}
	
	public static <T extends Comparable<? super T>> void mySort(List<T> list) {
		
		for(int i = 0; i < list.size(); i++) {
			for (int j = i+1; j<list.size(); j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					
//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
					Collections.swap(list,i,j);
					
					
				}
			}
		}
		
	}
public static <T> void mySort_2(List<T> list,Comparator<? super T> comp) {
		
		for(int i = 0; i < list.size(); i++) {
			for (int j = i+1; j<list.size(); j++) {
				if(comp.compare(list.get(i), list.get(j))>0) {
					
//					T temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
					Collections.swap(list,i,j);
					
					
				}
			}
		}
		
	}
public static void demo_2() {
	List<String> list = new ArrayList<String>();
	
	list.add("ancbd");
	list.add("hjkh");
	list.add("jkjhbd");
	list.add("abd");
	list.add("adsbd");
	list.add("sad");
//	System.out.println(list);
//	Collections.sort(list);
//	
//
//	System.out.println(list);
//	int index = Collections.binarySearch(list, "aaa");
	
//	System.out.println("index="+index);
	
	//获取最大值
	String max = Collections.max(list,new ComparatorByLength());
	System.out.println("max:"+max);
}
        public static void demo_3() {
//        	TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
//
//				@Override
//				public int compare(String o1, String o2) {
//					// TODO 自动生成的方法存根
//					int temp = o2.compareTo(o1);
//					
//					return temp;
//				}
//        		
//        	});
        	
        	TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));
        	ts.add("abc1");
        	ts.add("abc22");
        	ts.add("abc333");
        	ts.add("abc4444");
        	ts.add("abc55555");
        	System.out.println(ts);
        }
        

}
