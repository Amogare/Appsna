package AssgOne;

import java.util.ArrayList;
import java.util.List;

public class AmstrongTill999 {
	public static List<Integer> findAmstrong(int a)
	{
		List<Integer> l = new ArrayList<>();
		int temp=a, sum=0;
		while(temp>0)
		{
			int b = temp%10;
			sum=sum+b*b*b;
			temp = temp/10;
		}
		if(sum==a)
			l.add(sum);
		return l;
		
	}
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	for(int i=100; i<=999; i++)
	{
		list.addAll(findAmstrong(i));
	}
	System.out.println(list);
}
}
