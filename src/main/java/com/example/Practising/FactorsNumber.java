package com.example.Practising;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FactorsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=212; int sum=0,rev=0;
		int v=s;
		while(s>0) {
			rev=s%10;
			sum=sum*10+rev;
			s=s/10;
			
		}
		System.out.println(sum);

		
		if(v==sum) {
			System.out.println("Anagram");
			System.out.println(sum);

		}
		else {
			System.out.println("No");
			System.out.println(sum);
		}
		
	}
}
	


