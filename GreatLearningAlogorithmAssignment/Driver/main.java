package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.Service.*;


public class main {

static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		int choice;
		
		StockDetails stockdetails = new StockDetails();
		SortAscending sortasc= new SortAscending();
		Stocks stocks = new Stocks();
		SortDescending sortdsc=new SortDescending();
		StockService stockservice=new StockService();

		
		stockdetails.keyInput();
		
		
		
		do {
			stocks.mainsMenu();
			 choice = scan.nextInt();
		
			 switch (choice) {
       
			 	case 1:
 
			 		sortasc.asc();
			 		break;
      
			 	case 2:

			 		sortdsc.desc();
			 		break;

			 	case 3: 
    		   
			 		stockdetails.trueVal();
			 		break;
    		   
			 	case 4:
    	 
			 		stockservice.stockSearch();
			 		break;
 
			 	case 5:
    		   
			 		System.out.println("Exit!");
			 		System.exit(choice);
			 		break;
       		
    	   default:
       		
    		   System.out.println("Wrong choice!!!");
    		   System.out.println("");
    	   }
		} 
		while (choice!=0);
	}
}
