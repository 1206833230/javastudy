package JavaStudyDay8;

public class ExtendsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi4 z = new Zi4();
		z.show();

	}

}
class Fu4 
{
	Fu4()
	{
		super();
		show();
		return ;
		
	}
	void show()
	{
		System.out.println("fu show");
		
	}
}
class Zi4 extends Fu4
{
	int num = 8;
	Zi4()
	{
		super();
		//ͨ����ʼ����������ʱ������ĳ�Ա��������ʾδ��ʼ��
		System.out.println("zi cons show������"+num);
		return ;
		
	}
	void show()
	{
		System.out.println("zi show ..."+num);
	}
}