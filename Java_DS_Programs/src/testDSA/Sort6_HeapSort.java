package testDSA;

public class Sort6_HeapSort {  //using max heap concept

	private void sort(int[] arr) {
		
		int length = arr.length;
		
		for(int i=length/2-1;i>=0;i--) {   
		//heapify starts from right (last) subtree root
			heapify(arr,length,i);
		}
		
		for(int l=length-1;l>=0;l--) {  
		//after previous heapify,largest at top,at 0 indx
			int temp = arr[0];  //setting largest at the last of the array
			arr[0]=arr[l];
			arr[l]=temp;
			
			heapify(arr,l,0);  //again heapifying excluding last element,
//								 l=length-1
		}
		
	}

	private void heapify(int[] arr, int length, int i) {
		
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if(leftChild<length && arr[leftChild]>arr[largest]) {
			largest=leftChild;
		}
		
		if(rightChild<length && arr[rightChild]>arr[largest]) {
			largest=rightChild;
		}
		
		if(largest!=i) {    //largest is changed
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr, length, largest); 
			//again heapifying with new largest(same subtree)
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {22,10,17,20,11};
		Sort6_HeapSort hs = new Sort6_HeapSort();
		hs.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
