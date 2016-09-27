import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MikroSimMain {
	public static void main(String[] args) {
		

		// String test = "add 1,5 \nadd 1,-6 \nadd 1,2 \nsub 3,5\n";
		// String test = "add 1,2 \nadd 4,5";

		// System.out.println(test);
		HashMap<Character,Integer> register = new HashMap<Character,Integer>();
		
		register.put('a', null);
		register.put('b', null);
		register.put('c', null);
		register.put('d', null);
		register.put('r', null);
	
		
		
		Parser p = new Parser(register);

		while(true){

			System.out.println("Register a: " + register.get('a'));
			System.out.println("Register b: " + register.get('b'));
			System.out.println("Register c: " + register.get('c'));
			System.out.println("Register d: " + register.get('d'));
			System.out.println("Register r: " + register.get('r'));
			Scanner s = new Scanner(System.in);
			String test = s.nextLine();
			p.parse(test);
		}

		// ArrayList<String> a = new ArrayList<String>();

		/*
		 * a.add("mov a b"); a.add("ldi a,0x14"); a.add("ret"); a.add("mov a,0x14");
		 * 
		 * for (Iterator iterator = a.iterator(); iterator.hasNext();){ String string = (String) iterator.next();
		 * p.parse(string); System.out.println("=============="); }
		 */

	}
}
