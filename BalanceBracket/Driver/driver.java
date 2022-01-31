package com.greatlearning.BalanceBracket.Driver;

import java.util.Scanner;

import com.greatlearning.BalanceBracket.Service.BalanceBracket;

public class driver {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//BalanceBracket balanceBracket = new BalanceBracket();
		System.out.println("Enter Brackets To Check Whether They Are Balanced Or Not");
		String exp = sc.next();
		System.out.println();
		
		if (BalanceBracket.isBracketBalanced(exp))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
			
	}

