package com.java.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static void anagram(String s1,String s2) {
		boolean flag=true;
		if(s1.length()!=s2.length()) {
			flag=false;
		}
		else {
			char[]arr1=s1.toLowerCase().toCharArray();
			char[]arr2=s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			flag=Arrays.equals(arr1, arr2);
		}
		if(flag) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    anagram(s1,s2);
		
		
	}
}
