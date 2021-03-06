package cn.itcast.regex.demo;

/*
 * 正则表达式
 * 
 * 正则表达式用于操作字符串数据。
 * 
 * 虽然简化了但是复杂了。
 */
public class RegexDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String qq = "111323565";
//		checkQQ(qq);
		
		String regex = "[1-9][0-9]{4,14}";//正则表达式。
		
		boolean b = qq.matches(regex);
		System.out.println(qq+":"+b);
		
	}
		/*
		 * 需求：定义一个功能对QQ号进行校验。
		 * 要求：长度5~15，只要是数字，0不能开头。
		 */
	public static void checkQQ(String qq) {
		
		int len = qq.length();
		
		if(len>=5 && len<=15) {
			if(!qq.startsWith("0")) {
				try {
					long l = Long.parseLong(qq);
					System.out.println(l+":正确");
				}catch(NumberFormatException e) {
					System.out.println(qq+":含有非法字符");
				}
			}else {
				System.out.println(qq+":不能以0开头");
			}
				
			}else {
				System.out.println(qq+":长度错误");
		}
	}

}
