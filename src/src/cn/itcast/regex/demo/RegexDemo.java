package cn.itcast.regex.demo;

/*
 * ������ʽ
 * 
 * ������ʽ���ڲ����ַ������ݡ�
 * 
 * ��Ȼ���˵��Ǹ����ˡ�
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String qq = "111323565";
//		checkQQ(qq);
		
		String regex = "[1-9][0-9]{4,14}";//������ʽ��
		
		boolean b = qq.matches(regex);
		System.out.println(qq+":"+b);
		
	}
		/*
		 * ���󣺶���һ�����ܶ�QQ�Ž���У�顣
		 * Ҫ�󣺳���5~15��ֻҪ�����֣�0���ܿ�ͷ��
		 */
	public static void checkQQ(String qq) {
		
		int len = qq.length();
		
		if(len>=5 && len<=15) {
			if(!qq.startsWith("0")) {
				try {
					long l = Long.parseLong(qq);
					System.out.println(l+":��ȷ");
				}catch(NumberFormatException e) {
					System.out.println(qq+":���зǷ��ַ�");
				}
			}else {
				System.out.println(qq+":������0��ͷ");
			}
				
			}else {
				System.out.println(qq+":���ȴ���");
		}
	}

}
