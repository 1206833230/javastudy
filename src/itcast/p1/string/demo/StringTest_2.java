package cn.itcast.p1.string.demo;

public class StringTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nbafenbafasfnbaasde";
		String key = "nba";
		int count1 = getKeyStringCount_1(str,key);
		int count2 = getKeyStringCount_2(str,key);
		System.out.println("count="+count2+count1);

	}

	private static int getKeyStringCount_2(String str, String key) {
		// TODO Auto-generated method stub
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index = index + key.length();
			count++;
			
			
		}
		return count;
	}

	public static int getKeyStringCount_1(String str, String key) {
		// TODO Auto-generated method stub
		//���������
		int count = 0;
		//���������¼key���ֵ�λ�á�
		int index = 0;
		while((index=str.indexOf(key))!=-1)
		{
			str = str.substring(index+key.length());
			count++;
		}
		
		return count;
	}
}
/*
 * �����ַ��������ַ������ֵĴ�����nbafenbafasfnbaasde��
 * ˼·��
 * 1.Ҫ�ҵ��Ӵ��Ƿ���ڣ�������ڻ�ȡ���ֵ�λ�á��������ʹ��indexOf��ɡ�
 * 2.����ҵ��ˣ���ô�ͼ�¼λ�ü������ҡ�
 * ��ʣ���ַ�����ʼ��λ��+�Ӵ����ȡ�
 * 
 */
