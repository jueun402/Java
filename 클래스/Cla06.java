
class Book06{

	String title = "무제";
	String author = "미상";
	int price = 0;
	
	void pBook(){System.out.println(title + "," + author+","+price);}

	// 생성자 메소드 오버로딩 
	
	// 생성자(Constructor) 메소드  	
	// 기본생성자 --> Book06(){}
	// 숨겨진 첫번째 생성자. 하나라도 명시된 생성자가 나오면 기본생성자 사라짐 
	Book06(){System.out.println(" -->Book06() 실행");}
	
	// 명시적 생성자 
	Book06(String t, String a, int p){title = t;  author = a; price = p; }	

	Book06(String t, String a){title = t;  author = a;  }	
	
	Book06(String t){title = t; }	

}

public class Cla06 {

	public static void main(String[] args) {

		Book06 b1 = new Book06();// 힙에다 만들음 
		b1.pBook();
	
		Book06 b2 = new Book06("Java","Tom",30000);// 힙에다 만들음 
		b2.pBook();
		
		Book06 b3 = new Book06("IT","Alice");// 힙에다 만들음 
		b3.pBook();

		Book06 b4 = new Book06("OOP");// 힙에다 만들음 
		b4.pBook();

	}

}
