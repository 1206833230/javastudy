package JavaStudyDay6;

public class ArrayTool {
	//ArrayTool{}{}Ĭ�Ϲ��캯�����˷ѿռ�
		private ArrayTool (){}//�����ն˵����з������Ǿ�̬�ģ����Ը��಻��Ҫ��������
		                     // Ϊ�˱�֤�������򴴽�������󣬿��Խ����캯��˽�л���
		/*
		 * ��ȡ������������ֵ��
		 * @param arr ����һ��Ԫ��Ϊint���͵�����
		 * @return ������������Ԫ��ֵ
		 */
		public static int getMax1(int[] arr)
		{
			int maxIndex = 0;
		
			for(int x=1;x<arr.length; x++)
			{
				if(arr[x]>arr[maxIndex])
					maxIndex = x;
			}
			return arr[maxIndex];
		}
    	/*
		 * ���������ѡ������
		 * @param ����һ��arr
		 */
		public static void selectSort(int[] arr)
		{
			for(int x=0; x<arr.length; x++)
			{
				for(int y=0; y<arr.length; y++)
				{
					if(arr[x]>arr[y])
						swap(arr,x,y);
				}
			}
		}
		/*
		 * ���������Ԫ��λ�ý���
		 * @param arr
		 * @param a
		 * @param b
		 */
		private static void swap(int[] arr,int a,int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		/*
		 * ��ȡ����Ԫ�ص�����
		 * @param arr
		 * @param key
		 * @return -1
		 */
		public static int getIndex(int[] arr,int key)
		{
			for(int x=0; x<arr.length; x++)
			{
				if(arr[x]==key)
				{
					return x;
				}
			}
			return -1;
		}
		/*
		 * �����������
		 * @param arr
		 * @param str
		 * @return str
		 */
		public static String arrayToString(int[] arr)
		{
			String str = "[";
			for(int x=0; x<arr.length; x++)
			{
				if(x!=arr.length-1)
					str = str + arr[x]+",";
				else
					str = str + arr[x]+"]";
			}
			return str;
		}

}
