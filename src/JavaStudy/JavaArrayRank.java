package JavaStudy;

import java.util.Arrays;

public class JavaArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,7,6,4345,6,56,666,767,34,7,787,};
		//System.out.println(arrayRank(arr));
		printArray(arr);
		//System.out.println();
		//selectSort(arr);
		//printArray(arr);
		//arrayRank(arr);
		//System.out.println();
		//printArray(arr);
		System.out.println();
		bubbleRank(arr);
		printArray(arr);
		//System.out.println();
		Arrays.sort(arr);//ÈýÖØÑ­»·
		//printArray(arr);

		

	}
	/*
	 * Ñ¡ÔñÅÅÐò
	 */
	
	public static void swap(int[] arr, int x, int y)
	{
		
			
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
		
		
	}
	/*
	 * Ã°ÅÝÅÅÐò
	 */
	public static void bubbleRank(int[] arr)
	{
		for(int x=arr.length-1; x>0; x--)
		{
			for(int y=0; y<x; y++)
			{
				
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				/*int temp= arr[y];
				arr[y] = arr[y+1];
				arr[y+1] = temp;
				*/
				}
				
				
			}
		}
	}
	public static void selectSort(int[] arr)
	{
		
		for(int x=0;x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
			
		}
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
	public static void arrayRank(int[] arr)
	{
		for(int y=0; y<arr.length-1; y++)
		for(int x=0; x<arr.length-1; x++)
		{
			if(arr[x+1]<arr[x])
			{
				int temp;
				temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		}
		
	}
	

}
