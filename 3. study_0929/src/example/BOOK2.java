package example;

public class BOOK2 { //���� 4.5�� ������ �־ ���� �����ߴ�.

	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public BOOK2() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public BOOK2(String title) {
		this(title, "���ڹ̻�");
	}
	public BOOK2(String title, String author) {
		this.title = title; this.author = author;
	}
	
	public static void main(String [] args) {
		BOOK2 littlePrince = new BOOK2("�����", "�������丮");
		BOOK2 loveStory = new BOOK2("������");
		BOOK2 emptyBook = new BOOK2(); //������ ȣ��� ���� ������ ȣ��� ���
		
		littlePrince.show(); // ����� �������丮
		loveStory.show(); // ������ ���ڹ̻�
		emptyBook.show(); //��µ����� ���������
	}
}