

public class Brackets{

	public static void main(String[] args) {
		String str = "(A+B-(C))";
		System.out.println(balanced(str));
	}

	public static boolean balanced(String str){

		char[] strChar = str.toCharArray();
		Stack stack = new Stack();

		for(char c: strChar) {
			if(c == '[' || c == '(' || c == '{'){
				stack.push(c);
			}
			else if(c == ']'){
				if(stack.empty() || stack.pop() != (Character)'[') {
					return false;
				}
			}
			else if(c == ')'){
				if(stack.empty() || stack.pop() != (Character)'(') {
					return false;
				}
			}
			else if(c == '}'){
				if(stack.empty() || stack.pop() != (Character)'{') {
					return false;
				}
			}
		}//for

		return stack.empty();

	}

}