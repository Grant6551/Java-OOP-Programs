import java.io.*;
import java.util.Scanner;

class Practice5{
	public static void main(String[] args){

		 	Scanner input = new Scanner(System.in);
			System.out.println("Enter Username");
			String userName = input.nextLine();
			System.out.println("Enter Password");
			String password = input.nextLine();
		try{
			if(userName.equals("Grant") && password.equals("mypassword")) {
				System.out.println("Welcome Sir, Always at your service.");
				System.out.println("What brings you today?");
		}
		} catch(Exception e){
			System.out.println(e);
			System.out.println("Incorrect username or password. Please try again.");
		}


	}
}