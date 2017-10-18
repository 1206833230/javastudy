package javastudyday20;

public class ThreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
		new Demo();
		new Demo();
		System.gc();
		System.out.println("Hello java");

	}

}
//jvm启动时就启动了多个线程，至少有两个线程启动了
//1.mian线程。
//2.垃圾回收处理机制。
class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}