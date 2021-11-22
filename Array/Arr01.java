
public class Arr01 {

	public static void main(String[] args) {
		
		// int a1 = 10, a2 = 20, a3 = 30;
		
		int a;
		// System.out.println(a); // stack의 값 형 : 자동 초기화 안됨 


		int iArr[] = {10, 20, 30}; // 데이터를 힙에 만들 수 있음 
		int[] jArr = {11, 22, 33};
		int[] mArr = new int[3]; // Heap의 값형 : 자동초기화 함  : 0 초기화 
		mArr[0] = 12; mArr[1] = 22; mArr[2] = 33; // stack은 힙에 있음 
		
		System.out.println(mArr[0]);
				
		mArr = null; // 사라지게 됨 
		System.out.println(mArr);
		int[] kArr = null; // 메모리 해제도 가능 
		
		// String sArr[] = {"강","밤","배"};
		// String[] sArr = {"강","밤","배"};
		
		/////////////////////////////////////////////////////////// 
		int zArr[] = new int[] {11, 22, 33}; // 데이터를 힙에 만들 수 있음 
		
		String[] sArr = new String[] {"강","밤","배"}; // new String[]을 은닉시킴 
		// String[] sArr = {"강","밤","배"};
		
		
		String[] sArr2 = new String[3];
		
		// 참조 타입은 주소를 담기 때문에, 초기값은 항상 null이다.
		
	
	}

}
