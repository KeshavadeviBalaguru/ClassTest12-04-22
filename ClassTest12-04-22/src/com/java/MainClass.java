package com.java;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int vcount=0;
		int ccount=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Value: ");
	   String str=sc.next();
	   str=str.toLowerCase();
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		   {
			   vcount++;
		   }
		   else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		   {
			   ccount++;
			   
		   }
	   }
	   System.out.println("Number of vowles is "+vcount);
	   System.out.println("Number of consonents is  "+ccount);

	}

}
