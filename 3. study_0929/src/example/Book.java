package example;

public class Book {
	String title;
	String author;
	
	public Book(String t) { // ������
		title = t; author = "���ڹ̻�";
	}
	public Book(String t, String a) { // ������
		title = t; author = a;
	}
	public static void main(String [] args) {
		Book littlePrince = new Book("�����", "�������丮"); // String t, a�� �޴� ������ ȣ��
		Book loveStory = new Book("������"); //String t�� �޴� ������ ȣ��
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
	/*
	 * eclipse������ package ���� Main�� ���Ƶ� RUN�׸񿡼� ��� ����� �� �ִ�.
	 * */
}