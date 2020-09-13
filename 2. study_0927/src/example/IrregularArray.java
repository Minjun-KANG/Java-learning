package example;

public class IrregularArray {

	public IrregularArray() {
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		/*
		 * 비정방형 배열임
		 * ㅁㅁㅁ
		 * ㅁㅁ
		 * ㅁㅁㅁ
		 * ㅁㅁ
		 * 의형태를 가짐.
		 */
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 + j;
				/*
				 * 핵심은 intArray[i].length가 2 3으로 바뀌는 것. 거기에 10 11 12 20 21  순서로들어가는듯
				 */
			}
		}
		
		for (int i = 0; i < intArray.length; i++) { //같은 것에 출력문
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
