package Aps;

import java.util.List;

public class Teste1 {

		public static void main(String[] args) {
			
			 List<Funcionario> funcionarios = Acess.loadFuncionarios("file/Funcionarios.csv");
			        for(Funcionario funcionario: funcionarios) {
			        	System.out.println(funcionario);
			        }
			       
					funcionarios.add(new Funcionario(12, "Pablo", 3520));
					
					
					Acess.saveCarros(funcionarios, "file/Funcionarios.csv");
				

	}

}
