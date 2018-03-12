package cn.itcast.p1.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * ��ϰ��
 * ��djaldsalallakhkdjgakls����ȡ���ַ����У�ÿ����ĸ���ֵĴ�����
 * Ҫ���ӡ�����a��2��b��1����������
 * 
 * ���ڽ���ķ������֣���ĸ�ʹ���֮�����ӳ���ϵ�������ֹ�ϵ�ܶࡣ
 * �ܶ����Ҫ�洢���ܴ�ӳ���ϵ�������������MAp���ϡ�
 * ��ϵһ��ʽ��������û�У�
 * �Ǿ���ʹ��Map���ϣ��ַ��ֿ��Ա�֤Ψһ��a��2��b��1����������
 * �Ǿ���TreeMap���ϡ�
 * 
 * �����������Ӧ�ô��������ĸ�ʹ�����Ӧ��ϵ
 * 
 * 1.��Ϊ���������Է��ְ��е���ĸ�������ֽ��ַ�������ַ����顣
 * 2.�����ַ����飬��ÿһ����ĸ��Ϊ��ȥ��Map���������
 * �������ĸ�����ڣ��͸���ĸ��Ϊ��1��Ϊֵ�洢��Map������
 * 3.����������map���Ͼͼ�¼������ĸ���ֵĴ�����
 * 
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str = "s+=da__=as===_-safa";
		String s = getCharCount(str);
		
		System.out.println(s);

	}

	public static String getCharCount(String str) {
		// TODO �Զ����ɵķ������
		//���ַ�������ַ�����
		
		char[] chs = str.toCharArray();
		
		//����map���ϱ�
		
		Map<Character,Integer> map = new TreeMap<Character,Integer>();		
		for (int i = 0; i < chs.length; i++) {
			if(!(chs[i]>='a' && chs[i]<='z'||chs[i]>='A'&&chs[i]<='Z')) 
				continue;
			//�������е���ĸ��Ϊ��ȥ���

			Integer value = map.get(chs[i]);
			int count = 1;
			if(value!=null) {
				count = value+1;
			}
//			count++;
			map.put(chs[i], count);
			//�ж�ֵ�Ƿ�Ϊnull
		
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
		// TODO �Զ����ɵķ������
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
