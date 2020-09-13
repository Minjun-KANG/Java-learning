package ex8_1;

import java.io.*;
import java.util.*;
public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\\\Users\\\\ansal\\\\OneDrive\\\\Desktop\\\\test\\\\test2.txt");
			while(true) {
				String line = scanner.nextLine();
				System.out.print(line);
				if(line.length() == 0) //�Էµ� ���̰� 0�̸� break;
					break;
				fout.write(line, 0, line.length()); //line �迭�� ó������, line�� ũ�⸸ŭ ���ھ����
				fout.write("\r\n", 0, 2); //\r�� ĳ���� ����, Ŀ���� ��ġ�� �Ǿ����� �ȱ��.
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}