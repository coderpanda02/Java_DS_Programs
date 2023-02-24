package testDSA;

public class Sort5_MergeSort {
	

	int length;
	int mid;


	private void mergeSort(int[] arr) {  //dividing the array into sub arrays
		this.length = arr.length;
//		int length = arr.length;
		if(length<2) {
			return;

		}
		else {
			int middle = length/2;
			this.mid = middle;
			int[] left = new int[mid];
			int[] right = new int[length-mid];

			for(int i=0;i<mid;i++) {
				left[i] = arr[i];
			}
			for(int j=mid;j<length;j++) {
				right[j-mid] = arr[j]; //right[0],right[1],.....
			}
			
			mergeSort(left);
			mergeSort(right);
			merge(left,right,arr);

			}
		}

	private void merge(int[] left, int[] right, int[] arr) {
		
		int l = left.length;
		int r = right.length;
		int i = 0;
//		int j=mid;
		int j = 0;
		int k = 0;
		while(i<l && j<r) {
			if(left[i]<=right[j]) {
				arr[k]=left[i]; //k=0
				i++;
			}
			else {
				arr[k]=right[j]; //k=0
				j++;
			}
			k++; //k=1
		}
		while(i<l) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<r) {
			arr[k]=right[j];
			j++;
			k++;
		}

	}
	
	private void print(int[] arr) {
		System.out.print("Sorted array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,6,3,4};
		Sort5_MergeSort m = new Sort5_MergeSort();
		m.mergeSort(arr);
		m.print(arr);
}

}
