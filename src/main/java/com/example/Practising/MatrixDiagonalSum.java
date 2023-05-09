package com.example.Practising;

import java.util.Scanner;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int c[][]=new int [3][3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum=sum+c[i][j];
				}
			}
		}
		System.out.println();

		for(int i=0;i<3;i++) {
			
//				if(i==3-1-i) {
					if(i!=3-1-i) {
				sum+=c[i][3-1-i];
				System.out.println(c[i][3-1-i]);
//			}
				}
			}
		
		System.out.println(sum);
	}

}
