class Ani17{
	String a = "Ani-a";
	void cry() {System.out.println("으 앙");}
	void shout() {System.out.println("으 르 렁 ");}
}

class Dog17 extends Ani17{
	String a = "Dog-a";
	
	void pDog(){System.out.println(this.a);
			System.out.println(super.a);}

	// Method Override 
	void cry() {System.out.println("멍 멍 ");
				//super.cry();
	}
	
	@Override
	void shout() {System.out.println("무 르 렁 ");}

}

public class Cla17 {

	public static void main(String[] args) {
		Dog17 d1 = new Dog17();
		//System.out.println(d1.a);

		// 부모의 인스턴스가 사라지지 않음. => 은닉된 상태로 남아있음
//		d1.pDog();
		// 자바에서는 가려놓고 자기걸 우선적으로 쓴다. 
		d1.cry();
		d1.shout();
		

	}

}
