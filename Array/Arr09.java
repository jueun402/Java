
public class Arr09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] iArr1 = {{10, 20, 30, 40}, 
//						{50, 60}, 
//						{70, 80, 90}};
		
		int[][] iArr1 = new int[3][];
		iArr1[0] = new int[] {10,20,30,40};		
		iArr1[1] = new int[] {50,60};
		iArr1[2] = new int[] {70, 80, 90};		
		
				
		// iArr1 을 행렬 구조에 맞춰서 출력 
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
