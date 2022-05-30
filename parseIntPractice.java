import java.util.*;
public class parseIntPractice {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("How old are you ");
		String ageAsString = in.nextLine();
		int age = Integer.parseInt(ageAsString);
		System.out.print(age);
		
	}
}
