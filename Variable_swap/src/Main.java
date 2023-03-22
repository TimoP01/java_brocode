
public class Main {

	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";

		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println();
		
		//swap
		String temp = null;
		temp = x;
		x = y;
		y = temp;
		temp = null;
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("temp: "+temp);
	}

}
