package cn.itcast.p2.stringbuffer.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
/*
 * StringBuffer：就是字符串缓冲区。
 * 用于数据的储存的容器。
 * 特点：
 * 1.长度不可变。
 * 2.可以储存不同数据类型。
 * 3.最终要转化为字符串使用
 * 4.可以对字符串进行修改
 * 
 * 既然是一个容器对象应该具备什么功能呢?
 * 1.添加：
 *  StringBuffer append（data）；
 *  StringBufer insert(data);
 *  2.删除：
 *  StringBuffer delete（start，end）包含头，不含尾
 *  StringBuffer deleteCharAt（int index）；删除指定位置的元素
 *  3.查找
 *  char charAt(index);
 *  int indexOf(string);
 *  int lastIndexOf(string);
 *  4.修改
 *  StringBuffer replace(start,end,String);
 *  void setCharAt(index,char);
 *  增删改：C(create)U(update)R(read)D(delete)
 *  
 *    
 */
		bufferMethodDemo1();
		bufferMethodDemo();
		bufferMethodDemo_2();

	}

	private static void bufferMethodDemo_2() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);//ee
//		//清除缓冲区
//		sb.delete(0,sb.length());
//		sb = new StringBuffer();
		
//		sb.replace(1,3,"nba");
//		sb.setCharAt(2, 'q');
//		sb.setLength(10);
//		System.out.println("sb："+sb);
//		System.out.println("leb:"+sb.length());
		System.out.println(sb.reverse());
	}

	private static void bufferMethodDemo1() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abce");
		sb.insert(2, "qq");
		System.out.println(sb.toString());
		
	}

	private static void bufferMethodDemo() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(false);//.append("haha");
//		sb.append(ture);
		sb.insert(1,"haha");
		System.out.println(sb);
		
	}

}
