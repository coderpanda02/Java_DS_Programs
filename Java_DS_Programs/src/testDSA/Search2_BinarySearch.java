package testDSA;

public class Search2_BinarySearch {
	
	private void search(int[] arr, int item, int low, int high, int mid) {
		
//		array should be previously sorted for bin search
		
		boolean flag = false;
//		int index = 0; -->try using more than 1 same no in array
		while(low<=high) {
			if(item == arr[mid]) {
				System.out.println("item found at "+mid+" index position");
				flag = true;
				break;
			}
			else if(item<arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			mid = (high+low)/2;
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		
	}


	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,4,5};
		int item = 4;
		int low = 0;
		int high = arr.length-1;
		int mid = (high + low)/2;
		
		Search2_BinarySearch bs = new Search2_BinarySearch();
		bs.search(arr,item,low,high,mid);

	}

}
