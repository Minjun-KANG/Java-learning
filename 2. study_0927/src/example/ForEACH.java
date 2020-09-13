package example;

enum Week {월,화,수,목,금,토,일}
public class ForEACH {

	public ForEACH() {
		
		/* int Array[] = {1,2,3,4,5};
		int sum=0;
		for(int k : Array) //반복할 때마다 Array[0] , Array[1] 값으로 바뀜 
		{
			sum += k;
		}
		System.out.println(sum);*/
		
		/*String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		for (String s : names) // 반복할 때마다 s는 names[0], names[1], ..., names[5] 로 설정 // 문자열도 마찬가지
		System.out.print(s + " ");*/
		
		
		for (Week day : Week.values()) { // 반복될 때마다 day는 월, 화, 수, 목, 금, 토, 일로 설정
			System.out.print(Week.values() + "\t");
			System.out.println(day + "요일 ");
		}
		/*우선 enum은 클래스처럼 보이는 상수이다. 클래스안에서 생성하려면 top_level에 생성하라고 오류가 발생한다.*/
		/*또한 Week.values()의 값을 출력했을 떄 주소값이 발생하는 에러를 보인다.*/
	}
}

