
public class Arr06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = {10, 20, 30, 40, 50, 60};
		
		// iArr1을 for문을 이용해 가로방향 출력 
		for (int i =0; i< 6; i++){
			System.out.print(iArr1[i]+" ");
		}
		System.out.println();
		
		for(int j: iArr1) {
			System.out.print(j+" ");
		}
		
	}

}
