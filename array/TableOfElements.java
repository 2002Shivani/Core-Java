package array;

public class TableOfElements {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		
		for(int i =0;i<array.length;i++) {
			for(int j =1 ;j<=10;j++) {
				System.out.print(array[i]*j+" ");
			}
			System.out.println();
		}
		
	}

}
