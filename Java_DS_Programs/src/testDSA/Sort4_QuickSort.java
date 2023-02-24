package testDSA;

public class Sort4_QuickSort {
	

	private void quicksort(int[] arr, int i, int j) {
		
		int low = i;
		int high = j;
		int piv = partition(arr, low, high); 
		//receiving the pivot value from partition 
		
		if(low<piv-1) {
			quicksort(arr,low,piv-1);
		}
		if(high>piv) {
			quicksort(arr,piv,high);
		}
	}

	private int partition(int[] arr, int i, int j) {
		
		int low = i;
		int high = j;
		int mid = (i+j)/2;
		int pivot = arr[mid];
//		int pivot = arr[low]; 
		//it will work in same logic as mid,nothing to change in code
		
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;  //working as continue
			}
			while(arr[high]>pivot) {
				high--;   //working as continue
			}
			int temp = arr[high]; //at this pt high val<pivot & low>pivot
			arr[high]=arr[low];   //so simply swapping the two values
			arr[low]=temp;
			low++;
			high--;
		}
		return low; //low value now reached to pivot
	}

	private void print(int[] arr) {
		
			System.out.println("Sorted: ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}
	
	
	public static void main(String[] args) {
		
		Sort4_QuickSort qs = new Sort4_QuickSort();
		
		int arr[]= {56,20,25,36,45,10,78};
		
		System.out.println("Unsorted: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		qs.quicksort(arr, 0, arr.length-1);
		qs.print(arr);

	}

}
