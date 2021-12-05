package devops;
import java.util.Scanner;

public class MainFunc {
	Scanner scan = new Scanner(System.in);
	static String name;
	
	public MainFunc(String name) {
		MainFunc.name = name;
	}
	
	public String leer()
	{
		return scan.nextLine();
	}
	
	public void printGreeting() {
		System.out.println("Hello, " + name + "!");  
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
