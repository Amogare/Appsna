package Assignment3.stringbuffer;

public class StringInsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("It is used to _ at the specified index position");
		StringBuffer addStr = new StringBuffer("insert text");

		System.out.println("Unmodified string: " + sb);

		int indexOfUnderscore = sb.indexOf("_");

		if (indexOfUnderscore != 1) {
			sb.replace(indexOfUnderscore, indexOfUnderscore + 1, addStr.toString());
		}
		System.out.println("Modified string: " + sb);
	}
}
