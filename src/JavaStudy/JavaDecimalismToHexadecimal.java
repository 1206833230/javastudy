/*
 *什么时候使用数组呢?
 *如果数据具有对应关系，而且对关系的一方是有序的数字编号，并作为脚标使用
 *就可以使用数组了
 */
package JavaStudy;
public class JavaDecimalismToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toHex_1(64);
		//printArray(arr);
		

	}
	public static void toHex(int num)
	{
		for(int x=0; x<8; x++)
		{
			int temp = num & 15;
			if(temp>9)
			{
				System.out.print((char)(temp-10+'A'));
			}
			else
			{
				System.out.print(temp);
			}
			num = num >>> 4;
		}
	}
		/*
		 * 查表法
		 */
		public static void toHex_1(int num)
		{
			if(num==0)
			{
				System.out.println("0");
				return ;
			}
			char[] chs = {'0','1','2','3','4',
					      '5','6','7','8','9','A',
					      'B','C','D','E','F'};
		
				char[] arr = new char[8];
				int pos = arr.length;
				while(num!=0)
				{
					int temp = num & 15;
					arr[--pos] = chs[temp];
					num = num >>> 4;
				}
			
				System.out.println("pos="+pos);
				for(int x1=pos; x1<arr.length; x1++)
				{
					System.out.print(arr[x1]+",");
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
		 
	

}
