/***
 * [07-2 타입 변환과 다형성] 
 * 
 * 자동 타입 변환 설명 
 * 
 * 게시 항목(적은) = 실제 항목(많은)
 * 게시 항목(부모) = 실제 항목(자식) 
 * 부모 클래스 변수 = 자식 클래스 공간 => 자동 형 변환
 * 
 * 부모 = new 자식() (O)
 * 자식 = new 부모() (X) 
 ***/ 


class A20{int a = 20;}
class B20 extends A20 {int b = 100;}


public class Cla20 {

	public static void main(String[] args) {

		// 부모 = new 자식() => o
		// 자식 = new 부모() => x 
		
		A20 z1 = new A20();
		B20 z2 = new B20();
		A20 z3 = new B20();
//		B20 z4 = new A20(); // 큰 자식 = 작은 부모 => X  // 오류 
//		B20 z4 = (B20)new A20(); // 큰 자식 = 작은 부모 => X //  오류 

		// 게시 항목(적은) = 실제 항목(많은) 
		// 게시 항목(부모) = 실제 항목(자식) ==> A20 z3 = new B20();
		// 부모 클래스 변수 = 자식 클래스 공간 ==> 자동 형 변환 
		
		// 큰 size  = 작은 size;  
		short a = 10;
		int b = a;
		int c = 20;
		short d = (short) c;
	}

}
