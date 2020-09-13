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
				if(line.length() == 0) //입력된 길이가 0이면 break;
					break;
				fout.write(line, 0, line.length()); //line 배열의 처음부터, line의 크기만큼 문자쓰기기
				fout.write("\r\n", 0, 2); //\r은 캐리지 리턴, 커서의 위치를 맨앞으로 옴긴다.
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}