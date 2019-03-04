package week3;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ConcurrentHashMap<String, Integer> conmap=new ConcurrentHashMap<String, Integer>();
		for(int i=0;i<5;i++) {
		conmap.put(sc.next(),sc.nextInt());
		}
		System.out.println(conmap);
	}

}
