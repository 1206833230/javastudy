package cn.itcast.p1.string.demo;

public class StringTest_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ����һ���ַ������飬�����ֵ�˳����д�С����Ľ������� {"nba","abc","cha","zz","qq',"haha"}
		 * 
		 * ˼·; 1.������������򡣿���ѡ��ð�ݣ�ѡ�� 2.forǶ�׺ͱȽϽ���λ�á�
		 */
		String[] arr = { "nba", "abc", "cha", "zz", "qq", "haha" };
		printArray(arr);
		sortString(arr);
		printArray(arr);

	}

	public static void sortString(String[] arr) {
		// TODO �Զ����ɵķ������
		for(int i  = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0) {//�ַ����Ƚ���compareTo�������
					swap(arr,i,j);
				}
			}
			
		}
	}

	private static void swap(String[] arr, int i, int j) {
		// TODO �Զ����ɵķ������
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(String[] arr) {
		// TODO �Զ����ɵķ������
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}

	}

}
