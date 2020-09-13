package example;
import java.util.Scanner;
import java.util.InputMismatchException; // 해당 패키지를 임포트하지 않으면 예외처리가 불가능함. inputMismatchexception은 해당 패키지에 존재.

public class InputException {

	public InputException() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		
		System.out.println("합은 " + sum);
		scanner.close();
	}

}
