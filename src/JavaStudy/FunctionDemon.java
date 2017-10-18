package JavaStudy;

public class FunctionDemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int add(int a, int b)
		//int c = add(3,4);
		//{
		//	return a+b;
		//}
		 /*
		  * 定义函数的格式
		  * 函数的第一个单词是小写以后每个单词首写是大写（这是规范，团队开发的基本）
		  * 参数：参与运算的数值
		  * 修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2，。。。）
		  * {
		  *     执行语句；
		  *     return 返回值；
		  *     
		  * }
		  * 特殊情况没有具体的返回值
		  * 这时return直接用分号结束
		  * 返回不具体用void（无返回值表示0
		  * 
		  */
		/*int a=1;
		int b=4;
		public static int add(int a, int b)
		 
		{
			return a+b;
		}
		
		public static void myPrint()
		{
			System.out.println("Hello World");
		}
		myPrint();
		*/
		/*
		 *  函数的做用封装数据
		 *  定义功能
		 *  
		 */
		myPrint();
		int x = add(3,5);
		
		System.out.println("x="+x);
		System.out.println(add(3,5));

	}
	public static void myPrint()
	{
		System.out.println("Hello World!");
	}
	public static  int add(int a,int b)
	{
		return a+b;
	}
	

}
