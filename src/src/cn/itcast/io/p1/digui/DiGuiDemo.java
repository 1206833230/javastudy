package cn.itcast.io.p1.digui;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * �ݹ飺
		 * ����ֱ�ӻ��ӵĵ�������
		 * 
		 * һ�������ظ�ʹ�ã�����ÿ�νӹ����ϴε��õý���йء�
		 * 
		 * ע�⣺
		 * 1.�ݹ�Ҫ��ȷ����������ջ���
		 * 2.ע��ݹ�Ĵ���
		 */
//		toBin(6);
		int sum = getSum(5000);
		System.out.println(sum);

	}
	public static int getSum(int num) {
		// TODO �Զ����ɵķ������
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
