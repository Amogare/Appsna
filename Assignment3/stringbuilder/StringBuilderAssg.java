package Assignment3.stringbuilder;

public class StringBuilderAssg {
	public static void main(String[] args) {
		String s[] = new String[4];
		s[0] = "StringBuilder";
		s[1] = "is a peer class od String";
		s[2] = "that provides much of";
		s[3] = "the functionality of strings";

		StringBuilder sb = new StringBuilder();
		for (String str : s) {
			sb.append(str);
			sb.append(" ");
		}
		System.out.println("After appending in StringBuffer: " + sb);
	}
}
