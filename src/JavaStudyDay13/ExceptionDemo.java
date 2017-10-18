/*
 * 异常：是在运行时发生的不正常情况。
 * 在Java中用类的形式对不正常情况进行描述和封装。
 * 
 * 描述不正常情况，抛出异常类。
 * 
 * 以前正常流程代码和问题处理代码相结合。
 * 现在将正常流程代码和问题处理代码分离，提高阅读性。
 * 
 * 其实异常就是Java通过面向对象的思想将问题封装成了对象。
 * 用异常类对其进行描述。
 * 不同的问题用不同的类进行描述。比如数组越界，空指针等等。
 * 问题很多，意味着描述类也很多，
 * 将共性进行向上抽取，形成了异常体系。
 * 
 * 最终问题（不正常情况）就分为两大类：
 * Throwable：无论是error，还是异常问题，问题发生就可抛
 * 让调用知道并处理，Throwable及其所有子类。
 * 可抛性：凡是throws，和throw关键字修饰的类和对象都具备可抛性。
 * 
 * 1.一般不可处理的：Error
 * 特点：是由jvm抛出的严重性问题。
 *      这种问题发生一般不针对性处理，只能修改。
 * 2.可处理的：Exception
 * 
 */

package JavaStudyDay13;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[3];
//		arr = null;
//		System.out.println(arr[3]);
		sleep(-5);
//		int[] arr2 = new int[1024*1024*800000];

	}

	public static void sleep(int time)
	{

		if(time<0)
		{
//			处理办法;
			/*throw*/new FuTime();//时间为负数这个对象中包含着的问题的名称、信息、位置等信息。
		}
		if(time>1000)
		{
//			处理办法;
			/*throw*/new BigTime();
		}
		System.out.println("我睡。。。"+time);
	}
}
class FuTime
{
	
}
class BigTime
{
	
}