import java.util.Arrays;

public class Arr15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] iArr1 = {{10, 20}, {30, 40}};
		
		int[][] iArr2 = new int[2][];
		iArr2[0]  = new int[2];
		iArr2[1] = new int[2];
		
		iArr2[0][0] = 100; iArr2[0][1] = 200;
		iArr2[1][0] = 300; iArr2[1][1] = 400;
		
		int[] iArr3 = {10, 20, 30, 40};
		
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.deepToString(iArr1));
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.deepToString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		// System.out.println(Arrays.deepToString(iArr3));
	
		String[] sArr4 = {"감","밤","배"};
		
		System.out.println(Arrays.toString(sArr4));
		System.out.println(Arrays.deepToString(sArr4));
		
		String[][] sArr5 = {{"감","밤"},{"배","귤"}};
		
		System.out.println(Arrays.toString(sArr5));
		System.out.println(Arrays.deepToString(sArr5));
	}

}
