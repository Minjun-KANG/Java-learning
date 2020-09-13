package example;
import java.util.Scanner;



public class ScannerEx {

	public ScannerEx() {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in); //scanner 래퍼런스 객체를 하나 만듦과 동시에 객체를 연결함.
		
		String name = scanner.next(); // 문자열 읽기 위와같이 호출함
		/*
		 * 자바는 메소드를 호출과 동시에 생성자가 호출되는 것으로 알고있음. 따라서 CircleArea와 TypeConversion 둘다 Main에선 따로 작업을 취하지 않고도 위와같이 호출됨을 명시
		 */
		System.out.print("이름은 " + name + ", ");
		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 " + city + ", ");
		int age = scanner.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		scanner.close(); // scanner 닫기 //이렇게 닫아줘야함
		}
	//이도 c와 마찬가지로 스페이스바 단위로 버퍼를 구분짓는다. 문자열을 연속해서 두번입력하는 과정에서 버퍼오버플로우를 일으키는 것으로 보인다.
}
