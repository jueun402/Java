
class Sing12{
	// Sing12() <-- 생성자로 Heap 공간 확보 
	
	private static Sing12 sing = new Sing12(); // static = 공용공간 
	private Sing12(){System.out.println("Sing12() 실행됨");} // 외부에서 접근 안됨
	
	static Sing12 getInstance(){return sing;}

	
}
public class Cla12 {

	public static void main(String[] args) {

//		Sing12 s1 = new Sing12();
//		Sing12 s2 = new Sing12();
//		
//		System.out.println(s1 == s2); // 주소비교  s1과 s2는 서로 다른 Instance(주소)이다. false 
		// 목적 : 딱 한번만 방을 만들어놓고 관리 heap 
		// 생성자를 heap의 공간에 딱 한번만 만들기 위한 것 == Singleton 
		
		Sing12 s1 = Sing12.getInstance();
		Sing12 s2 = Sing12.getInstance();
		System.out.println(s1 == s2);  // True

	}

}
