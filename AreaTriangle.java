import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("type in value of a:" );
		int a = scan.nextInt();
		
		System.out.println("type in value of b:" );
		int b = scan.nextInt();
		
		int area= (a*b)/2;
		
		System.out.println("area of this triangle is: " + area);
		
	}

}
