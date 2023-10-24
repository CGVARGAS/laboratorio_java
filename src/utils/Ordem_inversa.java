package utils;

public class Ordem_inversa {
	private double n1, n2, inverso;
	
	
	
	public Ordem_inversa( ) {
		
	}
	
	public Ordem_inversa(double n1) {
		this.n1 = n1;
		
	}
	
	public double inversor() {
		n2 = n1;
		inverso = n2;
		n1 = inverso;
		return n1;	
	}

	
}
