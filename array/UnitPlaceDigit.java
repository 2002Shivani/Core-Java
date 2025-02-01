package array;

public class UnitPlaceDigit {

	public static void main(String[] args) {
	
		int array[] = {45,19,10,35,37};
		
		for(int i =0;i<array.length;i++) {
			System.out.print((array[i]%=10)+" ");
		}
		
		
	}

}
