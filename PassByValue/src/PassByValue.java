
public class PassByValue {

	public static void main(String[] args) {
		int test=42;
		System.out.println("test értéke: "+test);
		tryToModify(test);
		System.out.println("test értéke: "+test);
	}

		static void tryToModify(int alma) {
			alma=2010;
	}

}
