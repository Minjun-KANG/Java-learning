package ex8_1;

import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\I was.jpg");
		File dest = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\copy2.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10]; // 10KB ����
			while(true) {
				int n = fi.read(buf); // ���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); // buf[0]���� n ����Ʈ ���� //buf.length �־Ⱦ�����?
				if(n <buf.length)
					break;
			}
			fi.close();
			fo.close();	
	System.out.println( src.getPath() + "�� " + dest.getPath() +
			"�� �����Ͽ����ϴ�.");
		} catch (IOException e) { System.out.println("���� ���� ����"); }
	}
}