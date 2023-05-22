package Teszt;

import java.time.LocalDate;
import java.util.Scanner;

import Card.Bank;
import Card.CreditCard;

public class CardTest {

	public static void main(String[] args) {
		CreditCard creditcard[] = new CreditCard[Beolvas(4)];
		
		creditcard[0] = new CreditCard("Kiss Tamas", LocalDate.of(2020, 04, 30), Bank.OTP, 150000, 100000);
		creditcard[1] = new CreditCard("Nagy Levente", LocalDate.of(2020, 05, 31), Bank.ERSTE, 100000);
		creditcard[2] = new CreditCard("Szabo Laszlo", LocalDate.of(2039, 3, 31), Bank.OTP, 200000, 100000);
		creditcard[3] = new CreditCard("Kovacs Edit", LocalDate.of(2020, 01, 31), Bank.CIB, 250000);
		
		for(CreditCard elem:creditcard) {
			System.out.println(elem);
		}
		System.out.println();
		
		System.out.println("1.Sikeresség:" + creditcard[0].Penzfelvet(280000) + " Egyenleg:" + creditcard[0].getEgyenleg() + " hitelkeret:" + creditcard[0].getHitelkeret());
		System.out.println("2.Sikeresség:" + creditcard[1].Penzfelvet(80000) + " Egyenleg:" + creditcard[1].getEgyenleg());
		System.out.println("3.Sikeresség:" + creditcard[2].Penzfelvet(50000) + " Egyenleg:" + creditcard[2].getEgyenleg() + " hitelkeret:" + creditcard[2].getHitelkeret());
		System.out.println("4.Sikeresség:" + creditcard[3].Penzfelvet(100000) + " Egyenleg:" + creditcard[3].getEgyenleg());
		
		System.out.println();
		int db=0;
		for(int i=0;i<4;i++) {
			if(creditcard[i].getBank() == Bank.CIB) {
				db++;
				//System.out.println(creditcard[i]);
			}
		}
		System.out.println("CIB bankosok:" + db + "db");
		
		
	}

	public static int Beolvas(int osszeg) {
		int szam=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			if(!sc.hasNextInt()) {
				System.out.println("Nem jo!");
				sc.next();
			}
			
			szam=sc.nextInt();
			
			if(szam != osszeg) {
				System.out.println("Nem jo!");
				sc.next();
			}
			
		}while(szam<1 || szam>10);
		
		return szam;
	}
}
