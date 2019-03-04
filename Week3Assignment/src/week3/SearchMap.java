package week3;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class SearchMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in hashmap");
		ConcurrentHashMap searchmap=new ConcurrentHashMap();
		for(int i=0;i<5;i++)
		searchmap.put(sc.next(), sc.nextInt());
		System.out.println("enter element to be found");
if(searchmap.containsKey(sc.next())) {
	System.out.println("element found");
}
	else { 
		System.out.println("element not found");
	}
	}
}
