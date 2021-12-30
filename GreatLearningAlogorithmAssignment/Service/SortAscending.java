package com.greatlearning.Service;


public class SortAscending extends StockDetails 
	{
	public void asc(){
	 for (int i = 0; i < num; i++) 
     {
		  for (int j = i + 1; j < num; j++) { 
             if (array[i] > array[j]) 
             {
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }
     }
	 System.out.print("Stock prices in ascending order: ");
     for (int i = 0; i < num - 1; i++) 
     {
         System.out.print(array[i] + ", ");
     }
     System.out.println(array[num - 1]);
     System.out.println("");

	}
}
