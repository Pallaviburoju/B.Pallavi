package custaccDisplay;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AccountNo implements Callable{

		public static long accountNo;
	//the return type should be an object but not primitive data type
	    	public Long call() {
	    	Random random=new Random();
	    	accountNo=Math.abs(random.nextLong());
	    	return accountNo;
		
	    	}
	public static void main(String args[]) throws Exception, Exception {
		//We are using the values more than one so we need to use newfixed threadpool
		ExecutorService executorService=(ExecutorService) Executors.newFixedThreadPool(3);
		//Creating an object to the accountNo and assigning it to callable interface
		Callable classObject=new AccountNo();
		//arraylist should be used for future purpose so, we write like this
		ArrayList<Future<Long>> accountNo=new ArrayList<Future<Long>>();
		for(int i=0;i<3;i++) {
			Future<Long> future=executorService.submit(classObject);
			accountNo.add(future);
		}
		for(Future<Long> obj2:accountNo) {
			System.out.println(obj2.get());
		}
		
	}


	}