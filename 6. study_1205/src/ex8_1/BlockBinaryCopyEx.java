package ex8_1;

import java.io.*;
public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\I was.jpg");
		File dest = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\copy2.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10]; // 10KB 버퍼
			while(true) {
				int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기 //buf.length 왜안쓰는지?
				if(n <buf.length)
					break;
			}
			fi.close();
			fo.close();	
	System.out.println( src.getPath() + "를 " + dest.getPath() +
			"로 복사하였습니다.");
		} catch (IOException e) { System.out.println("파일 복사 오류"); }
	}
}