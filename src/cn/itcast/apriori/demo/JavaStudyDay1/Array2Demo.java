/*
 * 二维数组的定义
 * 二维数组的储存格式
 * arr储存为栈 元素储存为堆 虚拟机自动对堆进行初始化为null
 * 第一个数组储存 第二数组的地址
 * 在堆中开辟空间储存小数组 角标越界
 */

package JavaStudyDay1;

public class Array2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[3];
		//System.out.println(arr);[I@6d06d69c @左边是实体类型 @右边是实体的哈希值
		//int[][] arr = new int[3][];分别对二维数组中的每个小数组进行初始化
		//arr[0] = new int[2];
		//arr[1] = new int[1];
		//arr[2] = new int[3];
		//int[][] arr = new int[3][2];//创建一个二维数组，该数组中有3个一维数组，每个数组中有两个元素
		//System.out.println(arr);//直接打印二维数组[[I@15db9742
		//System.out.println(arr[0]);//null直接打印二位数组中角标0的一维数组[I@6d06d69c
		//System.out.println(arr[0][0]);//直接打印二维数组中角标为00的元素 0
		//System.out.println(arr.length);//打印二维数组中一维数组的个数
		//System.out.println(arr[1].length);//打印二维数组中角标为1的一维数组的长度
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
			//甲：30 59 20 17
			//乙：37 60 22 19
			//int[][] arr = {{30,59,28,17},{37,60,22,19}};
		}
	}

}
