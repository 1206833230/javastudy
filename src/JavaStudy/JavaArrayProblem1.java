package JavaStudy;

public class JavaArrayProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //int[] arr = new int[] {89,45,56,576,76,356};//即定义了元素类型定义内容
		int[] arr1 = {78,454,66,877,90};
		
		/*
		 * 对数组的基本操作就是村和取
		 * 核心就是对数组脚标操作
		 */
		//for(int x=0;x<=arr1.length ; x++)//数组遍历越界java.lang.ArrayIndexOutOfBoundsException
		for(int x=0;x<arr1.length ; x++)
		{
		System.out.println("arr1["+x+"]="+arr1[x]+";");
		}
		/*
		 * 数组取最值
		 * 思路：
		 * 1.需要进行比较，并定义变量记录最大值
		 * 2.遍历整个数组
		 * 3.如果记录的值小于 遍历到的数 交换数值
		 * 4.该变量记录了最大值
		 */
		//int max = getMax(arr1);
		System.out.println(getMax_2(arr1));

	}
	 
		/*public  static int getMax(int[] arr)
		{
			int  maxElement = 0;
			for(int x=0;x<arr.length; x++)
			{
				if(arr[x]>maxElement)
					maxElement = arr[x];
			}
			return maxElement;
		}
		*/
		public  static int getMax_2(int[] arr)
		{
			int  maxIndex = 0;
			for(int x=0;x<arr.length; x++)
			{
				if(arr[x]>arr[maxIndex])
					maxIndex = x;
			}
			return arr[maxIndex];
		}

}
