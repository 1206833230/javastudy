package JavaStudyDay13;

public class ExceptionDemo2 {

	public static void main(String[] args)throws FuShuIndexException {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
//		System.out.println(arr[3]);
//		arr[2] = 3;
		Demo d = new Demo();
		int num = d.method(arr,-52);
		System.out.println(num);

	}
//	public static void method(int[] arr,int index)
//	{
//		System.out.println(arr[index]);
//	}

}
/*
 * 异常的分类：
 * 1.编译时被检测异常：只要是Exception和其子类都是，除了特殊子类RunTimeException体系
 * 这种问题一旦出现，希望在编译时进行检测，让这种问题有对应的处理。
 * 这样问题都可以针对性处理。
 * 2.编译不检测异常(运行时异常）：就是Exception中的RunTimeException和其子类。
 * 
 */
/*
 * 异常处理的捕捉形式：
 * 这是可以对异常进行处理的方法。
 * 具体格式是：
 * try
 * {
 *     需要被检测异常的代码。
 * }
 * catch（异常类 变量）//该变量用于接收发生的一场对象
 * {
 *     //处理异常的代码。
 * }
 * finally
 * {
 *    //一定会被执行的代码
 * }
 */

class FuShuIndexException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FuShuIndexException()
	{
		
	}
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}
class Demo
{
	public int method(int[] arr,int index)throws FuShuIndexException
	{
//		System.out.println(arr[index]);
//		if(arr==null)
//		{
//			throw new NullPointerException("数组不能为空!");
//		}
//		if(index>=arr.length)
//		{
//			throw new ArrayIndexOutOfBoundsException(":"+index);
//		}
//		try
//		{
			if(index < 0)
		{
			throw new FuShuIndexException();
		}
//		}
//		catch ()
//		{
//			
//		}
		
		return arr[index];
	}
}
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}