package devops;

import java.util.Scanner;

public class MainFunc {
	Scanner scan = new Scanner(System.in);
	
	public String leer()
	{
		return scan.nextLine();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world, trying...");  
	}
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
