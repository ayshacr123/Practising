package com.example.Practising;

import java.util.Scanner;

public class ArrayIncrement {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements ");
		for(int i=0;i<3;i++) {
			 arr[i] = sc.nextInt();
		}
		int i=0;
			if(arr[i+2]==9&&arr[i+1]!=9) {
				arr[i+2]=0;
				arr[i+1]=arr[i+1]+1;
			}
			else if((arr[i+1]==9)&&(arr[i+2]==9)) {
				arr[i+2]=0;
				arr[i+1]=0;
				arr[i]=arr[i]+1;
			}
			else {
//				(arr[i] >= 0 && arr[i] <= 8 && arr[i+1] >= 0 && arr[i+1] <= 8 && arr[i+2] >= 0 && arr[i+2] <= 8) {
				arr[i+2]=arr[i+2]+1;
			}
			System.out.print("Updated array : ") ;
		for(int j=0;j<arr.length;j++)
			System.out.print(arr[j]);
	}
		
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//		    System.out.println("Enter a non-negative integer:");
//		    String numStr = sc.nextLine();

	    // convert the input string to an integer array
//	    int[] arr = new int[numStr.length()];
//	    for(int i = 0; i < numStr.length(); i++) {
//	        arr[i] = Character.getNumericValue(numStr.charAt(i));
//	    }

	    // iterate over the array, from the rightmost element to the leftmost element
//	    for(int i = arr.length - 1; i >= 0; i--) {
//	        if(arr[i] == 9) {
//	            arr[i] = 0;
//	        }
//	        else {
//	            arr[i]++;
//	            break;
//	        }
//	    }

	    // if the leftmost digit was incremented, and now has a value of 10, add an extra digit to the array
//	    if(arr[0] == 10) {
//	        int[] newArr = new int[arr.length + 1];
//	        newArr[0] = 1;
//	        newArr[1] = 0;
//	        for(int i = 2; i < newArr.length; i++) {
//	            newArr[i] = arr[i-1];
//	        }
//	        arr = newArr;
//	    }
//	    if(arr[0]==0) {
//	    	arr[0]=10;
//	    }

	    // print the updated array
//	    System.out.print("Updated array : ");
//	    for(int j = 0; j < arr.length; j++) {
//	        System.out.print(arr[j]);
//	    }
//	}



}
