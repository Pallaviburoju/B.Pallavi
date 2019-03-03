package threadtest;

import java.util.Scanner;

public class ThreadwaitNotify implements Runnable{
	public static int balance=1000;
	public int depositamount;
	public int withdrawamount;
	public void run() {
		System.out.println("Thread 1 is running");
	}
	synchronized public Runnable deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited");
		depositamount=sc.nextInt();
		balance=balance+depositamount;
		System.out.println(balance);
		notify();
		return null;
	}
	synchronized public Runnable withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		withdrawamount=sc.nextInt();
		if(balance < withdrawamount) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		else {
			balance=balance-withdrawamount;
		}
		
		System.out.println(balance);
		return null;
	}
public static void main(String args[]) throws Exception {
	ThreadwaitNotify object=new ThreadwaitNotify();
	Thread thread1=new Thread(object.withdraw());
	thread1.start();
	
	ThreadwaitNotify object2=new ThreadwaitNotify();
	Thread thread2=new Thread(object2.deposit());
	thread2.start();
}
}
