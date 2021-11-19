/**************************
[final 필드와 상수] # 혼공자 p. 281

final => 봉인되다

final 변수 => 상수 
final 메소드 => 오버라이딩 불가 
final 클래스 => 상속 불가 
***************************/

class A19{

	final int a1 = 2021; // 코드상 변수 받기 
	final int a2;  	// 생성자를 통해 변수 받기 
	
	A19(int a2){this.a2 = a2;}
	
	static final int b1 = 7777; // Java에서의 변수 
	
	
	// final 메소드 => 오버라이딩 불가 
	final void Hi() { System.out.println("안녕^^");}
	void Bye() { System.out.println("잘가 TT");}
}

class B19 extends A19{
	B19(int a2){super(a2);	}
	
//	void Hi() { System.out.println("안녕^^");}
	void Bye() { System.out.println("잘가세요 TT");}
}

class C19 extends B19{
	C19(int a2){super(a2);	}
	
//	void Hi() { System.out.println("안녕^^");}
	void Bye() { System.out.println("잘가세요 TT");}
}

public class Cla19 {

	public static void main(String[] args) {

		A19 aa1 = new A19(1000); 
//		aa1.a1 = 4000; aa1.a2 = 5000; // error
		A19 aa2 = new A19(3000);
	}
}
