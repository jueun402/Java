class Point11{
	
	int x; int y;
	
	Point11(int x,int y){
		this.x = x; this.y = y;	
		System.out.println("좌표 : ("+this.x+","+this.y+")");}

	static void sum(int i, int j) {System.out.println(i+j);}
	
	// 클래스가 데이터 타입으로 보여야 한다.
	static void sum(Point11 m, Point11 n) {
		int pX = m.x + n.x;
		int pY = m.y + n.y;
		System.out.println("좌표 : ("+pX+","+pY+")");
	}

	static String pSum(String s1, String s2) {return (new String (s1+s2));}
	
	static Point11 pSum(Point11 p1, Point11 p2) {
		int pX = p1.x + p2.x;
		int pY = p1.y + p2.y;
		
		return (new Point11(pX, pY));
		
	}
	
	static Point11 pMove(Point11 p1, int i, int j) {
		int pX = p1.x + i;
		int pY = p1.y + j;
		
		return (new Point11(pX, pY));	
	}
}

public class Cla11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point11 p1 = new Point11(20, 10); // 좌표:(20,10)
		Point11 p2 = new Point11(30, 20); // 좌표 :(30,20)
		
		Point11.sum(100,300); // 좌표 : (50,30)
		Point11.sum(p1,p2); // 좌표 : (50,30)
		
		String s3 = Point11.pSum("대한", "민국");
		
		Point11 p3 = Point11.pSum(p1,p2);
		
		System.out.println("좌표 : ("+p3.x+","+p3.y+")");}
		
		// x축 15 , y축 25
		Point11 p4  = Point11.pMove(p1,5,25);
}

