package com.java.training.assignment_tws;

import java.util.Scanner;

public class StringRepeat {
	public static String RepeatString(String s,int n) {
		
		String st="";
		for(int i=0;i<n;i++)
			st+=s;		
		return st;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();		
		int n=scan.nextInt();
		scan.close();
		System.out.println(RepeatString(s,n));
			

	}

}
