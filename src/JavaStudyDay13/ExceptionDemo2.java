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
 * �쳣�ķ��ࣺ
 * 1.����ʱ������쳣��ֻҪ��Exception�������඼�ǣ�������������RunTimeException��ϵ
 * ��������һ�����֣�ϣ���ڱ���ʱ���м�⣬�����������ж�Ӧ�Ĵ���
 * �������ⶼ��������Դ���
 * 2.���벻����쳣(����ʱ�쳣��������Exception�е�RunTimeException�������ࡣ
 * 
 */
/*
 * �쳣����Ĳ�׽��ʽ��
 * ���ǿ��Զ��쳣���д���ķ�����
 * �����ʽ�ǣ�
 * try
 * {
 *     ��Ҫ������쳣�Ĵ��롣
 * }
 * catch���쳣�� ������//�ñ������ڽ��շ�����һ������
 * {
 *     //�����쳣�Ĵ��롣
 * }
 * finally
 * {
 *    //һ���ᱻִ�еĴ���
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
//			throw new NullPointerException("���鲻��Ϊ��!");
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