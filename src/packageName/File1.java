package packageName;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int yr = scan.nextInt();
		
		if(yr % 400 == 0)
			System.out.print(yr + " is a leap year.");
		else if(yr % 100 == 0)
			System.out.print(yr + " is not a leap year.");
		else if(yr % 4 == 0)
			System.out.print(yr + " is a leap year.");
		scan.close();

	}

}
