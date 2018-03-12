package cn.itcast.p1.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 练习：
 * “djaldsalallakhkdjgakls”获取该字符串中，每个字母出现的次数。
 * 要求打印结果：a（2）b（1）。。。；
 * 
 * 对于结果的分析发现，字母和次数之间存在映射关系，二这种关系很多。
 * 很多就需要存储，能存映射关系的容器有数组可MAp集合。
 * 关系一方式有序编号吗？没有！
 * 那就是使用Map集合，又发现可以保证唯一性a（2）b（1）。。。；
 * 那就是TreeMap集合。
 * 
 * 这个集合最终应该储存的是字母和次数对应关系
 * 
 * 1.因为操作的是自扶持案中的字母，所以现将字符串变成字符数组。
 * 2.遍历字符数组，用每一个字母作为键去查Map集合这个表。
 * 如果该字母不存在，就该字母作为键1作为值存储到Map集合中
 * 3.遍历结束，map集合就记录所有字母出现的次数。
 * 
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "s+=da__=as===_-safa";
		String s = getCharCount(str);
		
		System.out.println(s);

	}

	public static String getCharCount(String str) {
		// TODO 自动生成的方法存根
		//将字符串变成字符数组
		
		char[] chs = str.toCharArray();
		
		//定义map集合表。
		
		Map<Character,Integer> map = new TreeMap<Character,Integer>();		
		for (int i = 0; i < chs.length; i++) {
			if(!(chs[i]>='a' && chs[i]<='z'||chs[i]>='A'&&chs[i]<='Z')) 
				continue;
			//将数组中的字母作为键去查表

			Integer value = map.get(chs[i]);
			int count = 1;
			if(value!=null) {
				count = value+1;
			}
//			count++;
			map.put(chs[i], count);
			//判断值是否为null
		
//			if(value==null) {
//				map.put(chs[i],1);
//			}else {
//				map.put(chs[i], value+1);
//			}
//			
		}
		
		return mapToString(map);
	}

	private static String mapToString(Map<Character, Integer> map) {
		// TODO 自动生成的方法存根
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			
			sb.append(key+"("+value+")");
		}
		
		return sb.toString();
	}

}
