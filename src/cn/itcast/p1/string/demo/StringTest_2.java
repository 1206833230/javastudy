package cn.itcast.p1.string.demo;

public class StringTest_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * 2.һ���ַ������� ���г��ֵ�����
		 * "nabdanbaghnbaklasdasnbasdnbadsadsgnba"
		 * ˼·��
		 * 1.Ҫ���Ӵ��Ƿ����������ھͻ�ȡλ�á�
		 */
		String str = "nabdanbaghnbaklnabdanbaghnbasdnbadsadsgnba";
		String key = "nba";
//		int count = getKeyStringCount(str,key);
		int count = getKeyStringCount_1(str,key);
		System.out.println("count="+count);

	}

	private static int getKeyStringCount_1(String str, String key) {
		// TODO �Զ����ɵķ������
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index = index +  key.length();
			count++;
		}
		return count;
	}

//	private static int getKeyStringCount(String str, String key) {
//		// TODO �Զ����ɵķ������
//		//1.���������
//		int count = 0;
//		//2.���������¼���Գ��ֵ�λλ��
//		int index = 0;
//		while((index = str.indexOf(key))!=-1) {
//			str = str.substring(index+key.length());
//			count++;
//		}
//		return count;
//	}
//
}
