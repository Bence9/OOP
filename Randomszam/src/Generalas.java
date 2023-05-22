
public class Generalas {

	public static void main(String[] args) {
		int[] szam = new int[10];
		for(int i=0;i<10;i++) {
			szam[i] = (int) ((Math.random() * 10-1+1) + 1);
			System.out.println((i+1) + ".elem:" + szam[i]);
		}

	}

}
