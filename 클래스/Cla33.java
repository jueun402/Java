/*
 * 익명 구현 객체
 */
interface iAni33{ void Cry();void Shout();}

class cDog33 implements iAni33{
	public void Cry() {System.out.println("멍 멍");}
	public void Shout() {System.out.println("므 르 렁");}
	
}
public class Cla33 {

	public static void main(String[] args) {
					//선언적 구현객체 
		cDog33 d1 = new cDog33(); d1.Cry(); d1.Shout();
		
					// 익명 구현객체
		iAni33 c1 = new iAni33() {
				// interface 구현  
				// 일시적으로만 사용 
				public void Cry() {System.out.println("야 옹");}
				public void Shout() {System.out.println("야 르 렁");}

				}; 
		c1.Cry(); c1.Shout();
		
	}
}
