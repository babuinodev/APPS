package Aps;
public class Carro {
	private int id;
	private String nomedocarro;
	private String modelo;
	private int ano;
	private double preco;
	
	public Carro(int id,String nomedocarro, String modelo, int ano, double preco) {
		super();
		this.id = id;
		this.nomedocarro = nomedocarro;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	public int getid() {
		return id;
	}
	public String getNomedocarro() {
		return nomedocarro;
	}

	public String getModelo() {
		return modelo;
	}


	public int getAno() {
		return ano;
	}

	public double getPreco() {
		return preco;
	}

	 @Override
 public String toString(){
	 String res = "Carro\n";
	 res += "ID do funcionario: " + this.id + "\n";
	 res += "Nome do carro: " + this.nomedocarro + "\n";
	 res += "Modelo: " + this.modelo + "\n";
	 res += "Ano: " + this.ano + "\n";
	  res += "Preco: " + this.preco + "\n";
	 return res;
	 }
}

	
	
	
