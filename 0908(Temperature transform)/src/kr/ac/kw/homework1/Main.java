package kr.ac.kw.homework1;

public class Main {

	public static void main(String[] args) {
		for(int F = 0; F<=300; F+=20) { //0부터 300까지의 수를 출력하기 위해 반복문사용
			System.out.println(F + "\t" + Math.round(((float)(F-32)*5/9)*10)/(float)10);
			/*주어진 양식대로 출력, 
			 Math.round의 메소드의경우 10^n 을 곱하고 나눠줘야 원하는 결과를 도출할 수 있음.
			 int 타입변수를 float변수로 강제형변환 한 사실이 2군데 있는데,
			  이는 (5/9)(F-32)에 대한 공식의 결과값을 소수점단위로 계산되기 위함과,
			 Math.round를 거쳐, 정수화된 값을 10으로 나누면서, 소수점단위를 출력하기 위한 2가지 과정으로 구분되어있음.
			*/
		}
        		
	}

}


