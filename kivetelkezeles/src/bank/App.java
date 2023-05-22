package bank;

import Exception.InsufficientFundsException;

public class App {

	public static void main(String[] args) {
		Bankszamla bankszamla = new Bankszamla("0011122");

		System.out.println(bankszamla);
		bankszamla.penzBerak(3000);
		
		System.out.println(bankszamla);

		try {
			bankszamla.penzKivesz(200);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}

		System.out.println(bankszamla);

		try {
			bankszamla.penzKivesz(5200);
		} catch (InsufficientFundsException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println(bankszamla);
		}
	}
}