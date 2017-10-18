/*
 *  主函数的特殊之处：
 *  1.格式是固定的。
 *  2.被jvm所识别和调用。
 *  
 *  public：因为权限必须是最大的。
 *  static: 不需要对象的。直接用主函数所属类名调用即可。
 *  void： 主函数没用具体的返回值。
 *  main： 不是关键字，只是一个jvm识别的固定的名字而已。
 *  String【】args:这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型的。
 *  
 */

package JavaStudyDay4;

public class MainDemo {

	public static void main(String[] args) {//new String[0]
		// TODO Auto-generated method stub
		System.out.println(args);//[Ljava.lang.String;@15db9742
		System.out.println(args.length);
		for(int x=0; x<args.length;x++)
		System.out.println(args[x]);//java.lang.ArrayIndexOutOfBoundsException: 0

	}
	public static void main(int x)//重载形式但是String就不行了
	{
		
	}

}
