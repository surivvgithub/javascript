package javastart;

public class SortingArraysjava3 {

	public static void main(String[] args) {
		
		int arr[]= new int[] {10,2,8,5,9,7,1};
		int temp=0;
		
		System.out.println("Elements of original array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
		System.out.println();
		System.out.println("Elements of Sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
			
}

}
