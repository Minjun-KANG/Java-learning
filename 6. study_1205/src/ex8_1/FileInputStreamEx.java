package ex8_1;

import java.io.*;
public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // ��� �ִ� byte �迭
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\binary.out");
			int n=0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println( "c:\\Temp\\test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}
	}
}