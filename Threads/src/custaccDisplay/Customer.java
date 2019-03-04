package custaccDisplay;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Customer implements Callable {
	public static String customerName;
	
    public String call() {
    	Scanner sc=new Scanner(System.in);
    	Customer.customerName=sc.next();
	    return customerName;
	
}
public static void main(String args[]) throws Exception, Exception {
	
	ExecutorService executorService=(ExecutorService) Executors.newFixedThreadPool(3);
	Callable customerObj=new Customer();
	ArrayList<Future<String>> customerName=new ArrayList<Future<String>>();
	for(int i=0;i<3;i++) {
		Future future=executorService.submit(customerObj);
		customerName.add(future);
	}
	for(Future<String> obj:customerName) {
		System.out.println(obj.get());
	}
	
	
}


}

