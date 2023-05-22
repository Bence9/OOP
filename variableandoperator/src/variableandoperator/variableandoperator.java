package variableandoperator;

public class variableandoperator {

	public static void main(String[] args) {
		//primitív változók
		
 	/*  byte a=100;
		short b=100;
		int c=100;
		long d=100;
		float e =12.5F;
		double f =12.5;
		boolean g=false;
		char h='A';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		int i=10;
		System.out.println(i);
		i=15;
		System.out.println(i); 	
		
		int apples=7;
		int pears=12;
		System.out.println(apples);
		System.out.println(pears);
		int fruits=apples+pears;
		System.out.println(fruits);
		
		int boxes=100;
		int sold=17;
		int remain= boxes-sold;
		System.out.println(remain);
		
		int i=17;
		int j=5;
		int k=i%j;
		System.out.println(k);
		
		boolean b1=true;
		boolean b2=false;
		boolean result=b1 && b2;
		System.out.println(result);
		boolean resalt = b1 || b2;
		System.out.println(resalt); */
		
/*		System.out.println(150%4);
		System.out.println(151%4);
		System.out.println(152%4);
		System.out.println(153%4);
		System.out.println(154%4);
		System.out.println("...");
		System.out.println(150 % 2 == 0);  */
		
		//referencia tipusu valtozók
		
/*		int number= (2 + 3) * 4;
		System.out.println(number);
		
		boolean b = number + 10 < 100;
		System.out.println(b);
		
		int i=100;
		//System.out.println(i++); -> 100
		//System.out.println(++i); ->101
		int j = i++ + ++i;
		// j = 100 + 102 = 202
		System.out.println(j);  */
		
	/*	boolean b1=true;
		boolean b2=false;
		boolean result = b1 && b2;
		System.out.println(result);
		
		int i=100;
		boolean finalresult= b1 && i++ <1000;
		//ha van benne false tovább nem értékeli ki,i=100 lesz
		System.out.println(finalresult);
		boolean finalre= b1 & i++ <1000;
		System.out.println(finalre);
		// így már i=101 lesz,mert & mindent kiértékel
		
		boolean res= b1 || b2;
		System.out.println(res);
		boolean resu=b1 || i++ <1000;
		System.out.println(resu);
		boolean finalresu=b1 | i++ <1000;
		System.out.println(resu);             */
		
		//kizáró vagy (XOR)
		//true ^ true -> false
		//true ^ false -> true
		//false ^ true -> true
		//false ^ false -> false
		
	/*	boolean b1=true;
		boolean b2=false;
		boolean b3=false;
		boolean result= b1 ^ b2 && b3;
		System.out.println(result);        */
		
	//	int i=56;
	//	System.out.println(i % 2 == 0 ? "páros" : "páratlan");
		// (feltétel ? igaz : hamis)
		
/*		int i=105;
		System.out.println(i <= 100 ? "kis szám" : "nagy szám");
		System.out.println(i == 100 ? "száz" : "nem száz");     */
		
/*		int[] numbers;
		numbers = new int[10];
		numbers[0] = 4;
		numbers[1] = 12;
		numbers[2] = 7;
		numbers[3] = -6;
		numbers[4] = 53;
		numbers[5] = 42;
		numbers[6] = 31;
		numbers[7] = 0;
		numbers[8] = -100;
		numbers[9] = 72;
		
		System.out.println(numbers[4]);
		System.out.println(Arrays.toString(numbers)); //kiír mindent   */
		
/*		int[][] numbers=new int[4][];
		int[] data1=new int[4];
		int [] data2=new int [7];
		int [] data3=new int [22];
		int [] data4=new int [3];
		numbers[0]=data1;
		numbers[1]=data2;
		numbers[2]=data3;
		numbers[3]=data4;
		//más oszlop méret
		numbers[1][2]= 42;
		System.out.println(numbers[1][2]);            */
		
		
	}

}
