package com.greatlearing.Driver;

import java.util.ArrayList;

import java.util.Scanner;
import com.greatlearing.Service.MergeSort;
import com.greatlearing.Service.Notes;

public class currencyHelper {
public static void main(String[] args) 
	
	{
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the size of currency denominations");
		        int denominationsSize = sc.nextInt();
		        int[] denominations = new int[denominationsSize];

		        System.out.println("Enter the currency denominations value");
		        for (int i = 0; i < denominations.length; i++) {
		            denominations[i] = sc.nextInt();
		        }

		        System.out.println("Enter the amount you want to pay");
		        int payment = sc.nextInt();

		        var noteArray = getMinimumNotes(denominations, payment);

		        if (noteArray.size() > 0) {
		            System.out.println("Your payment approach in order to give min no of notes will be");
		            for (var notes : noteArray) {
		                System.out.println(notes.denominations + ":" + notes.count);
		            }
		        }
		    }

		    private static ArrayList<Notes> getMinimumNotes(int[] denominations, int paymentAmt) {
		        MergeSort mergeSort = new MergeSort();
		        mergeSort.sortArray(denominations);

		       
		        ArrayList<Notes> noteArray = new ArrayList<Notes>();

		        for (int i = 0; i < denominations.length; i++) {
		            int numberOfNotes = (int) (paymentAmt / denominations[i]);
		            if (numberOfNotes > 0) {
		                noteArray.add(new Notes(denominations[i], numberOfNotes));
		                paymentAmt = paymentAmt - (numberOfNotes * denominations[i]);
		                if (paymentAmt <= 0) {
		                    break;
		                }
		            }
		        }

		        if (paymentAmt > 0) {
		            System.out.println("Can't pay completed amount. Amount pending : " + paymentAmt);
		            return new ArrayList<Notes>();
		        }
		        return noteArray;
		    }
		}