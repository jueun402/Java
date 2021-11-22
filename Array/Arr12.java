
public class Arr12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = {10, 20, 30};
		int[] iArr2 = {10, 20, 30};
		int[] iArr3 = iArr1;
		
		iArr1[1] = 2000;
	
	
		for(int i: iArr1) {System.out.print(i+" ");}		
		System.out.println("");
		for(int i: iArr2) {System.out.print(i+" ");}		
		System.out.println("");
		for(int i: iArr3) {System.out.print(i+" ");}		
		System.out.println("");
		
		//////////////////////////////////////////////
		
		String[] sArr1 = {"감","밤","배"};
		String[] sArr2 = {"감","밤","배"};
		String[] sArr3 = sArr1;
		
		sArr1[1] = "포도";
				
		for(String i: sArr1) {System.out.print(i+" ");}		
		System.out.println("");
		for(String i: sArr2) {System.out.print(i+" ");}		
		System.out.println("");
		for(String i: sArr3) {System.out.print(i+" ");}		
		System.out.println("");
		
	}

}
