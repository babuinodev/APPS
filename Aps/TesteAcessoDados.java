package Aps;
import java.util.List;



public class TesteAcessoDados {

	public static void main(String[] args) {
		
		List<Carro> Carros = AcessoDados.loadCarros("file/carros.csv");
		
        
        for(Carro Carro: Carros) {
        	System.out.println(Carro);
        	
        }
		
		Carros.add(new Carro(12, "gol", "turbo", 2012, 350000));
		
		
		System.out.println(Carros);
		
		AcessoDados.saveCarros(Carros, "file/carros.csv");
	}

}

