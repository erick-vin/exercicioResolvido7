package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
			
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawlimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawlimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amountWithdraw = sc.nextDouble();
			acc.withdrawm(amountWithdraw);
			System.out.print("New Balance: " + acc.getBalance());
			
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();

	}

}
