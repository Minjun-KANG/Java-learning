
package example;
import java.util.Scanner;
/*
 * 해당 import문에서, java util scanner를 걸어주는데, 이를 main문에서 래퍼런스 객체를 호출하는 식으로 진행을 하지만, main문에서 호출을 해도 상속받는게 없어서 그런지 별게없음.
 * 혹 main문 class를 상속받고, main class에  scanner 같은거를 전부 때려넣게 되면 사용이 가능할 것으로 보임.
 * */

public class BreakExample {

	public BreakExample() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>"); 
			String text = scanner.nextLine();
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
			} //text.equals 문이 보이는데 이는 c에 string.h에 strcmp 문과 같은듯. 하지만 문자열이 정확히 일치해야 된다는 부분이 있음.
		System.out.println("종료합니다...");
		scanner.close();
	}

}
