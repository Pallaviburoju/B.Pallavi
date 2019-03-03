package threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

public class CallableDemo implements Callable {
	String name;
	public String call() {
		System.out.println(Thread.currentThread().getName());
		return Thread.currentThread().getName();
	}
public static void main(String args[]) {
	ExecutorService executorService=(ExecutorService) Executors.newSingleThreadExecutor();
	Callable task=new CallableDemo();
	Future<String> name=executorService.submit(task);
	System.out.println(name);
}



}
