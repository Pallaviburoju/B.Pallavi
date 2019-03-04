package custaccDisplay;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import custaccDisplay.Customer;
import custaccDisplay.AccountNo;

public class ReturningAccCust implements Callable {
	
public static void main(String args[]) {
	Callable customer=new Customer();
	Callable accountno=new AccountNo();
	ExecutorService executorService=(ExecutorService) Executors.newFixedThreadPool(6);
	
	ArrayList<Future<String,Long>> custacc=new ArrayList<Future<String,Long>>();
}

@Override
public Object call() throws Exception {
	// TODO Auto-generated method stub
	
	return null;
}
}
