package cn.itcast.p1.string.demo;

public class StringTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.����һ���ַ������顣�����ֵ�˳����д�С���������
		 * {"nba","abc","cba","zz","qq","haha"}
		 * ˼·��
		 * 1.������������򡣿���ѡ��ð������
		 * 2.forǶ�׺ͱȽ��Լ���λ��
		 * 3.���⣺��ǰ�ĵ����������Ƚ��ñȽ�������������������ַ�������
		 * �ַ���������ô�Ƚ���?
		 * �������ṩ�������ַ�������ȽϵĹ��ܡ�
		 * 
		 */
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		printArray(arr);
		sortString(arr);
		printArray(arr);
		
				

	}

	public static void sortString(String[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0)//�ַ��_�Ƚ���compareTo���
				{
					swap(arr,i,j);
				}
			}
		}
		
		
	}

	private static void swap(String[] arr, int i, int j) {
		// TODO Auto-generated method stub
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(String[] arr) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]+"]");
		}
		
	}

}
