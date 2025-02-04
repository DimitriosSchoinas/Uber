import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int TS = in.nextInt();
		int T = in.nextInt();
		int D = in.nextInt();
		in.nextLine();
		Preco precoViagem1 = new Preco( TS,  T,  D);
		
		
		switch (TS) {
		case 1:
			int TaxaMinima = 250;
			int preco1 = precoViagem1.PrecoX();
			if(preco1 < TaxaMinima) {System.out.println(TaxaMinima);}
			else {System.out.println(preco1);}
			break;
		case 2:
			int TaxaMinima2 = 350;
			int preco2 = precoViagem1.PrecoXL();
			if(preco2 < TaxaMinima2) {System.out.println(TaxaMinima2);}
			else {System.out.println(preco2);}	
			break;
			
	}

}
}