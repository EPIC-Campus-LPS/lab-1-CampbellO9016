package packageName;
import java.util.Scanner;
public class File1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String user = scan.nextLine();
		System.out.print("Enter a password: ");
		String pass = scan.nextLine();
		scan.close();
		
		if (((user.toLowerCase()).equals("admin")) &&((pass.toLowerCase()).equals("1234password")))
			System.out.println("Login Successful!");
		else
			System.out.println("Login failed. Please try again.");
		
			
			
		
	

	}

}
