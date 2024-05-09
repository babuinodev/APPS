package Aps;
import java.util.List;



public class TesteAcessoDadosload {

	public static void main(String[] args) {
		
		List<Carro> Carros = AcessoDados.loadCarros("file/carros.csv");
		
	
		for(Carro c: Carros)
			System.out.println(c);
		
			
		
		
	}

}

