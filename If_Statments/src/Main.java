import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		
		int age = random.nextInt(100)+1;
		if(age>= 75){
			System.out.println("You are an elderly");
		}
		
		else if(age>=18) {
			System.out.println("You are an adult");
		}
		
		else{
			System.out.println("You are not an adult");
		}
		System.out.println(age);
		
		
		
	}

}
