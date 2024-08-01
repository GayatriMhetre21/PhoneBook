package SearchByName;

import java.util.TreeMap;
import java.util.Scanner;

public class SearchByName {
public static void searchbyname(TreeMap map) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a Name for search");
	String sname=sc.nextLine();
	int position=1;
	// System.out.println("Enter Name");
	// String skey=sc.nextLine();
	for (Object key : map.keySet() ) {
		String s = (String)key;
		//System.out.println(s);
		if(s.equals(sname)){
			String snum =  (String) map.get(key);
			System.out.println("\n-----------Name\tPhoneNumber Position---------");
			System.out.println("             "+sname+"\t"+snum+"  "+position);
			
		}
		else
		{
		    System.out.println("Phone Book dont have contact for this Name");
		}
		position+=1;
	}


		
	
}
}
