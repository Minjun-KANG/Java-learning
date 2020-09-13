package example;

public class NumException {

	public NumException() {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
		/*
		 * 
		 * Exception 이 발생하면, 그냥 에러를 띄우고 끝내기 때문에, for문은 더이상 동작하지 못한다.
		 */
	}

}
