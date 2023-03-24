import java.util.Random;

public class Main {

	 public static void main(String[] args) {
	
		 Random random = new Random();
		 
		 int x = random.nextInt(6)+1; //limit size to 6 goes from 0-5 therefore +1
		 System.out.println(x);
		 
		 double y = random.nextDouble(1);
		 System.out.println(y);
		 
		 boolean z = random.nextBoolean();
		 System.out.println(z);
		 
	}
}
