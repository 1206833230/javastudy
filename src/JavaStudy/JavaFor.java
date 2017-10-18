package JavaStudy;

public class JavaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for（初始化表达式；循环表达式；循环后的操作表达式）；
		 * {
		 *     执行语句；（循环体）
		 *  }
		 */
		for(int x = 1;x < 3;x++)// 判断必然有boolean型数据
		{
			System.out.println("x="+x);
		}
		int x = 1;
		for(System.out.println("a");x<3;System.out.println("c"))
		{
			System.out.println("d");
			x++;
		}

	}

}
