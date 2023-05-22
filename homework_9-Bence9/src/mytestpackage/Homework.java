package mytestpackage;

import java.util.Scanner;

import homework.bookhierachy.EBook;

public class Homework {

	public static void main(String[] args) {
		int n = beolvas();
		EBook[] tomb = new EBook[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Adja meg a szerzot:");
			String author = sc.next();

			System.out.println("Adja meg a cimet: ");
			String title = sc.next();

			System.out.println("Adja meg az arat");
			int price = sc.nextInt();

			System.out.println("Adja meg az oldalszamot:");
			int pages = sc.nextInt();

			System.out.println("Adja meg a stílust:");
			String style = sc.next();
			

			System.out.println("Adja meg az elektronikus cimet:");
			String url = sc.next();
			
			

			tomb[i] = new EBook(author, title, price, pages, style, url);
		}
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
	}

	private static int beolvas() {

		int n = -1;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Kerem az e-konyvek szamat: ");

			while (!sc.hasNextInt()) {
				System.out.println("Nem szam!");
				sc.next();
			}

			n = sc.nextInt();
		} while (n < 1 || n > 10);

		return n;
	}

}