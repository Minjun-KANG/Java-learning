package example;

public class NumException {

	public NumException() {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}
		/*
		 * 
		 * Exception �� �߻��ϸ�, �׳� ������ ���� ������ ������, for���� ���̻� �������� ���Ѵ�.
		 */
	}

}