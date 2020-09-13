package ex8_1;

import java.io.*;
public class FileReaderEx {
	
	public static void main(String[] args) {
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //�ش��ο� �ִ� ���� �б�
			int c;
			while ((c = fin.read()) != -1) { // �� ���ھ� ���� ������ �б� -1�� ������ �� EOF
				System.out.print((char)c); //int c�� char������ Ÿ��ĳ�����ؼ� ���
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}
	
}