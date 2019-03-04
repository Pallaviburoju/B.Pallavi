package threadtest;

import java.util.Scanner;

public class ThreadBank {
	public static int depositamount;
	public static int withdrawamount;
	public static int balance=100;
    public void run() {
    	ThreadBank account=new ThreadBank();
    	synchronized (account) {
		account.deposit();
		
    	}
    	
		//System.out.println("thread one processed");
	}
	public Runnable deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited");
		depositamount=sc.nextInt();
		balance=balance+depositamount;
		System.out.println(balance);
		withdraw();
		return null;
		
				
	}
	public Runnable withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		withdrawamount=sc.nextInt();
		balance=balance-withdrawamount;
		System.out.println(balance);
		print();
		return null;
	
	}
	public void print() {
		System.out.println("Balance is"+balance);
	}
	
public static void main(String args[]) {

	ThreadBank object=new ThreadBank();
	ThreadBank object2=new ThreadBank();
	synchronized (object) {
	Thread thread=new Thread(object.deposit());
     thread.start();	
	synchronized (object2) {
	Thread thread2=new Thread(object2.withdraw());
thread2.start();
}
}
}
}
