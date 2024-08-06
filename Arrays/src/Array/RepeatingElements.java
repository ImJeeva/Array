package Array;

import java.util.Scanner;

public class RepeatingElements {
	static void check(int [] arr1,int [] arr2) {
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int [] arr1=new int[a];
		int [] arr2=new int [b];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		check(arr1,arr2);
		

	}

}
