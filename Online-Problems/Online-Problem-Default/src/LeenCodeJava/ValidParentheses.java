/* Difficulty: EASY
 * Status: SOLVED
 * Improvement: 98.76%
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 */
package LeenCodeJava;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		int len = s.length();
		if (len % 2 == 1) return false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') stack.push(c);
			else if (!stack.isEmpty() && c == ')' && stack.peek() =='(') stack.pop();
			else if (!stack.isEmpty() && c == '}' && stack.peek() =='{') stack.pop();
			else if (!stack.isEmpty() && c == ']' && stack.peek() =='[') stack.pop();
			else return false;
			System.out.println(stack);
		}
		return stack.isEmpty();
	}

}


