package JavaStudy;

public class JavaArraySort {
	public static void main(String[] agrs)
	{
		int[] arr = new int[] {23,5546,6,6,7,776,76,45,46,98,78,73,9,78};
	    selectSort_2(arr);
		printArray(arr);
	}
	public static void selectSort_2(int[] arr)
	{
		for(int x=0; x<arr.length; x++)
		{
			int element = arr[x];
			int index = x;
			for(int y=x+1; y<arr.length; y++)
			{
				if(element>arr[y])
				{
					element = arr[y];
					index = y;
				
				if(index!=x)
				{
					swap(arr,index,x);
				}
				}
					
			}
		}
	}
	public static void swap(int[] arr, int x, int y)
	{
		
			
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
		
		
	}
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
		if(x!=arr.length-1)
			System.out.print(arr[x]+",");
		else
			System.out.print(arr[x]+"]");
		}
			
	}

}
