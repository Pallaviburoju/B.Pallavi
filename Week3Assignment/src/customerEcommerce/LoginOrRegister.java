package customerEcommerce;

import java.util.Scanner;
public class LoginOrRegister {

	public static void main(String args[]) throws Exception {
		
		String choice;
		Scanner s= new Scanner(System.in);
		System.out.println("enter register if new customer or login if old customer");
		choice=s.next();
		switch(choice)
		{
		case "register" :Register reg=new Register();
								Register.get();
								Register.serialize();							
								Login.deserialize();
								break;
								
		case "login" : Login.deserialize();
		               break;
		}
	}

}
