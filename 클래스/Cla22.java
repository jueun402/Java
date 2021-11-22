/***
 * [06-4 메소드] 혼공자 p.247 
 * 자바 = 다중상속 불가 
 * why? 
 * 
 * A와 B에서 D가 상속받았음
 * if Z로부터 A와 B가 name을 상속받았다면 => D의 name은 누구로부터 상속? 
 * => 메모리에서 애매모호한 것은 불가능하게 처리함 
 ***/

// 다중상속 불가 경우 
//class A22{}
//class B22{}
//class C22{}
//class D22 extends A22, B22, C22{} // 오류 

// Java는 다중상속 불가 ==> Interface로 대체

interface iA22{}
interface iB22{}
class iD22 implements iA22, iB22{}  

public class Cla22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
