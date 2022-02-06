package com.greatlearning.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.Service.ConstructionOrder;

public class driver {
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		ConstructionOrder constructionOrder = new ConstructionOrder();

		ArrayList<Integer> floorSize = new ArrayList<>();

		System.out.println("Enter the total number of floors in building");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the floor size giv  en on day " + (i + 1));
			floorSize.add(sc.nextInt());
		}
		constructionOrder.orderConstruction(floorSize);
		sc.close();
	}

}


