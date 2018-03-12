package cn.itcast.p6.map.demo;

import java.util.Map;
import java.util.TreeMap;

/**
 * 视频301集 未看完
 * @author Jun Li
 * 2017年11月18日
 * 下午10:52:01
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str  = "asdadalahdslajhdlask";
		String s = getCharCunt(str);
		System.out.println(s);

	}

	public static String getCharCunt(String str) {
		// TODO 自动生成的方法存根
		//将字符串变成字符数组
		char[] chs = str.toCharArray();
		
		//定义map集合表
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i = 0;i < chs.length;i++) {
			Integer value = map.get(chs[i]);
		//将数组中的字母作为键去查map表
		Integer value1 = map.get(chs[i]);
		//判断值是否为null
		if(value1==null) {
			map.put(chs[i], i);
		}
		else {
			map.put(chs[i], value1+1);
		}
	}
		return map.toString();
	}

}
