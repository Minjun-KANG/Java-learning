package example;

public class BitOperator {

	public BitOperator() {
		short a = (short)0x55ff; //short 2byte; 
		short b = (short)0x00ff;
		// ��Ʈ ���� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); // ��Ʈ AND
		System.out.printf("%3.2f\n", 132.354);
		System.out.printf("%08x\n",(short)(a & b)); // ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b)); // ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b)); // ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a)); // ��Ʈ NOT
		
		/*
		 * printf ����? ����; C������ printf �� ������ �����
		 * C����� %3.2f �� ����. �� %04x�� 4�ڸ��� ����ϵ� ���ʺ��� 0���� ä���, 16������ ����϶� ��� �ǹ�.
		 * %3.2f��, 3�ڸ��� ����ϵ� �Ҽ����� 2�ڸ��� ����϶� �ϴ°Ŷ� �Ȱ��� 132.354 ����ϸ� 132.35�� �����°Ŷ� ����
		 * 
		 * */
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		// ��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c <<2); // c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >>2); // c�� 2��Ʈ ������ ����Ʈ. 0 ����
		System.out.println(d >>2); // d�� 2��Ʈ ������ ����Ʈ. 1 ����
		System.out.printf("%x\n", (d >>>2)); // d�� 2��Ʈ ������ ����Ʈ. 0 ����
	}

}