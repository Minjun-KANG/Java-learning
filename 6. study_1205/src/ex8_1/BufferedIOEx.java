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
			//뒤에 파라미터의 배수단위까지 스트림함.
			/*
			 * 예를들어 숫자가 21개있으면 자동으로 20스트림으로 되고 나머지 1개를 다음번에 출력함.
			 */
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();
			//out.flush(); // 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}