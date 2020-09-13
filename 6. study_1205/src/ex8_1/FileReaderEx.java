package ex8_1;

import java.io.*;
public class FileReaderEx {
	
	public static void main(String[] args) {
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //해당경로에 있는 파일 읽기
			int c;
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기 -1은 파일의 끝 EOF
				System.out.print((char)c); //int c를 char형으로 타입캐스팅해서 출력
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
	
}
