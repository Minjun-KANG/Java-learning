package ex8_1;

import java.io.*;
public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\test1.txt"); //file input Stream을 걸고
			in = new InputStreamReader(fin, "MS949");  //그걸 인풋스트림 리더로 읽음
			/*
			 * 
			 * 이를 US_ASCII 같은 문자집합으로 설정했을 때는 깨져나옴
			 */
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
}
