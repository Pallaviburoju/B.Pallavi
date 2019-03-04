package threadtest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorObject implements Runnable {
	public void run() {
		System.out.println("Running");
	}
public static void main(String args[]) {
	
	//1.executor
	Executor obj=Executors.newSingleThreadExecutor(); //here upcasting is done
			obj.execute(new ExecutorObject());
	
	//2.ExecutorService
			ExecutorService obj1=Executors.newSingleThreadExecutor();
			obj1.execute(new ExecutorObject());
	//3.ScheduledExecutorService
			ScheduledExecutorService obj2=Executors.newSingleThreadScheduledExecutor();
			obj2.execute(new ExecutorObject());
}
}
