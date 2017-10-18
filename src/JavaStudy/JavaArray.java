package JavaStudy;

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 元素类型【】 数组名 = new 元素类型[元素个数或数组长度】{}
		 * int[] arr = new int[]{1,2,3}
		 * int[] arr = {3,4,5,6}
		 */
		//double[] sudentGagre = new double[5] {90.22,78.5,89.56,98.4,34.56,34.78};
		/*
		 * 内存的划分
		 * 1.寄存器
		 * 2.本地方法区
		 * 3.方法区
		 * 4.栈内存  
		 * 存储的都是局部变量 定义在方法中变量 函数中的变量
		 * 局部变量：for（int x=0； x<=4; x++)
		 * 变量的作用域一旦结束就自动释放
		 * {//局部代码块；限定局部变量的生命周期
		 *  int age=5；
		 *  }
		 * 5.堆内存
		 *  存储的是数组和对象（其实数组就是对象）凡是new建立的都在堆中。
		 *  特点：
		 *  变量int【】 arr = new int【3】实体
		 *  主函数先进栈 变量arr在栈中 new在堆中开辟空间（分配地址）
		 *  堆内存中变量会自动初始化
		 *  1.每一个实体都有首地址值
		 *  2.堆内存中每一个变量都有默认初始化值，根据类型不同而不同 整数0 小数0.0或者0.0f
		 *  boolean false char uncoide
		 *  3.医用数据类型 arr 引用了 new int【】中的数据（指针）
		 *  4.arr 储存的仅仅是 堆中的首地址
		 *  5.arr = null；空指针（没有用的堆就出来了，堆里有自动的垃圾回收机制）
		 *  6.
		 * 
		 */
		
		int[] arr = new int[3];
		arr[0] = 89;
		System.out.println(arr[0]);

	}

}
