
import java.util.Scanner;

import Add.Add;
import Delete.Delete;
import Modify.Modify;
import SearchByName.SearchByName;
import Showall.Showall;

import java.util.TreeMap;
import java.util.Map;

public class PhoneManager {

	public static void main(String[] args) {
		int ch,ch1;
		TreeMap<String, String> map = new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		do{
 		System.out.println(" 1.Add \n 2.Delete\n 3.Modify \n 4.Show all \n 5.Search by name");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			Add.add(map);
			break;
		case 2:
			Delete.Delete(map);
		    break;
		case 3:
			Modify.modify(map);
			break;
		case 4:
			Showall.showall(map);
		    break; 
		case 5:
		    SearchByName.searchbyname(map);                     
			break;

		}
 		
 		
 		System.out.println("\n Do You Want to Exit  Yes=0 No=1"); 
 		ch1=sc.nextInt();
		}while(ch1==1);		

	}

}
