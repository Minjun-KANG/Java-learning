package example;

public class TypeConversion { //���� 2.3

	public TypeConversion() {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); //��������ȯ 32bit�� �����͸� (char)������ ���� �ڿ��� 8bit���� 0x41�� ���
		System.out.println((byte)(b+i)); //�̵� ��������ȯ�� �Ͼ��, 227�� binary���� 0b11100011 ��, �Ǿ��� ��ȣ��Ʈó���Ͽ� -29�� ����. byte�� 8bit  
		System.out.println((byte)0b11100011);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}

}