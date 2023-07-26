package Assignment3.stringbuffer;

public class StringRev {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("Initial string: " + sb);
		System.out.println("Reversed string: " + sb.reverse());
	}
}
