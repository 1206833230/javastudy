/*
 *  保证程序的独立运行
 */

package JavaStudyDay6;

public class ArrayTooDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,45,46,43,7,8,9};
		int max = getMax(arr);
		System.out.println("max="+max);
		
	}
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;
	
		for(int x=1;x<arr.length; x++)
		{
			if(arr[x]>arr[maxIndex])
				maxIndex = x;
		}
		return arr[maxIndex];
	}

}
