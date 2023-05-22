package adokedvezmeny;

public abstract class ado_Adokedvezmeny {
	private String tipus;
	
	ado_Adokedvezmeny(String tipus)
	{
		this.tipus = tipus;
	}
	
	public String gettipus()
	{
		return tipus;
	}
	
	public abstract int adokedvezmeny(int szam);
}
