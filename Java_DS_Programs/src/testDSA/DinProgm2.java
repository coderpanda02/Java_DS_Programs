package testDSA;

public class DinProgm2 {

	public static void main(String[] args) {
		
		char word_a[] = new char[]{'F','O','S','H'};
		char word_b[] = new char[]{'F','I','S','H'};
		int[][] cell=new int[4][4];
		
		System.out.println("Using Longest Common Subsequence:");
		for(int i=0;i<word_a.length;i++) {
			for(int j=0;j<word_b.length;j++) {
				
				while(i==0 && j==0) {
					if(word_a[i]==word_b[j]) {
						cell[i][j]=1;
					}
					else {
						cell[i][j]=0;
					}
					break;
				}
				
				while(i==0 && j!=0) {
				 for(i=0,j=1;j<word_b.length;j++) {
					if(word_a[i]==word_b[j]) {
						cell[i][j]=cell[i][j-1]+1;
					}
					else {
						cell[i][j]=cell[i][j-1];
					}
				  }
				  break;
				}
				
				while(i!=0 && j==0) {
				 for(i=1,j=0;i<word_b.length;i++) {
					if(word_a[i]==word_b[j]) {
						cell[i][j]=cell[i-1][j]+1;
						
					}
					else {
						cell[i][j]=cell[i-1][j];
					}
				  }
				  break;
				}
				
				while(i>0 && j>0) {
					for(i=1;i<word_a.length;i++) {
						for(j=1;j<word_b.length;j++) {
							if(word_a[i]==word_b[j]) {
								cell[i][j]=cell[i-1][j-1]+1;
							}
							else {
								cell[i][j]=max(cell[i][j-1],cell[i-1][j]);
							}
						}
					}
					break;
				}
			}
		}
		
		for(int k=0;k<word_a.length;k++) {
			for(int l=0;l<word_b.length;l++) {
				System.out.print(" "+cell[k][l]);
			}
			System.out.println();
		}
		
	}
	
	private static int max(int i, int j) {

		int max;
		if(i>j) 
			max= i;
		else 
			max=j;

		return max;
	}


}
