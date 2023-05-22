package auto;

public class auto2 extends kocsi {

	auto2(String marka, String tipus, String uzemanyag, int loero, int ar, String szin) {
		super(marka, tipus, uzemanyag, loero, ar);
		this.szin=szin;
	}
	
	private String szin;
	
	public String getszin() {
		return szin;
	}
	
	public void setszin(String szin) 
	{
		this.szin=szin;
	}
	
	public String toString() {
		return  " \nmarka:"+getmarka() +
				" \ntipus:"+ gettipus() +
				" \nuzemanyag:"+getuzemanyag() + 
				" \nloero:" + getloero() +
				" \nar:" +  getar() +
				" \nszin:"+ getszin();
	}
}
