package ex8_1;

import java.io.*;
import java.util.Scanner;
public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\\\Users\\\\ansal\\\\OneDrive\\\\Desktop\\\\test\\\\test.txt");
			
			BufferedOutputStream out = new BufferedOutputStream(System.out, 8);
			//�ڿ� �Ķ������ ����������� ��Ʈ����.
			/*
			 * ������� ���ڰ� 21�������� �ڵ����� 20��Ʈ������ �ǰ� ������ 1���� �������� �����.
			 */
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			// ���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine();
			//out.flush(); // ���ۿ� ���� �ִ� ���� ��� ���
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}