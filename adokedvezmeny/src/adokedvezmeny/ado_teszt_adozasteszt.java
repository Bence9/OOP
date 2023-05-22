package adokedvezmeny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ado_teszt_adozasteszt{
	public static void main(String[] args) throws IOException {
		ado_Csaladiadokedvezmeny[] tomb=new ado_Csaladiadokedvezmeny[5];
		for(int i=0;i<5;i++) {
			System.out.println("Adja meg a gyerekek szamat:");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int gyerekek=Integer.parseInt(input.readLine());
			System.out.println("Adja meg a tipust:");
			BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
			String tipus=input2.readLine();
			tomb[i]=new ado_Csaladiadokedvezmeny(gyerekek,tipus);
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(tomb[i]);
		}
		
		
		int maximum=legmagasabb(tomb);
		System.out.println("A legmagasabb ertek:" + maximum);
		
		int db=darabszam(tomb);
		System.out.println("3 es tobb gyerek utan igenybe vett adokedvezmeny darabszama:" + db);
	}
		
		
	public static int legmagasabb(ado_Csaladiadokedvezmeny[] tomb) {
		int max = tomb[0].adokedvezmeny(tomb[0].getgyerekek());
		for(int i=0;i<5;i++) {
			if(max<tomb[i].adokedvezmeny(tomb[i].getgyerekek())) {
				max=tomb[i].adokedvezmeny(tomb[i].getgyerekek());
			}
		}
		return max;
	}
	
	public static int darabszam(ado_Csaladiadokedvezmeny[] tomb) {
		int db=0;
		for(int i=0;i<5;i++) {
			if(tomb[i].getgyerekek()>=3) {
				db++;
			}
		}
		return db;
	}
	
}
