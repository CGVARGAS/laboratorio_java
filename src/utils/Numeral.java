package utils;

public class Numeral {
	private int num;
	private int resp;
	
	//Construtor padrão
	public Numeral() {	
	}
	//construtor da classe
	public Numeral(int num) {
		this.num = num;
	}
	
	public int multiplica() {
		return resp = num * 2;
	}

	@Override
	public String toString() {
		return "\nResultado:\n num: " + num + ", resp: " + resp;
	}	
}
