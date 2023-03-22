import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats your name? ");
		String name = scanner.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();							//Clears /n from scanner
		System.out.println("Age: "+age);
		
		System.out.println("Enter a float!");
		float new_float = scanner.nextFloat();
		System.out.println("Entered float: "+new_float);

	}

}
