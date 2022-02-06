package com.greatlearning.BalanceBracket.Service;

import java.util.Stack;

public class BalanceBracket {
	
	public static boolean isBracketBalanced(String exp)
	{
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<exp.length();i++)
		{
			char ch = exp.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{')
			{
				st.push(ch);
			}
			
			if (st.isEmpty())
				return false;
			char check;
			switch (ch)
			{
				case ')':
					check = st.pop();
					if (check == '{' || check == '[')
						return false;
						break;

				case '}':
					check = st.pop();
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					check = st.pop();
					if (check == '(' || check == '{')
						return false;
					break;
			}
		}

// Check Empty Stack
		return (st.isEmpty());
	}


}
