import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println(z);
		
		double t = Math.min(x, y);
		System.out.println(t);//returns minimum
		
		System.out.println(Math.abs(y)); //Displays absolute value here +10 
		
		double sqroot = Math.sqrt(4);
		System.out.println(sqroot);//Displays root
		
		double round_x = Math.round(x); //Rounds the value
		System.out.println(round_x);
		
		round_x = Math.ceil(x); //Rounds the value UP
		System.out.println(round_x);
		
		round_x = Math.floor(x); //Rounds the value DOWN
		System.out.println(round_x);
		
		//Hypotenuse
		double a;
		double b;
		double c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("a: "+a+"\tb: "+b);
		System.out.println("Hypotenuse: "+c);
		
		scanner.close();
		
		
	}

}
