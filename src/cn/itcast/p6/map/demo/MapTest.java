package cn.itcast.p6.map.demo;

import java.util.Map;
import java.util.TreeMap;

/**
 * ��Ƶ301�� δ����
 * @author Jun Li
 * 2017��11��18��
 * ����10:52:01
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str  = "asdadalahdslajhdlask";
		String s = getCharCunt(str);
		System.out.println(s);

	}

	public static String getCharCunt(String str) {
		// TODO �Զ����ɵķ������
		//���ַ�������ַ�����
		char[] chs = str.toCharArray();
		
		//����map���ϱ�
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i = 0;i < chs.length;i++) {
			Integer value = map.get(chs[i]);
		//�������е���ĸ��Ϊ��ȥ��map��
		Integer value1 = map.get(chs[i]);
		//�ж�ֵ�Ƿ�Ϊnull
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
