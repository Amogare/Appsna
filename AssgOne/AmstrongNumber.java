package AssgOne;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	int num, temp, sum=0;
	Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	temp=num;
	while(temp>0)
	{
		int n=temp%10;
		sum=sum+n*n*n;
		temp=temp/10;
	}
	if(sum==num)
		System.out.println(num+" is amstrong number");
	else
		System.out.println(num+" is not amstrong number");
}
}
