/***
 * [06-1 객체지향 프로그래밍] 혼공자 p.212 
 * 
 * 클래스, 객체, 인스턴스 설명 
 * 서로다른 데이터 타입에 대한 데이터를
 * 한꺼번에 메모리에 올려놓기 위해서 클래스를 쓴다 
 * 변수는 여러번 , Array는 동일 타입일 때 한번에 담을 수 있음
 * 홍길동이란 내용의 여러개 타입을 가져와야 함 = 한꺼번에 메모리에 못 올림 
 * 서로다른 타입을  한번에 가져올 수 있는 구내식당의 식판 == 클래스 
 ***/ 

/*******************
서점 : 주 Data --> 책 ( 제목, 저자, 가격) : 혼공자, 홍길동, 24000

서점 
Object --> 책 
class --> 제목, 저자, 가격 
Instance --> 혼공자, 홍길동, 24000

동사무소 
Object --> 사람 
class --> 이름, 주민번호, 주소, 가구수 // 멤버들 
Instance --> 홍길동, 000000-000000, 도곡동 아트빌라 101, 4인 가구 

학원 
주데이터 : 교육과정, 강사, 수강생 ... 
주 항목 별 전산시스템에 들어갈 내용들이 있음
교육과정 : 교육 제목, 내용, 치수, 목적 
강사 : 강사 이름, 주민번호, 근무 경력, 강의 경력 ... 
수강생 : 이름, 생년월일, 학력, 전공, 주소,특장점 ... 
*********************/

class Book01{
	// Class Member Filed 
	// object 
	// 초기화 ver
//	String title = "혼공자";  
//	String author = "홍길동";
//	int price = 24000;

	String title;   // null 초기화 
	String author; // null 초기화 
	int price; // 0 초기화 

	// Class Member Method 
	// method 정의 
	void pBook(){
		System.out.println(title + "," + author+","+price);
	}
}

public class Class01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book01 b1 = new Book01();
		b1.pBook(); 
		b1.title = "자바의 정석"; b1.author = "Tom"; b1.price = 30000;
		b1.pBook();
		
		Book01 b2 = new Book01();
		b1.pBook(); 
		b2.title = "SQL"; b2.author = "Tom"; b2.price = 30000;
		b2.pBook();
		
//		System.out.println(b1.title + "," + b1.author+","+b1.price);	
	}
}







