package com.greatlearning.Service;


public class SortDescending extends StockDetails {

	public void desc() {
		
		 for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (array[i] < array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Stock prices in descending order:");
        for (int i = 0; i < num - 1; i++) 
        {
            System.out.print(array[i] + ", ");
            
        }
        System.out.println(array[num - 1]);
        System.out.println("");
		
	}
}