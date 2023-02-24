package testDSA;

public class Sort2_SelectionSort {   //finds min val put it in front...
	

	private void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min = i;
			int temp = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) { 
					min = j;
				}	
			}
			temp = arr[i];
			arr[i]=arr[min]; // min = j
			arr[min]=temp;
		}
	
	}

	
	private void print(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		 
		Sort2_SelectionSort obj = new Sort2_SelectionSort();
		int arr[] = {25,2,65,11,10,17};
		obj.sort(arr);
		System.out.println("Sorted array is: ");
		obj.print(arr);
		
	}
	
}
