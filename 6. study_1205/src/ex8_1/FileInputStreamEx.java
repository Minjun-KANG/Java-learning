package ex8_1;

import java.io.*;
public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // 비어 있는 byte 배열
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\binary.out");
			int n=0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println( "c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}