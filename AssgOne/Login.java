package AssgOne;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	String userid,password;
	Scanner sc = new Scanner(System.in);
	userid = sc.next();
	password = sc.next();
	int count=0;
	for(int i=1;i<=3;i++)
	{
		System.out.println("Enter User Id and Password:");
		String user = sc.next();
		String pass = sc.next();
		if(user.equals(userid) && pass.equals(password))
		{
			System.out.println("Welcome "+user);
			break;
		}
		count++;
	}
	if(count>3)
	{
		System.err.println("Contact Admin");
	}
}
}
