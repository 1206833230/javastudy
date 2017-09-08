package cn.itcast.p2.string.demo;

public class StringBuiderDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * jdk1.5以后出现功能和StringBuffer相同的对象，StringBulider
		 *不同的是：
		 *StringBbuffer是线程同步的，通常用于多线程。
		 *StringBulider是线程不同步的。用于单线程。
		 *jdk升级：
		 *1.简化书写。
		 *2.提高效率。
		 *3.增加安全性。
		 */

	}

}
/*
 * class StringBuffer
 * {
 *     object lock;
 *     public StringBuffer append(int x)
 *     {
 *          synchronized(lock)
 *          {
 *          }
 *      }
 *      public synchronized StringBuffer delete(int start,int end)
 *      {
 *         synchronied(lock)
 *         {
 *         }
 *         
 *       }
 * }
 *
 * 
 */

