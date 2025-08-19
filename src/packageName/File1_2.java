package packageName;
import java.util.Scanner;
public class File1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter a number : ");
		int num2 = scan.nextInt();
		
		String buffer = scan.nextLine();
		System.out.print("Enter an operation(A,S,M,D): ");
		String op = scan.nextLine();
		scan.close();
		
		if (op.equals("A"))
			System.out.println(num1 + num2);
		else if (op.equals("S"))
			System.out.println(num1 - num2);
		else if (op.equals("M"))
			System.out.println(num1 * num2);
		else if (op.equals("D"))
			System.out.println(num1/num2);
		
	}

}
