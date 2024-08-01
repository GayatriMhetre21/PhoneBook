package Showall;

import java.util.TreeMap;

public class Showall {
public static void showall(TreeMap map) {
	System.out.println("----------- phone number ----------");
	System.out.println("PhoneNumber                   Name");
	System.out.println("\n");
	int bufferSpace = 30;


	for (Object key : map.keySet() ) 
	{
	   System.out.print(map.get(key));	
	   String str = (String) map.get(key);
	   int max = bufferSpace - str.length();
	   for(int i=0;i<max;i++){
	   		System.out.print(" ");
	   }

	   System.out.println(key);
	}
	
}
}
