package com.greatlearning.Service;

import java.util.ArrayList;
import java.util.Collections;

public class ConstructionOrder {

	ArrayList<Integer> temp = new ArrayList<>();

	public void orderConstruction(ArrayList<Integer> floorSize) {
		for (int i = 0; i < floorSize.size(); i++) {
			temp.add(floorSize.get(i));// adding elements to temp
		}
		Collections.sort(temp, Collections.reverseOrder());
		int j = 0;
		for (int i = 0; i < floorSize.size(); i++) {
			if (floorSize.get(i) != temp.get(j))
				System.out.println("Day: " + (i + 1));
			else if (floorSize.get(i) == temp.get(j)) {
				System.out.print("Day: " + (i + 1) + " ---> " + temp.get(j) + ", ");
				j++;
				try {
					for (int k = 0; k < i; k++) {
						if (floorSize.get(k) == temp.get(j)) {
							System.out.print(temp.get(j) + ", ");
							j++;
							k = -1;
						}
					}
				} catch (IndexOutOfBoundsException e) {
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
