package testtomeg;

public class Adatok {

	public static void main(String[] args) {
		Szemely ember =new Szemely();
		ember.setNev("Pista");
		ember.setMagassag(1.60);
		ember.setSuly(64);
		
		System.out.println(ember.osszefuzes());
	}

}
