
public class fibonacci {

	public static void main(String[] args) {
		int elso=1;
		int masodik=1;
		int harmadik=0;
		
		for(int i=0;i<10;i++) {
			harmadik=elso+masodik;
			System.out.println(i+1 +"-edik elem: "+harmadik);
			elso=masodik;
			masodik=harmadik;
		}

	}

}
