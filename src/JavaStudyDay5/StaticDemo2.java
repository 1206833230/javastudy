/*
 * ��̬ʲôʱ���ã�
 * 1.��̬����
 *   a.���������������߱��ĳ�Ա������ֵ������ͬ�ġ���ʱ����Ա�Ϳ��Ա���̬���Ρ�
 *   ��������ڶ����ж��ǲ�ͬ�ģ����Ƕ�����������ݣ����봢���ڶ����У��ǷǾ�̬�ġ�
 *   �������ͬ�����ݣ�������Ҫ���޸�ֻ��Ҫʹ�ü��ɣ�����Ҫ�����ڶ����У�����ɾ�̬��
 *     
 * 2.��̬����
 *  a.�����Ƿ��þ�̬���Σ���ο�һ�㣬���Ǹú��������Ƿ���ʵ������е��������ݡ�
 *  �򵥵�˵����Դ���뿴���ù����Ƿ���Ҫ���ʷǾ�̬�ĳ�Ա�����������Ҫ���ǷǾ�̬�ġ�
 *  �������Ҫ���Ϳ��Խ��ù��ܶ���ɾ�̬�ġ���Ȼ��Ҳ���Զ���ɷǾ�̬�ġ�
 *  ���ǷǾ�̬��Ҫ��������ã���������������÷Ǿ�̬��
 *  û�÷������е����ݵķ������ö���Ĵ���ʱû����ġ�  
 */

package JavaStudyDay5;

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Demo p =new Demo(30);
		 //p.speak();
		 Demo.speak();
		 //Demo.show();

	}

}
class Demo
{
	static int num = 9;
	int age;
	Demo(int age)
	{
		this.age = age;
	}
	public static void speak()
	{
		System.out.println(num);
	}
	public void show()
	{
		System.out.println(age);
	}
}
