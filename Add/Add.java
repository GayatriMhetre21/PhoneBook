package Add;

import java.util.TreeMap;
import java.util.Scanner;

public class Add {
public static  void add(TreeMap map)
{
	Scanner read = new Scanner(System.in);
	System.out.println("Enter a name");
	String name=read.nextLine();
	
	
	Scanner rd = new Scanner(System.in);

	System.out.println("Enter a number");
	String num=rd.nextLine();
	
	if(num.length()==10 )
	{
		map.put(name,num);
	}
	else {
		System.out.println("Enter correct Phone number");
	     
	}
}
}
