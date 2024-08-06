package Array;

import java.util.Scanner;

public class MergeArray {
	static void check(int [] arr1,int arr2[]) {
		int [] arr3=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		for(int x=0;x<arr3.length;x++) {
			System.out.print(arr3[x]+" ");
			
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int [] arr1=new int [a];
		int [] arr2=new int[b];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		check(arr1,arr2);

	}

}
