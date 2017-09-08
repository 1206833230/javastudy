package cn.itcast.p2.string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * StingBuffer:就是字符串缓冲区。
		 * 用于存储数据的容器。
		 * 特点：
		 * 1.长度是可变。
		 * 2.可以储存不同类型的数据。
		 * 3.最终要转成字符串进行使用。
		 * 4.可以对字符串进行修改。
		 * 
		 * 既然是容器应该具备什么功能呢？
		 * 1.添加
		 * StringBuffer append(data);
		 * StringBuffer insert(index,data);
		 * 2.删除
		 * stringBuffer delete (start,end);包含投不包含尾
		 * StringBuffer deleteCharAt(int index);删除指定位置的元素
		 * 3.查找
		 *  char cahrAt(index);
		 *  int indexOf(string);
		 *  int lastIndexOf(string);
		 * 4.修改
		 * stringBuffer replace(start,end,string);
		 * void setCharAt(index,char);
		 * 
		 */
		bufferMethodDemo();
		bufferMethodDemo_2();

	}
	private static void bufferMethodDemo_2() {
		// TODO 自动生成的方法存根
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);
//		sb.delete(0,sb.length());//清空缓冲区
//		sb = new StringBuffer();
//		System.out.println(sb);
//		sb.replace(1,3,"nba");
//		sb.setLength(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
	public static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb1 = new StringBuffer("abcd");
		sb1.append("xixi");
		sb1.insert(2, "qq");
		System.out.println(sb1.toString());
		StringBuffer sb = new StringBuffer();
//		StringBuffer s1 = sb.append(4);
		sb.append(4);
		sb.append(true);
		sb.append(4).append(false).append("hehe");
		sb.insert(1,"hehe");
		
		System.out.println(sb);
//		System.out.println(sb==s1);
//		System.out.println(sb);
	}

}
