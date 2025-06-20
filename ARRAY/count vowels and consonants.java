import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		String str = "arigato";

		Set<Character> charSet = new HashSet<>();

		for (char ch : str.toCharArray()) {
			if(ch == 'a'|| ch=='i' || ch=='e'||ch=='o'||ch=='u') {
				charSet.add(ch);
			}

		}
		int count=0;
		for(char ch: str.toCharArray()) {

			if (charSet.contains(ch)) {
				count++;
			}

		}
		System.out.println("countof vowels is "+count);
		System.out.println("countof vowels is " + (str.length()-count ));




	}
}
