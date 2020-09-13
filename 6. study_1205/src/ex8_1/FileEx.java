package ex8_1;

import java.io.File;
public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() +"의 서브 리스트 입니다.-----");
		
		File[] subFiles = dir.listFiles(); //  파라미터로 넘겨온 dir객체에 대한  파일 및 서브디렉터리 리스트 얻기
		
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i]; // 파일리스트를 순차적으로 할당
			long t = f.lastModified(); // 마지막수정시간
			System.out.print(f.getName());
			System.out.print("\t파일 크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t,t, t, t);
		}
		
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " +f1.getName());
		
		String res="";
		if(f1.isFile()) { res = "파일";} //파일인가? 
		else if(f1.isDirectory()) { res = "디렉토리";} //디렉터리인가?
		
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		File f2 = new File("c:\\Temp\\java_sample");
		
		if(!f2.exists()) {
			f2.mkdir(); // 존재하지 않으면 디렉토리 생성
		}
		
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\javasample")); //파일 이름변경
		listDirectory(new File("c:\\Temp"));
	}
}