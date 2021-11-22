
public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArr = new int[3];// 좌측은 스택에 선언됨   // 값 형 array
		System.out.println(iArr[0]);
		System.out.println(iArr.length);

		String[] sArr = new String[3];
		System.out.println(sArr[0]);
		System.out.println(sArr.length);

		iArr[0] = 10; iArr[1] = 20; iArr[2] = 30;
		int a = 10;
		System.out.println(a == iArr[0]); // 값의 비교
		
		String[] sArr2 = new String[] {"감","밤","배"};
		String[] sArr3 = new String[] {"감","밤","배"};
		
		String s = "감";
		System.out.println(s == sArr2[0]);
		String s2 = new String("감");
		System.out.println(s2);
		System.out.println(s == sArr3[0]);
		System.out.println(s2 == sArr3[0]);
	
	
	}
 
}
