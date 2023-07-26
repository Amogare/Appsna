package Assignment3.string;

public class StringOp {
public static void main(String[] args) {
	String str = "Java String pool refers to collection of Strings which are stored in heap memory";
	
	System.out.println("String in lowercase: "+str.toLowerCase());
	
	System.out.println("String in uppercase: "+str.toUpperCase());
	
	System.out.println("Replacing a with $: "+str.replace("a", "$"));
	
	System.out.println("Weather string contains collection?");
	System.out.println(str.compareToIgnoreCase("collection")>0?true:false);
	
	System.out.println("Check the string is same or not?");
	String newStr = "java string pool refers to collection of strings which are stored in heap memory";
	System.out.println(str.equals(newStr));
	
	System.out.println("Another method to check for match?");
	System.out.println(str.equalsIgnoreCase(newStr));
}
}
