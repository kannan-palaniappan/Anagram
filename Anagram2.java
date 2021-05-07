package com.java.anagram;

import java.util.Scanner;

public class Anagram2 {
	public static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}
		
		int countarr[]=new int[256];
		
		for(int i=0;i<str1.length();i++) {
			countarr[str1.charAt(i)]++;
			
			countarr[str2.charAt(i)]--;
		}
		
		for(int j=0;j<countarr.length;j++) {
			if(countarr[j]!=0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		if(isAnagram(str1,str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
		
		
	}

}
