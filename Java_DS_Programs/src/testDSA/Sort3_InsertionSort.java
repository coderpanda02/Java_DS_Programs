 package testDSA;

public class Sort3_InsertionSort { 
//picks up no,checks small or large,puts in correct position

	public static void main(String[] args) {
		
		int[] arr = {25,62,11,12,78};

		for(int i=1;i<arr.length;i++) {  
		//assumes 1st no is in correct position
			int temp = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>temp) {  
			//checking whether bigger from anyone else then swap 0
				
				arr[j]=arr[j-1]; // checking till j>0
				j = j-1;
			}
			arr[j]=temp; //value of j is actually j-1 now,so come out of while
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
