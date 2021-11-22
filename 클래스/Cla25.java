abstract class Ani25{
	
	String name = "이름";
	
	abstract void cry(); // 추상 Method (Abstract) --> 선언만 존재 
	void shout() {System.out.println("으 르 렁");} // 일반 Method --> 선언  + 구현 
	void walk() {System.out.println("걸 어");}
}

class Dog25 extends Ani25{

	void cry() {System.out.println("으 앙");} // 추상 -->구현 
	void Jump() {System.out.println("깡 총");} // 하위  구현 
	void walk() {System.out.println("걸을래");} // Override 
}

public class Cla25 {

	public static void main(String[] args) {

		Dog25 d1 = new Dog25();
		
		d1.cry(); d1.shout(); d1.Jump(); d1.walk();
		
		System.out.println(d1.name);
		
	}

}
