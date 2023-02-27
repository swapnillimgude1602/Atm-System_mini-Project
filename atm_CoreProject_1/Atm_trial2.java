package atm_CoreProject_1;

import java.util.Scanner;

public class Atm_trial2 {
	static int acc_no;
	static String acc_hol_name, acc_type, bank;
	static double balance;
	static double amount;
	int p = 1234;
	static Scanner sc = new Scanner(System.in);

	static void disp() {
		System.out.println("Acc_name: Swapnil Maruti Limgude \t Acc No: 123456789");

	}

	static void acctype() {
		if ((acc_type.equalsIgnoreCase("Current"))) {
			balance = 5000;
		} else if ((acc_type.equalsIgnoreCase("Savings"))) {
			balance = 2000;
		} else {
			System.out.println("Invalid Account Type");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("\t\t****** ATM SYSTEM ******");
		System.out.println("\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Bank b = new Bank();
		int p = 1234;

		System.out.println("Enter Pin:");
		int pin = sc.nextInt();
		if (pin == p) {
			disp();

			while (true) {
				System.out.println("Choose Your Account Type:");
				System.out.println("\t Press 1: Savings.");
				System.out.println("\t Press 2: Current.");
				int ch = sc.nextInt();
				
				switch (ch) {
				case 1:
					acc_type = "savings";
					acctype();
					while (true) {
						System.out.println("\t Press 1: To Withdraw.");
						System.out.println("\t Press 2: To Deposit.");
						System.out.println("\t Press 3: To Check Balance.");
						System.out.println("\t Press 4: To Change Pin.");
						System.out.println("\t Press 5: To Exit.");

						System.out.println("Enter Your Choice: ");
						int choice = sc.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Enter The Amount You Want To Withdraw:");
							amount = sc.nextDouble();
							if (balance >= amount) {
								balance = balance - amount;
								System.out.println("=== Transaction Successfull ===");
							} else {
								System.out.println("***Insufficient Balance***");
							}
							System.out.println();
							break;

						case 2:
							System.out.println("Enter The Amount You Want To Deposit:");
							amount = sc.nextDouble();
							balance = amount + balance;
							System.out.println("=== Transaction Successfull ===");
							System.out.println();
							break;

						case 3:
							System.out.print("Account Balance:" + balance + "\n");
							break;
							
						case 4:
							System.out.println("Enter your Current Pin:");
							int op = sc.nextInt();
							if(p==op) {
								System.out.println("Enter your New Pin:");
								int np = sc.nextInt();
								p=np;
								System.out.println("Successfully Pin Changed");
							}
							else {
								System.out.println("Incorrect Current Pin");
							}

							break;
							
						case 5:
							System.exit(0);
							break;
						}
					}

				case 2:
					acc_type = "current";

					acctype();
					while (true) {
						System.out.println("\t Press 1: To Withdraw.");
						System.out.println("\t Press 2: To Deposit.");
						System.out.println("\t Press 3: To Check Balance.");
						System.out.println("\t Press 4: To Change Pin.");
						System.out.println("\t Press 5: To Exit.");

						System.out.println("Enter Your Choice: ");
						int choice = sc.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Enter The Amount You Want To Withdraw:");
							amount = sc.nextDouble();
							if (balance >= amount) {
								balance = balance - amount;
								System.out.println("=== Transaction Successfull ===");
							} else {
								System.out.println("***Insufficient Balance***");
							}
							System.out.println();
							break;

						case 2:
							System.out.println("Enter The Amount You Want To Deposit:");
							amount = sc.nextDouble();
							balance = amount + balance;
							System.out.println("=== Transaction Successfull ===");
							System.out.println();
							break;

						case 3:
							System.out.print("Account Balance:" + balance + "\n");
							break;

						case 4:
							System.out.println("Enter your Current Pin:");
							int op = sc.nextInt();
							if(p==op) {
								System.out.println("Enter your New Pin:");
								int np = sc.nextInt();
								p=np;
								System.out.println("Successfully Pin Changed");
							}
							else {
								System.out.println("Incorrect Current Pin");
							}

							break;
						case 5:
							System.exit(0);
							break;
						}
					}
				}
			}
		} else {
			System.out.println("===INVALID_PIN===");
		sc.close();
		}
	}
}
