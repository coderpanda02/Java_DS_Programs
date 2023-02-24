package testDSA;

public class Sort1_BubbleSort {   //compares 1 with 2, 2 with 3...
	
//	to sort int array -->
	
//	private void sort(int[] arr) {
//		
//		for(int i=0;i<arr.length;i++) { 
	//for count->(total elements-1)times execution
//			int temp = 0;
//			Boolean flag = false;
//			for (int j=0;j<arr.length-1-i;j++) { 
			//-i ->skip last element as already sorted
//			/*for (int j=0;j<arr.length-1;j++) {  
			//not suitable for large arrays*/
//				if(arr[j]>arr[j+1]) {
//					temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;	
//				}
//				flag = true;
//			}
//			if(flag == false) { 
			//if array is sorted,still count is remaining->stop sorting
//				break;
//			}
//		}	
//	}
	
	
//	to sort String array -->
	
	
	private void sort(String[] arr) {
		
		for(int i=0;i<arr.length;i++) { 
			//for count->(total elements-1)times execution
			String temp;
			Boolean flag = false;
			for (int j=0;j<arr.length-1-i;j++) { 
			//-i ->skip last element as already sorted
				if(arr[j].compareTo(arr[j+1])>0) { 
				//1->(alphabetically after),-1->(before),0->same
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
				flag = true;
			}
			if(flag == false) { 
			//if array is sorted but still count is remaining
				break;
			}
		}	
		
	}
	
	
	
	public static void main(String[] args) {
		 
		Sort1_BubbleSort obj = new Sort1_BubbleSort();
		
//		int[] arr = {25,2,65,11,10,17};
		String[] arr = {"abir","namrata","sejal","prakash","ajay"}; 
		
		//sorting string array
		obj.sort(arr);
		
		System.out.println("Sorted array is: ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
