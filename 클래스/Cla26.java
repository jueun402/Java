abstract class Ani26{
	abstract void Cry();
	Ani26(){System.out.println("--Ani26 실행");}
}

class Dog26 extends Ani26 {
	@Override
	void Cry() {System.out.println("멍 멍");} // 오버라이딩 : 부모가 정해놓은 함수의 이름 동일하게 지정해야함 
	Dog26(){System.out.println("--Dog26 실행");}
}

class Cat26 extends Ani26 {
	@Override
	void Cry() {System.out.println("야 옹");} // 오버라이딩
	Cat26(){System.out.println("--Cat26 실행");}
}

class Duck26 extends Ani26 {
	@Override
	void Cry() {System.out.println("꽥 꽥");} // 오버라이딩
	Duck26(){System.out.println("--Duck26 실행");}
}

public class Cla26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ani26[] Anis = {new Dog26(), new Cat26(), new Duck26()};
		for(Ani26 Ani : Anis) {Ani.Cry();}
		
/*
--Ani26 실행
--Dog26 실행
--Ani26 실행
--Cat26 실행
--Ani26 실행
--Duck26 실행
멍 멍
야 옹
꽥 꽥

 */
	}

}
