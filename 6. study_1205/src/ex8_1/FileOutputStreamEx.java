package ex8_1;

import java.io.*;
public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout =
					new FileOutputStream("C:\\\\Users\\\\ansal\\\\OneDrive\\\\Desktop\\\\test\\\\binary.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
		} catch(IOException e) {
			System.out.println( "c:\\Temp\\test.out에 저장할 수없었습니다. 경로명을 확인해 주세요");
					return;
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
	}
}
