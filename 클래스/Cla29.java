interface iAnimal29{
	
	// interface에서 정의 => static final 은닉 
	static final String name1 = "동물1"; // static final <-- Java에서 상수 
	String name2 = "동물1";  // <-- static final 은닉  <== Java 7.x 
	
	void Cry(); // public abstract 은닉 
	public abstract void Shout();	
	////////////////////////////////////////////////////////////
	
	static void Jump() {} // <== Java 8.x 
	default void Run() {} // instance 멤버
}

class Dog29 implements iAnimal29{
	
	public void Cry() {}
	public void Shout() {}
}
public class Cla29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
