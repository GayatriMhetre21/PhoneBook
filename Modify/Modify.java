package Modify;

import java.util.TreeMap;
import java.util.Scanner;

public class Modify {
public static void modify(TreeMap map) {
	System.out.println("Enter User Name to modify record");
	Scanner up=new Scanner(System.in);
	String upd=up.nextLine();
	if(map.containsKey(upd))
	{
		map.remove(upd);
		//System.out.println("R  ");
		Scanner upread = new Scanner(System.in);
		System.out.println("Enter a Updated Name for Contact");
		String upname=upread.nextLine();
		
		
		Scanner uprd = new Scanner(System.in);

		System.out.println("Enter a Updated Number");
		String upnum=uprd.nextLine();
		
		if(upnum.length()==10 )
		{
			map.put(upname,upnum);
		}
		else {
			System.out.println("Enter correct Phone number");
		     
		}
		
	}
	else 
	{
	System.out.println("Given Phone number is not present in record");	
	}
	
}
}
