package com.example.Practising;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindromicSubstring {
	public static boolean check(String s, int i, int j) {
		while (i < j)
		{
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static String longs(String s) {
		int start = 0;
		int max = 0;
//		List<String> list=new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
			//	System.out.println(s.substring(i, j+1));
				if(check(s,i,j)) {
				if(max<=j-i+1) {
					max=j-i+1;
					start=i;
				}
					}
			}
					
					}return s.substring(start,start+max);
//					list.add(s.substring(i, j+1));
}
//		int count=0;
//		String d="";
//		for(String s3:list) {
//			int c=s3.length();
//			count=Math.max(c, count);
//			 
//		}
//		for(String dg:list) {
//			if(dg.length()==count)
//				d=dg;
//		}
//		return ;
	
	public static void main(String args[]) {
		String s = "ababc";
		System.out.println(longs(s));
	}
}
