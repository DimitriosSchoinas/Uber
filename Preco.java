
public class Preco {
	
	
	
	private static int Tempo;
	private static int Distancia;
	private static int Tempo2;
	private static int Distancia2;
	
	
	public Preco(int TS, int T, int D) {
		
		
		Tempo = T*10;
		Distancia = D*80;
		Tempo2 = T*15;
		Distancia2 = D*120;
}
	
	public int PrecoX() {
		int precoX = Tempo + Distancia + 100;
		return precoX;
	}
	
	public int PrecoXL() {
		int precoXL = Tempo2 + Distancia2 + 150;
		return precoXL;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}