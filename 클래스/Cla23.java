/***
 * [07-2 참조형 형변환 주요 개념 ] 
 ***/

class TV23{
	void PowerOn() {System.out.println("TV PowerOn");}	
	void PowerOff() {System.out.println("TV PowerOff");}
}

class LGTV23 extends TV23{ 
	//오버라이딩
	@Override
	void PowerOn() {System.out.println("LGTV PowerOn");}	
	void PowerOff() {System.out.println("LGTV PowerOff");}
}

class SSTV23 extends TV23{ 
	//오버라이딩
	@Override
	void PowerOn() {System.out.println("SSTV PowerOn");}	
	void PowerOff() {System.out.println("SSTV PowerOff");}
}


class HDTV23 extends TV23{ 
	//오버라이딩
	@Override
	void PowerOn() {System.out.println("HDTV PowerOn");}	
	void PowerOff() {System.out.println("HDTV PowerOff");}
}

class KTTV23 extends TV23{ 
	//오버라이딩
	@Override
	void PowerOn() {System.out.println("KTTV PowerOn");}	
	void PowerOff() {System.out.println("KTTV PowerOff");}
}

public class Cla23 {
	public static void main(String[] args) {

// 		자식 = 자식 
//		LGTV23 tv1 = new LGTV23(); tv1.PowerOn(); tv1.PowerOff();
//		SSTV23 tv2 = new SSTV23(); tv2.PowerOn(); tv2.PowerOff();
//		HDTV23 tv3 = new HDTV23(); tv3.PowerOn(); tv3.PowerOff();

// 		부모  = 자식 자동 형변환 
//		TV23 tv1 = new LGTV23(); tv1.PowerOn(); tv1.PowerOff();
//		TV23 tv2 = new SSTV23(); tv2.PowerOn(); tv2.PowerOff();
//		TV23 tv3 = new HDTV23(); tv3.PowerOn(); tv3.PowerOff();

		// 배열로 사용 good 
		TV23[] Tvs = {new LGTV23(), new SSTV23(), new HDTV23(), new KTTV23()};
		
		for(TV23 tv : Tvs) {tv.PowerOn(); tv.PowerOff();}
	}
}
