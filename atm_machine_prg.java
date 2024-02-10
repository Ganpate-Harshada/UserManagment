package project;

import java.util.Scanner;

class ATM {
	float Balance = 50000 ;
	int PIN = 5678;
	
	
	
	public void checkpin() {
		System.out.println("Enter Your Pin : ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		
		if(enterpin == PIN) {
			menu();
		}
		else {
			System.out.println("Enter a Valid PIN :");
		}
	}
	
	public void menu() {
		System.out.println("Enter Your Choice :");
		System.out.println("1. Check Balance");
		System.out.println("2. WithDraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		
		
		Scanner sc = new Scanner(System.in);
		
		int obj = sc.nextInt();
		
		if(obj == 1) {
			checkBalance();
		}
		else if(obj == 2) {
			withDrawMoney();
		}
		else if( obj == 3) {
			depositeMoney();
		}
		else if (obj == 4) {
			return;
		
		}
		else {
			System.out.println("enter a Valid Choice");
			
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance : " + Balance);
		menu();
	}
	
	public void withDrawMoney () {
		System.err.println("Enter Amount to WithDraw : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		if( amount > Balance ) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount ;
			System.out.println("Money WithDrawl Successful..!");
		}
		menu();
	}
	
	public void depositeMoney() {
		System.out.println("Enter the Amount : ");
		menu();
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount ;
		System.out.println(" Money Deposit Successfful..!");
		
	}
	
		}
	
	public class atm_machine_prg {

	public static void main(String[] args) {
		
		
		ATM obj = new ATM();
		obj.checkpin();

	}

}
