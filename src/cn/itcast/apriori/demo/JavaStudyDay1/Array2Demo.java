/*
 * ��ά����Ķ���
 * ��ά����Ĵ����ʽ
 * arr����Ϊջ Ԫ�ش���Ϊ�� ������Զ��Զѽ��г�ʼ��Ϊnull
 * ��һ�����鴢�� �ڶ�����ĵ�ַ
 * �ڶ��п��ٿռ䴢��С���� �Ǳ�Խ��
 */

package JavaStudyDay1;

public class Array2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[3];
		//System.out.println(arr);[I@6d06d69c @�����ʵ������ @�ұ���ʵ��Ĺ�ϣֵ
		//int[][] arr = new int[3][];�ֱ�Զ�ά�����е�ÿ��С������г�ʼ��
		//arr[0] = new int[2];
		//arr[1] = new int[1];
		//arr[2] = new int[3];
		//int[][] arr = new int[3][2];//����һ����ά���飬����������3��һά���飬ÿ��������������Ԫ��
		//System.out.println(arr);//ֱ�Ӵ�ӡ��ά����[[I@15db9742
		//System.out.println(arr[0]);//nullֱ�Ӵ�ӡ��λ�����нǱ�0��һά����[I@6d06d69c
		//System.out.println(arr[0][0]);//ֱ�Ӵ�ӡ��ά�����нǱ�Ϊ00��Ԫ�� 0
		//System.out.println(arr.length);//��ӡ��ά������һά����ĸ���
		//System.out.println(arr[1].length);//��ӡ��ά�����нǱ�Ϊ1��һά����ĳ���
		int[][] arr1 = {{1,2,3},{4,5,6,7},{8,9},{12,34,45}};
		int sum = 0;
		for(int x=0; x<arr1.length; x++)
		{
			for(int y=0; y<arr1[x].length; y++)
			{
		//		System.out.println(arr1[x][y]+",");
				sum += arr1[x][y];
			}
			System.out.println("sum="+sum);
			//�ף�30 59 20 17
			//�ң�37 60 22 19
			//int[][] arr = {{30,59,28,17},{37,60,22,19}};
		}
	}

}
