package AssgOne;

import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	double amt;
	System.out.println("Enter the amount: ");
	Scanner sc = new Scanner(System.in);
	amt = sc.nextInt();
	if(amt >=0 && amt <=180000)
	{
		System.out.println("No tax!!");
	}
	else if(amt >=180001 && amt <= 300000)
	{
		System.out.println("Tax: "+amt/10);
	}
	else if(amt >= 300001 && amt <=500000)
	{
		System.out.println("Tax: "+amt/20);
	}
	else if(amt >= 500001 && amt <= 1000000)
	{
		System.out.println("Tax: "+amt/30);
	}else {
		System.out.println("Out of range!!");
	}
}
}
