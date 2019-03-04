package week3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConcurrentQueue {

	public static void main(String[] args) throws InterruptedException {
		int capacity=10;
    Scanner scan=new Scanner(System.in);
    System.out.println("the elements in concurrent queue are");
    BlockingQueue<String> block=new ArrayBlockingQueue<String>(capacity);
    
    for(int i=0;i<capacity;i++) {
    block.put(scan.next());
    
    }
    System.out.println(block);
    block.add("pallavi");
   
	}

}
