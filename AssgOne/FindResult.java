package AssgOne;

import java.util.Scanner;

public class FindResult {
public static void main(String[] args) {
	int sub1,sub2,sub3;
	System.out.println("Enter the marks of subject 1: ");
	Scanner sc = new Scanner(System.in);
	sub1 = sc.nextInt();
	System.out.println("Enter the marks of subject 2: ");
	sub2 = sc.nextInt();
	System.out.println("Enter the marks of subject 3: ");
	sub3 = sc.nextInt();
	if(sub1>60 && sub2>60 && sub3>60)
	{
		System.out.println("Passed!!");
	}
	else
		if(sub1>60||sub2>60 && sub2>60 || sub3>60 && sub1>60 && sub3>60)
		{
			System.out.println("Promoted");
		}
		else
			System.out.println("Fail");
}
}
