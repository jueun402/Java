
class Clac03{
	
	// Instance Member
	void Sum(int i, int j) {System.out.println(i+j);}
	
	// Static Member => 공유
	static void Mul(int i, int j) {System.out.println(i*j);} // Static은 같이써야함 

}

public class Cla03 {

	static void Sub(int i, int j) {System.out.println(i-j);}
//	void Div(int i, int j) {System.out.println(i/j);}	// 비추 
	
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		
		Clac03 c1 = new Clac03(); // <-- Instance 멤버 : Instance 생성 new ~~(); 변수.멤버; 
		c1.Sum(a,b);
		// Calc03 c2 = new Calc03();
		// c2.Sum(200,100);
		Clac03.Mul(a,b); // <-- Static 멤버 : 클래스명.멤버 

		Clac03.Sub(a,b); // <-- Static 멤버 : 클래스명.멤버 
		Sub(a,b);
		
//		Clac03 c3 = new Clac03();
//		c3.Div(300,100);
	}

}
