package example;

public class IrregularArray {

	public IrregularArray() {
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		/*
		 * 搾舛号莫 壕伸績
		 * けけけ
		 * けけ
		 * けけけ
		 * けけ
		 * 税莫殿研 亜像.
		 */
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 + j;
				/*
				 * 肺宿精 intArray[i].length亜 2 3生稽 郊餓澗 依. 暗奄拭 10 11 12 20 21  授辞稽級嬢亜澗牛
				 */
			}
		}
		
		for (int i = 0; i < intArray.length; i++) { //旭精 依拭 窒径庚
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
