package string;

public class TestReverseString {
	
	public static void main(String[] args) {
		
		String name = "Pushpraj Singh Kachhaway";

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}
		
	}
}