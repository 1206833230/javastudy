package JavaStudy;

public class JavaDicToAnyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toHex(26);
		toBinary(-6);
		toOctal(26);
		System.out.println(Integer.toBinaryString(-6));
		System.out.println(Integer.toHexString(26));
		System.out.println(Integer.toOctalString(26));

	}
	/*
	 * 十进制转十六进制
	 */
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	/*
	 * 十进制转二进制
	 */
	public static void toBinary(int num)
	{
		trans(num,1,1);
	}
	/*
	 * 十进制转八进制
	 */
	public static void toOctal(int num)
	{
		trans(num,7,3);
	}
	
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.println("0");
			return ;
		}
		char[] chs = {'0','1','2','3','4',
				      '5','6','7','8','9','A',
				      'B','C','D','E','F'};
	
			char[] arr = new char[32];
			int pos = arr.length;
			while(num!=0)
			{
				int temp = num & base;
				arr[--pos] = chs[temp];
				num = num >>> offset;
			}
		
			for(int x1=pos; x1<arr.length; x1++)
			{
				System.out.print(arr[x1]);
			}
			System.out.println();
		
	}

}
