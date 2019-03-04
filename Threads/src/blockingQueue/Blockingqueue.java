package blockingQueue;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Blockingqueue implements Runnable {
	int withdrawamount;
	int depositamount;
   static int balance=100;
	public void queue() throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of customers");
		int capacity=sc.nextInt();
		System.out.println("Enter customers");
		ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(capacity);
		for(int i=0;i<capacity;i++) {
		queue.put(sc.next());
		System.out.println(queue);
		withdraw();
		deposit();
		}
	}
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		withdrawamount=sc.nextInt();
		if(balance<withdrawamount) {
			System.out.println("Balance insufficient");
		}
		else{
			balance=balance-withdrawamount;
			System.out.println("balance after withdrawn"+balance);
		}
	}
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited");
		depositamount=sc.nextInt();
		balance=balance+depositamount;
		System.out.println("balance after deposted is"+balance);
	}
public static void main(String args[]) {
	Blockingqueue object=new Blockingqueue();
	Thread thread=new Thread(object);
	thread.start();
	
	
}

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		queue();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
