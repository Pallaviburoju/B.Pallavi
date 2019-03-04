package customerEcommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

import customerEcommerce.Register;

public class Login implements Serializable{
	static HashMap<String,Integer> items = new HashMap<String,Integer>();
private static String userName;
public static String password;
static int cartitems=0;

public static String getUserName() {
	return userName;
}
public static void setUserName(String userName) {
	Login.userName = userName;
}

public static String getPassword() {
	return password;
}
public static void setPassword(String password) {
	Login.password = password;
}

   static void deserialize() throws Exception {
	FileInputStream fis=new FileInputStream("E:\\customerEcommerce\\customerregister.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
    ArrayList<Register> arraylist2 = (ArrayList<Register>) ois.readObject();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter customer name");
	Login.setUserName(sc.next());
	System.out.println("enter password");
	Login.setPassword(sc.next());
	Iterator iterate=arraylist2.iterator();
	start:while(iterate.hasNext()) {
		for(Register get:arraylist2) {
			if(Register.customerName.equals(userName) && Register.pswd.equals(password)) {
				String category;
				Scanner s= new Scanner(System.in);
				System.out.println("Welcome for shopping enter category i.e.,m for male or f for female or ch for child");
				category=s.next();
				switch(category)
				{
				case "m" :Login.male();
								break start;		
										
				case "f" :Login.female();
				                break start;		
										
				case "ch" :Login.child();
				                break start;    
				}
			}
		
				
		}
	}
	
}
public static void categoryOfShopping() {
	String categoryOfShopping;
	Scanner s= new Scanner(System.in);
	System.out.println("enter category of shopping a for fashion or b for home&kitchen or c for electronics");
	categoryOfShopping=s.next();
	switch(categoryOfShopping)
	{
	case "a" :System.out.println("Welcome to fashion");//clothing,accessories,men's shoes
           	  Login.fashion();
           	  break;
           	  
	case "b" :System.out.println("Welcome to home&kitchen");//homeDecor,KitchenTools,CookingEssentials
	          Login.homekitchen();break;
							
	case "c" :System.out.println("Welcome to electronics");//headphones,powerBank,mobiles
	          Login.electronics();break;
	                    
	}
}
public static void male() {
	Login.categoryOfShopping();
}
public static void female() {
	Login.categoryOfShopping();
}
public static void child() {
	Login.categoryOfShopping();
}

public static void fashion() {
	String fashion;
	Scanner s=new Scanner(System.in);
	System.out.println("Select item in fashion 1 for dress, 2 for watch, 3 for shoes ");
	fashion=s.next();
	switch(fashion)
	{
	case "1"  :System.out.println("Dress is selected");
	           items.put("dress",1000);
	           cartitems++;
	           contOrStop();
	           break;
	case "2"  :System.out.println("Watch is selected");
	           items.put("watch",2000);
	           cartitems++;
	           contOrStop();
	           break;
	case "3"  :System.out.println("shoes are selected");
	           items.put("shoes",3000);
	           cartitems++;
	           contOrStop();
	           break;
	}
}
public static void homekitchen(){
	String homekitchen;
	Scanner s=new Scanner(System.in);
	System.out.println("Select item in fashion 1 for Flower vase, 2 for Ricecooker, 3 for Sofa");
	homekitchen=s.next();
	switch(homekitchen)
	{
	case "1"  :System.out.println("Flower vase is selected");
	           items.put("flowervase",500);
	           cartitems++;
	           contOrStop();
	           break;
	case "2"  :System.out.println("Ricecooker is selected");
	           items.put("ricecooker",4000);
	           cartitems++;
	           contOrStop();
	           break;
	case "3"  :System.out.println("Sofa is selected");
	           items.put("sofa",6000);
	           cartitems++;
	           contOrStop();
	           break;
	}
}
public static void electronics() {
	String electronics;
	Scanner s=new Scanner(System.in);
	System.out.println("Select item in fashion 1 for headset, 2 for powerBank, 3 for MobilePhone");
	electronics=s.next();
	switch(electronics)
	{
	case "1"  :System.out.println("headset is selected");
	           items.put("headset",1000);
	           cartitems++;
	           contOrStop();
	           break;
	case "2"  :System.out.println("powerBank is selected");
	           items.put("powerbank",3000);
	           cartitems++;
	           contOrStop();
	           break;
	         
	case "3"  :System.out.println("MobilePhone is selected");
	           items.put("moilephone",20000);
	           cartitems++;
	           contOrStop();
	           break;
	}
}
public static void cart() {
	System.out.println("No of items in the cart are "+cartitems);
	System.out.println(getUserName());
	//Iterator iterate= ((Collection<Entry<String,Integer>>) items).iterator();
	/*while(iterate.hasNext()) {
		System.out.println(iterate.next());
	}*/
	for(HashMap.Entry obj:items.entrySet()) {
		System.out.println(obj.getKey()+" "+obj.getValue());
	}
	int sum = 0;
	for (int i : items.values()) {
	    sum += i;
	}
	System.out.println("Total price of all items are "+sum);
	removeItemorPay();
}
public static void removeItemorPay() {
	String removepay;
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("press 1 for removing item, 2 to go to payment");
	removepay=s.next();
	switch(removepay)
	{
	case "1"  :System.out.println("remove item and Continue shopping");
	           System.out.println("enter items to be removed");
	          String element= s.next();
	            	 items.remove(element);
	           cart();
	           payment();
	           break;
	
	case "2"  :System.out.println("Goto payment");
	           payment();
	           break;
	}
}
public static void payment() {
	String pay;
	Scanner s=new Scanner(System.in);
	System.out.println("press 1 for card, 2 for online");
	pay=s.next();
	switch(pay)
	{
	case "1"  :System.out.println("Card payment");
	           //display item details
				System.out.println(items);
				exit();
				break;
	
	case "2"  :System.out.println("online payment");
	           //display item details
	            System.out.println(items);
				exit();
				break;
	}
}
public static void contOrStop() {
	String decide;
	Scanner s=new Scanner(System.in);
	System.out.println("press 1 for continue shopping, 2 to go to cart");
	decide=s.next();
	switch(decide)
	{
	case "1"  :System.out.println("Continue shopping");
	           Login.categoryOfShopping();
	           break;
	
	case "2"  :System.out.println("Your cart");
	           cart();
	           break;
	}
}
public static void exit() {
	System.out.println("Thank you for shopping");
}

}
