package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("Uncreative String List");
		strings.add("What?");
		strings.add("Stop");
		strings.add("look at all those chickens!");
		strings.add("stop saying 'strings.addAll()'");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("");
		for (String s : strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("");
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(strings.get(i));
			}
		}
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(strings.size()-1 - i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for (String s : strings) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
