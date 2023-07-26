package Assignment3.stringbuilder;

public class ReverseString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("This method returns the reversed object on which it was called");

		System.out.println("Initial String: " + sb);
		System.out.println("reversed string: " + sb.reverse());
	}
}
