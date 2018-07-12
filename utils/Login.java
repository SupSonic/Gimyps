package fr.poec.gestion_rh;

import java.util.Scanner;

public class Login {
	private static String user = "";
	private static String password = "";
	private static String login[][] = { { "Machin", "123456" }, { "Martin", "456789" } };
	static Scanner sc = new Scanner(System.in);

	// Get user login.
	public static String getUser() {
		user = sc.nextLine();
		return "";
	}

	// Get user password.
	public static String getPassword() {
		password = sc.nextLine();
		return "";
	}

	public static void main(String[] args) {
		for (int i = 0; i < login.length; i++) {
			for (int j = 0; j < login[i].length; j++) {
				System.out.print(login[i][j]);
			}
			System.out.println();
		}
		boolean testLogin = true;
		// Verify login + password.
		do {
			System.out.println("Login = ");
			getUser();
			System.out.println(login[0][0]);
			System.out.println("MdP = ");
			getPassword();
			System.out.println(login[0][1]);

			for (int i = 0; i < login.length;) {
				if (user.equals(login[i][0]) && password.equals(login[i][1])) {
					System.out.println("Bonjour ");
					testLogin = false;
				}
				i++;
			}

		} while (testLogin);
		sc.close();
	}
}