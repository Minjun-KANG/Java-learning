package ex8_1;

import java.io.*;
	public class TextCopyEx {
		public static void main(String[] args){
			File src = new File("C:\\windows\\system.ini"); // ���� ���� ��θ�
			File dest = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\test.txt"); // ���� ���� ��θ�
			int c;
			try {
				FileReader fr = new FileReader(src);
				FileWriter fw = new FileWriter(dest);
				while((c = fr.read()) != -1) { // ���� �ϳ� �а�
					fw.write((char)c); // ���� �ϳ� ����
				}
				fr.close(); fw.close();
				System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
			} catch (IOException e) {
				System.out.println("���� ���� ����");
			}
		}
}