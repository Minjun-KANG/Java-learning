
package example;
import java.util.Scanner;

public class ArrayAccess {

	public ArrayAccess() {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; // 배열 생성
		/*
		 * intArray[]로 래퍼런스변수를 생성하고, new int[5]로 동적할당 하는거임
		 * intArray[]는 컴파일할 때 생기는 변수고, new int[5]는 실행할 때 생긴다는 소리임.
		 * 물론 i[0]의 래퍼런스 값이 들어감.
		 * 
		 *	int intArray[] = {0,1,2,3,4,5,6,7,8,9}; 로 값을 넣는 것도 가능하고 이도 위와 같음
		 * 또한 하나의 배열을 여러개의 래퍼런스변수가 참조하는 것도 가능.
		 */
		int max=0; // 현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i] >max) // intArray[i]가 현재 가장 큰 수보다 크면
				max = intArray[i]; // intArray[i]를 max로 변경
		}
		System.out.print("가장 큰 수는 " + max + "입니다.");
		scanner.close();
		System.out.println("배열의 길이는 : "+ intArray.length);
		/*
		 * length필드 임. 배열은 자바에서 객체로 관리를하는데, 배열객체를 생성하면 같이생성됨.
		 * 
		 */
	}

}


