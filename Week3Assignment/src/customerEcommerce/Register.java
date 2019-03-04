package customerEcommerce;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Register implements Serializable {
	static ArrayList<Register> arraylist=new ArrayList<Register>();
	static String customerName;
	private static long contactNo;
	private static String address;
	static String pswd;
	public static long getContactNo() {
		return contactNo;
	}
	public static void setContactNo(long contactNo) {
		Register.contactNo = contactNo;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		Register.address = address;
	}
	public static String getCustomerName() {
		return customerName;
	}
	public static void setCustomerName(String customerName) {
		Register.customerName = customerName;
	}
	public static String getPswd() {
		return pswd;
	}
	public static void setPswd(String pswd) {
		Register.pswd = pswd;
	}
	public static void get() {
		Register register=new Register();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name: ");
		Register.setCustomerName(s.next());
		System.out.println("Enter mobile no: ");
		Register.setContactNo(s.nextLong());
		System.out.println("Enter address: ");
		Register.setAddress(s.next());
		System.out.println("Enter password to be set: ");
		Register.setPswd(s.next());
		arraylist.add(register);
		System.out.println("registration successful.Now you can login");
	}
	    static void serialize() throws Exception {
		FileOutputStream fos=new FileOutputStream("E:\\customerEcommerce\\customerregister.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(arraylist);
		fos.close();
		oos.close();
	}
}
