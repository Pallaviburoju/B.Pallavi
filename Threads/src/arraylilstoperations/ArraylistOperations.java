//replacing an element in arraylist
package arraylilstoperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistOperations {
	
public static void main(String args[]) {
ArrayList<String> arraylist=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("The names in arraylist are:"); 
arraylist.add(sc.next());
arraylist.add(sc.next());
arraylist.add(sc.next());
arraylist.add(sc.next());
arraylist.add(sc.next());

Iterator itr = arraylist.iterator(); 
System.out.println("Enter the name to be replaced");
String replac=sc.next(); 
System.out.println("Enter the name replacing");
String replacing=sc.next(); 
while (itr.hasNext()) {
	
	if(itr.next().equals(replac)) {
		String string=(String) itr.next();
		int index=arraylist.indexOf(string);
		arraylist.set(index-1,replacing);
	
		System.out.println(arraylist);
		}
	  
}  
}
}
