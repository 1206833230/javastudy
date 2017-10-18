package JavaStudyDay6;

public class ArrayTool {
	//ArrayTool{}{}默认构造函数，浪费空间
		private ArrayTool (){}//该类终端的所有方法都是静态的，所以该类不需要创建对象
		                     // 为了保证其他程序创建该类对象，可以将构造函数私有化。
		/*
		 * 获取整型数组的最大值。
		 * @param arr 接收一个元素为int类型的数组
		 * @return 返回数组最大的元素值
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
		 * 对数组进行选择排序
		 * @param 接受一个arr
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
		 * 用于数组的元素位置交换
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
		 * 获取数组元素的索引
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
		 * 用于输出数组
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
