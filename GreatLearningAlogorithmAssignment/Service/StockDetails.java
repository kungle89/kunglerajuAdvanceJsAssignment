package com.greatlearning.Service;

import java.util.Scanner;

public class StockDetails {

		public static int num;
		public static double srch;
		public static double array[];
		public static double temp;
		public static boolean arr[];
		public boolean status=false;
		public static int x=0,y=0;
		static Scanner scanner=new Scanner(System.in);
		
		
		public void keyInput() {
			
			System.out.println("Enter the number of companies: ");
			
				num=scanner.nextInt();
				array=new double[num];
				arr=new boolean[num];
				System.out.println("Enter the Stocks now of each company respectively-");

				insertValues();
		
				System.out.println("Enter if stock value Increased (True) or Decreased (False) than yesterday-");
		
				iboolValues();
				printValues();
				pboolValues();
				
			}
		
		public void insertValues() {
			for(int i = 0;i<num;i++){
				System.out.println("Enter Stock of company "+(i+1)+":");
				array[i]=scanner.nextDouble();
			}
		}
		
		public void iboolValues() {
			for(int i=0;i<num;i++) {
				System.out.println("Stock status of company "+(i+1)+":");
				arr[i]=scanner.nextBoolean();
						}
		}
		
		public void printValues() {
			for(int i=0;i<num;i++) {
				System.out.println("Stock value of company "+(i+1)+" is Rs." +array[i]);
			}
				System.out.println("");
		}
		
		public void pboolValues() {
			for(int i=0;i<num;i++) {
				System.out.println("Stock status of company "+(i+1)+" is "+arr[i]);
			}
				System.out.println("");
		}
		
		public void trueVal() {
			for (int i=0;i<num;i++) {
				if(arr[i]==true) {
					x=x+1;
				}
				else {
					y=y+1;
					}
				}
			System.out.println("Number of companies whose stock increased today is "+x);
			System.out.println("Number of companies whose stock decreased today is "+y);
		}
		
	}
