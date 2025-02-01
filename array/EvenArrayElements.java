package array;

public class EvenArrayElements {

	public static void main(String[] args) {
		int array[] = {1,3,4,5,6};
		int count =0 ,sum =0;
		for(int i =0;i<array.length;i++) {
			
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
				count++;
				sum+=array[i];
			}
			
		}
		
		System.out.println("\nTotal Even Elements:"+count);
		System.out.println("Sum of all Even Elements:"+sum);
	}

}
