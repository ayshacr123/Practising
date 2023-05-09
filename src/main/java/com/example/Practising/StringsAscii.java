package com.example.Practising;


//  SUBSTRING PROBLEM BY DIVIDING
public class StringsAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="AMEENA";
//		System.out.println(s.length());
		char ch= ' ';
		int mid=0;
		int first=0;
		int sum1=0;int sum2=0,z;
		if(s.length()%2==0) {
			mid=s.length()/2;
			for(int i=0;i<mid;i++) {
				sum1 = sum1+s.charAt(i)-'a'+1;
//				System.out.println((int) s.charAt(i) +" "+s.charAt(i));
			}
			
			for(int i=mid;i<s.length();i++) {
				sum2 = sum2 +s.charAt(i)-'a'+1;
			}
		}
		else {
			mid=s.length()/2;
			for(int i=0;i< mid;i++) 
			 {
				System.out.println(s.charAt(i));
				sum1 = sum1+s.charAt(i)-'a'+1;
				System.out.println(sum1);
			}
				
			System.out.println();
			for(int i=mid+1;i<s.length();i++) {
				System.out.println(s.charAt(i));
				sum2 = sum2 +s.charAt(i)-'a'+1;
			    System.out.println(sum2);
				}
			
//			z=s.charAt(s.length()/2)-'a'+1;
//			sum2=sum2-z;
		}
		
		
		if(sum1==sum2) {
			System.out.println("Success");
		}
		else {
			System.out.println("Not Success");
		}
//		System.out.println((char) 97);
	}
	

}
