package com.example.Practising;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class CharacterUnique {
	public static void main(String[] args) {
		String s="leetcode";
		int result=0;
		char[] ch=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch){
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(char c:ch){
			if(map.get(c)==1){
				result= s.indexOf(c);
				break;
			}
			else{
				result= -1;
			}
		}
		System.out.println(result);}
	}
