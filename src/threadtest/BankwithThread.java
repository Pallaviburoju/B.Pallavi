package threadtest;
import java.util.*;
public class BankwithThread {
public static int depositamount;
public static int withdrawamount;
public static int balance=100;



public Runnable deposit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to be deposited");
	depositamount=sc.nextInt();
	balance=balance+depositamount;
	System.out.println(balance);
	return null;
	

    
}
public Runnable withdraw() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to be withdrawn");
	withdrawamount=sc.nextInt();
	balance=balance-withdrawamount;
	System.out.println(balance);
	return null;
	
}
public  Runnable print() {
	
	System.out.println("Balance is"+balance);
	return null;
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	BankwithThread object=new BankwithThread();
	Thread thread=new Thread(object.deposit());
	thread.start();
		
	BankwithThread object1=new BankwithThread();
	Thread thread1=new Thread(object1.withdraw());
	thread1.start();
		
	BankwithThread object2=new BankwithThread();
	Thread thread2=new Thread(object2.print());
	thread2.start();
	}

}
