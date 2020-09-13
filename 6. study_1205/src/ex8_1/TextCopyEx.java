package ex8_1;

import java.io.*;
	public class TextCopyEx {
		public static void main(String[] args){
			File src = new File("C:\\windows\\system.ini"); // 원본 파일 경로명
			File dest = new File("C:\\Users\\ansal\\OneDrive\\Desktop\\test\\test.txt"); // 복사 파일 경로명
			int c;
			try {
				FileReader fr = new FileReader(src);
				FileWriter fw = new FileWriter(dest);
				while((c = fr.read()) != -1) { // 문자 하나 읽고
					fw.write((char)c); // 문자 하나 쓰고
				}
				fr.close(); fw.close();
				System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
			} catch (IOException e) {
				System.out.println("파일 복사 오류");
			}
		}
}
