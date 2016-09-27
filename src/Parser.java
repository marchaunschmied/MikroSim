import java.util.HashMap;
import java.util.Stack;

public class Parser {

	Stack<String> stack = new Stack<String>();

	private static boolean debug = false;;

	HashMap<Character, Integer> register;

	public Parser(HashMap<Character, Integer> register) {
		this.register = register;
	}

	public void parse(String s) {

		char c[] = s.toCharArray();

		String var = "";
		for (int i = 0; i < c.length; i++){
			if(c[i] == '\n'){
				continue;
			}

			if(c[i] == ' ' || c[i] == ','){
				if(!var.equals("\n")){
					stack.push(var);
					if(debug)
						System.out.println("pushed to stack: " + var);
				}
				var = "";
				continue;
			}
			var += c[i];

		}

		if(debug)
			System.out.println("pushed to stack: " + var);
		stack.push(var);

		while(!stack.isEmpty()){

			int expr1 = Integer.parseInt(stack.pop());
			int expr2 = Integer.parseInt(stack.pop());
			String argument = stack.pop();

			if(debug){
				System.out.println("expr1: " + expr1);
				System.out.println("expr2: " + expr2);
				System.out.println("argument: " + argument);
			}
			if(argument.equals("add")){
				System.out.println(expr1 + expr2);
			}
			if(argument.equals("sub")){
				System.out.println(expr2 - expr1);
			}

			if(argument.equals("lda")){
				register.put('a', expr1);
			}

			if(argument.equals("mvi")){
				register.put('r', expr2);
			}

		}

	}
}
