package testDSA;

//import java.util.Scanner;

public class DinProgm {

	public static void main(String[] args) {
	
		char word_a[] = new char[]{'H','I','S','H'};
		char word_b[] = new char[]{'F','I','S','H'};
		int[][] cell=new int[4][4];
		
//		Dynamic Programming using Longest Common Substring
		
		System.out.println("using Longest Common Substring: ");
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
							cell[i][j]=0;
							
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
							cell[i][j]=0;
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
								cell[i][j]=0;
							}
						}
					}
					break;
				}
			}
		}
		
		for(int i=0;i<word_a.length;i++) {
			
			for(int j=0;j<word_b.length;j++) {
				System.out.print(" "+cell[i][j]);
			}
			System.out.println();
		}
		
	}
}
