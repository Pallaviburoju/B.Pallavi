package threadtest;

public class RunString {
	String name;
	public String run() {//we can't change the return type of run
		
		return name;
		
	}
public static void main(String args[]) {
	RunString example=new RunString();
	Thread thread=new Thread("Thread1");
	thread.start();
}

}
