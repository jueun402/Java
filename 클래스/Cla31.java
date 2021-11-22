/*
 *  중첩 클래스
 */

class Book31{
	String title = "자바";
//	String author = "홍길동";
	
	// 다수의 데이터 타입을 하나에 넣을 때는 class 사용 
	// 중첩 클래스 
	class author31{ 
		String name = "홍길동";
		String school = "대졸";
		String gender = "남";
		int age = 30;
		}
	int price = 34000;
}

public class Cla31 {

	public static void main(String[] args) {

		Book31 b1 = new Book31();
		System.out.println(b1.title);
		System.out.println(b1.price);

		Book31.author31 a1 = b1.new author31();
		
		System.out.println(a1.name);
		System.out.println(a1.age);
	}

}
