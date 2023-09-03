package stackandqueue;

import java.util.Stack;

public class ParenthesisChecker {
	Stack<Character> stack = new Stack<Character>();
	void isBalanced(String s)
	{	
		if(s.length()%2!=0)
		{
		System.out.println("not balanced");
		}

		else {

			for (int i = 0; i < s.length(); i++)

			{
				char ch = s.charAt(i);

				if(ch=='('||ch=='['||ch=='{') {
					stack.push(ch);

				}
			    else if (stack.peek() == '{' && ch == '}') {
					stack.pop();
				} else if (stack.peek() == '(' && ch == ')') {
					stack.pop();
				} else if (stack.peek() == '[' && ch == ']') {
					stack.pop();
				} else {
					stack.push(ch);
				}
			}

			if (stack.empty()) {
				System.out.println("balanced");
			}

			else {
				System.out.println("not balanced");
			}

		}

	}

	public static void main(String[] args) {
		ParenthesisChecker pc = new ParenthesisChecker();
     String s1 = "{([])}";
     String s2 = "()";
     String s3 = "([]";
   
    
        pc.isBalanced(s1);
        pc.isBalanced(s2);
        pc.isBalanced(s3);
    
	}

}
