package javastart;

public class SortingArrays4 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {20,2,78,36,23,45,11};
		int temp = 0;
		System.out.println("Elements of original arrays"); 

			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " "); 
				}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
																		
						}
					}
				}
				
			System.out.println();

			System.out.println("Elements of sorted arrays");  
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i] + " ");
			}
				
		}
		
		

	}

/*
Elements of original arrays
20 2 78 36 23 45 11 
Elements of sorted arrays
2 11 20 23 36 45 78
*/
