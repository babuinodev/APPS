package Aps;


public class Funcionario {
private int id;
 private String nome;
 private double salario;


 public Funcionario(int id,String nome, double salario) {
	super();
	this.id= id;
	this.nome = nome;
	this.salario = salario;
	
}
 //getters
 public int getid() {return id;}
 public String getnome() {return nome;}
 public double getsalario() {return salario;}

 
 //setters
 public void setid(int id) {this.id = id;}
 public void setnome(String nome) {this.nome = nome;}
 public void setsalario(double salario) {this.salario = salario;}

 
 
 @Override
 public String toString(){
	 String res = "Vendedor\n";
	 res += "ID do funcionario: " + this.id + "\n";
	 res += "Nome do vendedor: " + this.nome + "\n";
	 res += "Salario: " + this.salario + "\n";
	 return res;
	 }
 
}
