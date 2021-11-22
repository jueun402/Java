
public class Arr14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] oldStrArray = {"Java", "array","copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);	
		
		for(String s: newStrArray) {
			System.out.print(s +" ");
		}
		
		
		System.out.println();
		System.out.println(oldStrArray == newStrArray);
		System.out.println(oldStrArray.equals(newStrArray));
		System.out.println(oldStrArray[1]== newStrArray[1]); // 주소비교 True
		System.out.println(oldStrArray[1].equals(newStrArray[1])); // 값 비교 True
		
	}

}
