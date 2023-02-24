package testDSA;

public class Search1_LinearSearch {
	
	private void search(int[] arr, int item) {

		int count = 0;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(item == arr[i]) {
				count++;
				index = i;
				System.out.println("item found at "+index+" index position");
//				break; //->it will print only one index and break from loop
			}
		}
		if(count==0){
			System.out.print("item not found");
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {45,65,89,12,44,11,44};
		int item = 44;
		Search1_LinearSearch ls = new Search1_LinearSearch();
		ls.search(arr,item);
	}

}
