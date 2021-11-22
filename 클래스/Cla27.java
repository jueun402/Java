/*
 * Interface
 */
interface iAnimal27{ // Interface --> 기본적으로 추상 Method만 쓰게 됨 
	// interface는 상속받아서 구현해줘야 함
	// so, 인터페이스의 기본 접근 제한자 : public 
	public void Cry(); // <--기본 접근 제한자 : public 
	void Shout(); // <--기본 접근 제한자 : public
}

// interface는 implements로 받음 
class Dog27 implements iAnimal27{
	
	// 왜 public을 반드시 써야할까? 고민 
	// default < public (크기 비교) => 접근 제한자를 더 작은 타입으로 지정 못함. 
	// so, interface를 상속받아 쓰므로 public으로 지정해야 함. 
	
	public void Cry() {System.out.println("멍 멍");}
	public void Shout() {System.out.println("므 르 렁");}
}

public class Cla27 {

	public static void main(String[] args) {

		Dog27 d1 = new Dog27();
		d1.Cry(); d1.Shout();
	}

}
