package Array;

import java.util.Scanner;

public class MergeArrays {
	
	static void check(int[] arr1,int [] arr2,int [] arr3) {
		int []arr4=new int [arr1.length+arr2.length+arr3.length];
		
		int i=0,l=0,m=0,j=0;
		
		while(i<arr1.length) {
			arr4[j]=arr1[i];
			i++;
			j++;
		}
		while(l<arr2.length) {
			arr4[j]=arr2[l];
			l++;
			j++;
		}
		while(m<arr3.length) {
			arr4[j]=arr3[m];
			m++;
			j++;
		}
		
		for(int k=0;k<arr4.length;k++) {
			System.out.print(arr4[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int [] arr1=new int [a];
		int [] arr2=new int[b];
		int [] arr3=new int[c];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=scan.nextInt();
		}
		check(arr1,arr2,arr3);

	}

}
