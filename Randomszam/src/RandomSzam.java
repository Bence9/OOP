
public class RandomSzam {

	public static void main(String[] args) {
		int szamok[] = new int[10];
		for(int i=0;i<10;i++) {
			szamok[i]=(int) ((Math.random()*50)+1);
		}

		for(int i=0;i<10;i++) {
			System.out.println(szamok[i]);
		}
		
		int paros[]=new int[10];
		for(int i=0;i<10;i++) {
			if(szamok[i]%2==0) {
				paros[i]=szamok[i];
			}else {
				paros[i]=0;
			}
		}
		
		int max=paros[0];
		for(int i=0;i<10;i++) {
			if(max<paros[i]) {
				max=paros[i];
			}
		}
		
		System.out.println("A legnagyobb paros szam:" + max);
		
	}

}
