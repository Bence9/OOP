package adokedvezmeny;

public class ado_Csaladiadokedvezmeny extends ado_Adokedvezmeny {
	private int gyerekek_szama;
	private int kedvezmeny_merteke;
	private int[] tomb=new int[]{10000,17500,33000};
	
	ado_Csaladiadokedvezmeny(int gyerekek_szama,String tipus){
		super(tipus);
		this.gyerekek_szama=gyerekek_szama;
		if(gyerekek_szama==1) {
			kedvezmeny_merteke=tomb[0];
		}
		else if(gyerekek_szama==2) {
			kedvezmeny_merteke=tomb[1];
		}
		else if(gyerekek_szama>=3) {
			kedvezmeny_merteke=tomb[2];
		}
		else {
			System.out.println("Nem jó érték!");
		}
		
	}
	
	public int getgyerekek()
	{
		return gyerekek_szama;
	}
	
	public int getkedvezmeny()
	{
		return kedvezmeny_merteke;
	}
	
	public String toString() {
		int mertek=0;
		if(gyerekek_szama==1) {
			 mertek=tomb[0];
		}
		else if(gyerekek_szama==2) {
			mertek=tomb[1];
		}
		else if(gyerekek_szama>=3) {
			mertek=tomb[2];
		}
		
		return "A gyerekek száma:"+gyerekek_szama
		+"egy gyerekre jutó kedvezmény mértéke:"+ mertek
		+"a számított adókedvezmény mértéke:"+adokedvezmeny(gyerekek_szama);
	}
	
	public boolean hasonlit(ado_Csaladiadokedvezmeny kapott)
	{
		if(this.adokedvezmeny(this.gyerekek_szama)>kapott.adokedvezmeny(kapott.getgyerekek())) {
			return true;
		}
		return false;
	}

	public int adokedvezmeny(int gyerekek_szama) {
		if(gyerekek_szama==1) {
			return tomb[0];
		}
		else if(gyerekek_szama==2) {
			return tomb[1]*2;
		}
		else if(gyerekek_szama>=3) {
			return tomb[2]*gyerekek_szama;
		}
		return 0;
	}
}
