package Delete;

import java.util.TreeMap;
import java.util.Scanner;

public class Delete {
public static void Delete(TreeMap map) {
	System.out.println("Enter User Name to delete record");
	Scanner del=new Scanner(System.in);
	String delnum=del.nextLine();
	if(map.containsKey(delnum))
	{
		map.remove(delnum);
		System.out.println("Record Deleted ");
	}
	else 
	{
	System.out.println("Given Phone number is not present in record");	
	}
}
}
