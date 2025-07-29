package com.hyd.tnsif.tcs;

import java.util.Scanner;

//Demo of memory game
public class MemoryGame {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the array size");
	  int n=s.nextInt();
	  System.out.println("Enter n values");
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++) {
		  arr[i]=s.nextInt();
	  }
//	System.out.println("Enter no.of testcases");
	//int test=s.nextInt();
	for(int j=0;j<2;j++) {
		int num=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(num==arr[i]) {
				count++;
			}
		}
			//if elements present in the array
			if(count!=0) {
				System.out.println(count);
			}
			//if elements not present
			else
				System.out.println("NOT PRESENT");
		}
	}
	
	}


