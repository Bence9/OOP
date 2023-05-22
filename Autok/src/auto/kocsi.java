package auto;

public class kocsi {
		private String marka;
		private String tipus;
		private String uzemanyag;
		private int loero;
		private int ar;
		
		kocsi(String marka,String tipus,String uzemanyag,int loero,int ar)
		{
			this.marka= marka;
			this.tipus=tipus;
			this.uzemanyag=uzemanyag;
			this.loero=loero;
			this.ar=ar;
		}
		
		public String getmarka(){
			return marka;
		}
		
		public void setmarka(String marka) 
		{
			this.marka=marka;
		}
		
		public String gettipus(){
			return tipus;
		}
		
		public void settipus(String tipus)
		{
			this.tipus=tipus;
		}
		
		public String getuzemanyag(){
			return uzemanyag; 
		}
		
		public void setuzemanyag(String uzemanyag) 
		{
			this.uzemanyag=uzemanyag;
		}
		
		public int getloero(){
			return loero;
		}
		
		public void setloero(int loero) 
		{
			this.loero=loero;
		}
		
		public int getar(){
			return ar;
		}
		
		public void setar(int ar) 
		{
			this.ar=ar;
		}
		
}
