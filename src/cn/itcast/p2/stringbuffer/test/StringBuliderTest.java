package cn.itcast.p2.stringbuffer.test;

public class StringBuliderTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr = {3,1,5,3,8};
//		String s = arrayToString(arr);
		String s = arrayToString_2(arr);
		System.out.println(s);

	}
/**
 * ��һ��int�������ַ���
 * @param arr
 * @return
 */
	private static String arrayToString_2(int[] arr) {
		// TODO �Զ����ɵķ������
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0;i < arr.length; i++) {
			if( i != arr.length-1)
				sb.append(arr[i] +",");
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	}

//	private static String arrayToString(int[] arr) {
//		// TODO �Զ����ɵķ������
//		String str = "[";
//		for(int i = 0;i < arr.length; i++) {
//			if( i != arr.length-1)
//				str+=arr[i] +",";
//			else
//				str+=arr+"]";
//		}
//		return null;
//	}
//
}
