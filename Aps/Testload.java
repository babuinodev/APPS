package Aps;

import java.util.List;

public class Testload {

public static void main(String[] args) {
		
		List<Funcionario> funcionarios = Acess.loadFuncionarios("file/Funcionarios.csv");
		
		
	
		for(Funcionario c: funcionarios)
			System.out.println(c);
} 
}