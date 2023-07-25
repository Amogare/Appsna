package AssgOne;

import java.util.Scanner;

public class CompundSimpleIntrest {
public static void main(String[] args) {
	double principle, rate, time;
	Scanner sc = new Scanner(System.in);
	System.out.println("Principle: ");
	principle = sc.nextDouble();
	System.out.println("Rate: ");
	rate = sc.nextDouble();
	System.out.println("Time: ");
	time = sc.nextDouble();
	
	double simpleIntrest = (principle*rate*time)/100;
	System.out.println("Simple Intrest: "+simpleIntrest);
	
	double compundIntrest = principle*(Math.pow((1+rate/100), time))-principle;
	System.out.println("Compund Intrest: "+compundIntrest);
}
}
