package ex8_1;

import java.io.*;
public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\test1.txt"); //file input Stream�� �ɰ�
			in = new InputStreamReader(fin, "MS949");  //�װ� ��ǲ��Ʈ�� ������ ����
			/*
			 * 
			 * �̸� US_ASCII ���� ������������ �������� ���� ��������
			 */
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		
	}
}