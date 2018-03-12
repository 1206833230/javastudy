package cn.itcast.net.p1.uploadpic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTast implements Runnable {

	private Socket s;
	public UploadTast(Socket s) {
		this.s = s;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������

		int count = 0;
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".....connected");
		//3.��ȡ�ͻ��˷��������ݡ�
		try {
				InputStream in = s.getInputStream();
				
				//4.����ȡ�����ݴ��浽һ���ļ��С�
				File dir = new File("ͼƬ");
				
				if(!dir.exists()) {
					dir.mkdirs();
				}
				File file = new File(dir,ip+".png");
				//����ļ��Ѿ����ڷ������ˡ�
				while(file.exists()) {
					file = new File(dir,ip+"("+(++count)+").png");
				}
				FileOutputStream fos = new FileOutputStream(file);
				
				byte[] buf = new byte[1024];
				
				int len = 0;
				
				while((len=in.read(buf))!=-1) {
					fos.write(buf, 0, len);
				}
				
				//��ȡSocket����������ϴ��ɹ����������ͻ��ˡ�
				OutputStream out = s.getOutputStream();
				out.write("�ϴ��ɹ�".getBytes());
				
				fos.close();
				s.close();
		}catch(IOException e){
			
		}
	}

}
