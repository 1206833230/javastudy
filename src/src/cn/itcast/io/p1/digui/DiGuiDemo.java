package cn.itcast.io.p1.digui;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 递归：
		 * 函数直接或间接的调用自身。
		 * 
		 * 一个功能重复使用，并且每次接过和上次调用得结果有关。
		 * 
		 * 注意：
		 * 1.递归要明确条件，否则栈溢出
		 * 2.注意递归的次数
		 */
//		toBin(6);
		int sum = getSum(5000);
		System.out.println(sum);

	}
	public static int getSum(int num) {
		// TODO 自动生成的方法存根
		if(num==1) {
			return 1;
		}
		return num+getSum(num-1);
		
	}
	public static void toBin(int num) {
		if(num>0) {
			System.out.print(num%2);
			toBin(num/2);
		}
	}

}
