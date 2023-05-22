package hanglemez;

public class futtathato {

	public static void main(String[] args) {
		Hanglemez a = new Hanglemez("eloado1","cim1",60);
		Hanglemez b = new Hanglemez("eloado2","cim2",50);
		Hanglemez c = new Hanglemez("eloado3","cim3",80);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println(a.HosszOsszehasonlito(b));
		System.out.println(a.Eload(b));
	}

}
